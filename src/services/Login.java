package services;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;






import javax.ws.rs.core.MediaType;

import com.sun.media.jfxmedia.Media;

import bean.Korisnik;
import bean.TipKorisnika;

@Path("/login")
public class Login {

	@Context
	HttpServletRequest request;
	
	@Context
	ServletContext context;

	@POST
	@Path("/add/")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String dodavanjeKorisnika(Korisnik k){
		
		HashMap<String, Korisnik> korisnici = (HashMap<String, Korisnik>) context.getAttribute("korisnici");
		
		if(korisnici.get(k).getUsername() == null ){
			k.setUloga(TipKorisnika.NORMAL);
			k.setDatumRegistracije(new Date().getTime());	
			k.setPodforum(new HashSet<String>());
			k.setSnimljenaTema(new HashSet<String>());
			k.setSnimljeniKomentar(new HashSet<String>());
			
			korisnici.put(k.getUsername(), k);	//Kacimo na kontekst za korisnika
			return "prijavi";
			
		}else{
			return "Korisnik vec postoi";
		}	
		
	}// kraj metode
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String logIn(Korisnik k){
		
		HashMap<String, Korisnik> korisnici = (HashMap<String, Korisnik>) context.getAttribute("korisnici");
		Korisnik u = korisnici.get(k.getUsername());
		if(u == null ){
			return "Wrong username and/or password.";
		}
		if(!u.getLozinka().equals(k.getLozinka())){
			return "Wrong username and/or password.";
		}
		request.getSession().setAttribute("korisnik", u);	//Korisnik
		return "prijavi";
		
	}
	
	@GET
	@PathParam("/provera/{username}")
	public boolean provera(@PathParam("username") String username ){
		HashMap<String, Korisnik> korisnici = (HashMap<String, Korisnik>) context.getAttribute("korisnici");
		
		if(korisnici.get(username) != null){
			return true;
		}else{
			return false;
		}
		
	}
	@POST
	@Path("/logout")
	public void logOut(){
		request.getSession().invalidate();
	}
	
	
}

package bean;

import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Date;


public class Korisnik implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String username;	//id
	private String lozinka;
	private String ime;
	private String prezime;
	private TipKorisnika uloga;
	private String brTelefona;
	private String email;
	private long datumRegistracije;
	
	//=============================
	private HashMap<String, String> like;
	private HashSet<String> podforum;	//spisak pracenih podforuma
	private HashSet<String> snimljenaTema;			//spisak praceni(snimljenih) tema
	private HashSet<String> snimljeniKomentar;
	
	public Korisnik(){
		this.username = "";
		this.lozinka = "";
		this.ime = "";
		this.prezime = "";
		this.uloga = TipKorisnika.NORMAL;
		this.brTelefona = "";
		this.email = "";
		this.datumRegistracije = new Date().getTime();
		
		like = new HashMap<>();
		podforum = new HashSet<>();
		snimljenaTema = new HashSet<>();
		snimljeniKomentar = new HashSet<>();
		
	}
	
	
	
	public Korisnik(String username, String lozinka, String ime,
			String prezime, TipKorisnika uloga, String brTelefona,
			String email) {
		super();
		this.username = username;
		this.lozinka = lozinka;
		this.ime = ime;
		this.prezime = prezime;
		this.uloga = uloga;
		this.brTelefona = brTelefona;
		this.email = email;
	    datumRegistracije = new Date().getTime();
		
		like = new HashMap<>();
		podforum = new HashSet<>();
		snimljenaTema = new HashSet<>();
		snimljeniKomentar = new HashSet<>();
		
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getLozinka() {
		return lozinka;
	}



	public void setLozinka(String lozinka) {
		this.lozinka = lozinka;
	}



	public String getIme() {
		return ime;
	}



	public void setIme(String ime) {
		this.ime = ime;
	}



	public String getPrezime() {
		return prezime;
	}



	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}



	public TipKorisnika getUloga() {
		return uloga;
	}



	public void setUloga(TipKorisnika uloga) {
		this.uloga = uloga;
	}



	public String getBrTelefona() {
		return brTelefona;
	}



	public void setBrTelefona(String brTelefona) {
		this.brTelefona = brTelefona;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public long getDatumRegistracije() {
		return datumRegistracije;
	}



	public void setDatumRegistracije(long datumRegistracije) {
		this.datumRegistracije = datumRegistracije;
	}



	public HashMap<String, String> getLike() {
		return like;
	}



	public void setLike(HashMap<String, String> like) {
		this.like = like;
	}



	public HashSet<String> getPodforum() {
		return podforum;
	}



	public void setPodforum(HashSet<String> podforum) {
		this.podforum = podforum;
	}



	public HashSet<String> getSnimljenaTema() {
		return snimljenaTema;
	}



	public void setSnimljenaTema(HashSet<String> snimljenaTema) {
		this.snimljenaTema = snimljenaTema;
	}



	public HashSet<String> getSnimljeniKomentar() {
		return snimljeniKomentar;
	}



	public void setSnimljeniKomentar(HashSet<String> snimljeniKomentar) {
		this.snimljeniKomentar = snimljeniKomentar;
	}

	
}

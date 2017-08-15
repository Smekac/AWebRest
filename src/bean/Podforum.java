package bean;

import java.io.Serializable;
import java.util.ArrayList;


public class Podforum implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String ime;
	private String opis;
	private String ikonica;
	private String spisakPravila;
	private String odgovorniModerator;
	private ArrayList<String> spisakModeratora;
	
	public Podforum(String ime, String opis, String ikonica,
			String spisakPravila, String odgovorniModerator,
			ArrayList<String> spisakModeratora) {
		super();
		this.ime = ime;
		this.opis = opis;
		this.ikonica = ikonica;
		this.spisakPravila = spisakPravila;
		this.odgovorniModerator = odgovorniModerator;
		this.spisakModeratora = spisakModeratora;
	}
	
	public Podforum(){
		this.ime = "";
		this.opis = "";
		this.ikonica = "";
		this.spisakPravila = "";
		this.odgovorniModerator = "";
		this.spisakModeratora = new ArrayList<>();
		
	}
	
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		this.opis = opis;
	}
	public String getIkonica() {
		return ikonica;
	}
	public void setIkonica(String ikonica) {
		this.ikonica = ikonica;
	}
	public String getSpisakPravila() {
		return spisakPravila;
	}
	public void setSpisakPravila(String spisakPravila) {
		this.spisakPravila = spisakPravila;
	}
	public String getOdgovorniModerator() {
		return odgovorniModerator;
	}
	public void setOdgovorniModerator(String odgovorniModerator) {
		this.odgovorniModerator = odgovorniModerator;
	}
	public ArrayList<String> getSpisakModeratora() {
		return spisakModeratora;
	}
	public void setSpisakModeratora(ArrayList<String> spisakModeratora) {
		this.spisakModeratora = spisakModeratora;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}

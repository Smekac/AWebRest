package bean;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.UUID;



public class SMS implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String sadrzajPoruke;
	private boolean procitanaOznaka;
	private String prijavi;
	private String reportedType;
	private long date;
	private String id;
	private String posiljalac;
	private HashSet<String> primalac;
	
	public SMS(){
		this.sadrzajPoruke = "";
		this.procitanaOznaka = false;
		this.prijavi = "";
		this.reportedType = "";
		this.date = new Date().getTime();
		this.id = UUID.randomUUID().toString();		//
		this.posiljalac = "";
		this.primalac = new HashSet<>();
	}
	
	public SMS(String sadrzajPoruke, String posiljalac,
			HashSet<String> primalac) {
		super();
		this.sadrzajPoruke = sadrzajPoruke;
		this.procitanaOznaka = false;
		this.prijavi = "";
		this.reportedType = "";
		this.date = new Date().getTime();
		this.id = UUID.randomUUID().toString();		//
		this.posiljalac = posiljalac;
		this.primalac = primalac;
	}

	public String getSadrzajPoruke() {
		return sadrzajPoruke;
	}

	public void setSadrzajPoruke(String sadrzajPoruke) {
		this.sadrzajPoruke = sadrzajPoruke;
	}

	public boolean isProcitanaOznaka() {
		return procitanaOznaka;
	}

	public void setProcitanaOznaka(boolean procitanaOznaka) {
		this.procitanaOznaka = procitanaOznaka;
	}

	public String getPrijavi() {
		return prijavi;
	}

	public void setPrijavi(String prijavi) {
		this.prijavi = prijavi;
	}

	public String getReportedType() {
		return reportedType;
	}

	public void setReportedType(String reportedType) {
		this.reportedType = reportedType;
	}

	public long getDate() {
		return date;
	}

	public void setDate(long date) {
		this.date = date;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPosiljalac() {
		return posiljalac;
	}

	public void setPosiljalac(String posiljalac) {
		this.posiljalac = posiljalac;
	}

	public HashSet<String> getPrimalac() {
		return primalac;
	}

	public void setPrimalac(HashSet<String> primalac) {
		this.primalac = primalac;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}
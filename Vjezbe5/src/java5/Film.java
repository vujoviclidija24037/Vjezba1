package java5;

public class Film {
private String naziv;
private String zanr;
private int ocjena;
private double trajanjeMin;


public Film(String naziv, String zanr, int ocjena, double trajanjeMin) {
	super();
	this.naziv = naziv;
	this.zanr = zanr;
	setOcjena(ocjena);
	this.trajanjeMin = trajanjeMin;
}


public Film() {
	this.naziv = "Nepoznat film";
    this.zanr = "Nepoznat zanr";
    this.ocjena = 0;
    this.trajanjeMin = 0;
}


public String getNaziv() {
	return naziv;
}


public void setNaziv(String naziv) {
	this.naziv = naziv;
}


public String getZanr() {
	return zanr;
}


public void setZanr(String zanr) {
	this.zanr = zanr;
}


public int getOcjena() {
	return ocjena;
}


public void setOcjena(int ocjena) {
	if(ocjena>=0  && ocjena <=10) {
		this.ocjena=ocjena;
	}
	System.out.println("Ocjena mora biti u rasponu od 0-10");
}


public double getTrajanjeMin() {
	return trajanjeMin;
}


public void setTrajanjeMin(double trajanjeMin) {
	this.trajanjeMin = trajanjeMin;
}


public void info() {
	System.out.println("Film [naziv=" + naziv + ", zanr=" + zanr + ", ocjena=" + ocjena + ", trajanjeMin=" + trajanjeMin + "]");
}










}




package java5;

public class Destinacija {
	private String ime;
	private String drzava;
	private int ocjena;
	private double udaljenost;
	private int brojPosjetioca;
	
	
	public Destinacija(String ime, String drzava, int ocjena, double udaljenost, int brojPosjetioca) {
		super();
		this.ime = ime;
		this.drzava = drzava;
		setOcjena(ocjena);
		this.udaljenost = udaljenost;
		this.brojPosjetioca = brojPosjetioca;
	}


	public String getIme() {
		return ime;
	}


	public void setIme(String ime) {
		this.ime = ime;
	}


	public String getDrzava() {
		return drzava;
	}


	public void setDrzava(String drzava) {
		this.drzava = drzava;
	}


	public int getOcjena() {
		return ocjena;
	}


	public void setOcjena(int ocjena) {
		if(ocjena>=0 && ocjena<=10) {
			this.ocjena=ocjena;
		}else {
			System.out.println("Ocjena mora biti u intervalu od nule do desetke");
		}
		
	}


	public double getUdaljenost() {
		return udaljenost;
	}


	public void setUdaljenost(double udaljenost) {
		this.udaljenost = udaljenost;
	}


	public int getBrojPosjetioca() {
		return brojPosjetioca;
	}


	public void setBrojPosjetioca(int brojPosjetioca) {
		this.brojPosjetioca = brojPosjetioca;
	}


	public void info() {
		System.out.println( "Destinacija [ime=" + ime + ", drzava=" + drzava + ", ocjena=" + ocjena + ", udaljenost=" + udaljenost
				+ ", brojPosjetioca=" + brojPosjetioca + "]");
	}
	
	
	
	

}

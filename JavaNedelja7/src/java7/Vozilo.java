package java7;
//sve prolazimo ovim zadatkom,ucitavanje i ispis iz fajla za kolkvijum isto,kad imamo static ne moramo da 
//pravimo instancu nego pozivamo preko klase
public abstract class Vozilo {
	private String id;
	private double maxBrzina;
	
	
	
	
	
	public Vozilo(String id, double maxBrzina) {
	
		this.id = id;
		this.maxBrzina = maxBrzina;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public double getMaxBrzina() {
		return maxBrzina;
	}


	public void setMaxBrzina(double maxBrzina) {
		this.maxBrzina = maxBrzina;
	}


	public void info() {
		System.out.println ( "Vozilo [id=" + id + ", maxBrzina=" + maxBrzina + "]");
	}
	
	
	public abstract double izracunajVrijemeDostave(double udaljenostKm);
	
	
	}




package Java33;

public class Transakcija {
	private double iznos;
	private String tip;
	private String opis;
	
	public Transakcija(double iznos, String tip, String opis) {
		super();
		this.iznos = iznos;
		this.tip = tip;
		this.opis = opis;
	}

	public double getIznos() {
		return iznos;
	}

	public void setIznos(double iznos) {
		if(iznos<0) {
	System.out.println("Iznos ne moze biti negativan!");
} else {
		this.iznos = iznos;
	} }

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}
	
	//metoda
	public boolean jeUplata() {
		return tip.equals("uplata");
	}
	
	
	

}

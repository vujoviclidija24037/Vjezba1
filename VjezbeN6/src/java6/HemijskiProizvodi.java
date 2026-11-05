package java6;

public class HemijskiProizvodi extends Proizvod{
	
	private double tempraturaSkladistenja;
	private boolean zapaljivo;
	
	
	public HemijskiProizvodi(String opisProizvoda, String barkod, String zemljaProizvodnje, int godinaProizvodnje,
			double uvoznaCijena, double tempraturaSkladistenja, boolean zapaljivo) {
		super(opisProizvoda, barkod, zemljaProizvodnje, godinaProizvodnje, uvoznaCijena);
		this.tempraturaSkladistenja = tempraturaSkladistenja;
		this.zapaljivo = zapaljivo;
	}


	public double getTempraturaSkladistenja() {
		return tempraturaSkladistenja;
	}


	public void setTempraturaSkladistenja(double tempraturaSkladistenja) {
		this.tempraturaSkladistenja = tempraturaSkladistenja;
	}


	public boolean isZapaljivo() {
		return zapaljivo;
	}


	public void setZapaljivo(boolean zapaljivo) {
		this.zapaljivo = zapaljivo;
	}


	public void infoOHemijskihproizvodima() {
		System.out.println("HemijskiProizvodi [tempraturaSkladistenja=" + tempraturaSkladistenja + ", zapaljivo=" + zapaljivo + "]");
	}
	
	@Override
	public double izracunajCijenu() {
		if(zapaljivo) {
		return 	getUvoznaCijena()*1.125;
			
		} else {
			return getUvoznaCijena()*1.10;
		}
	}
	
	
	
	
	
	
	

}

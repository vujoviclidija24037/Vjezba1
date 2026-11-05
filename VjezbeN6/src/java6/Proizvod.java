package java6;

public abstract class Proizvod {
	private String opisProizvoda;
	private String barkod;
	private String zemljaProizvodnje;
	private int godinaProizvodnje;
	private double uvoznaCijena;
	
	
	public Proizvod(String opisProizvoda, String barkod, String zemljaProizvodnje, int godinaProizvodnje,
			double uvoznaCijena) {
		super();
		this.opisProizvoda = opisProizvoda;
		this.barkod = barkod;
		this.zemljaProizvodnje = zemljaProizvodnje;
		this.godinaProizvodnje = godinaProizvodnje;
		this.uvoznaCijena = uvoznaCijena;
	}


	public String getOpisProizvoda() {
		return opisProizvoda;
	}


	public void setOpisProizvoda(String opisProizvoda) {
		this.opisProizvoda = opisProizvoda;
	}


	public String getBarkod() {
		return barkod;
	}


	public void setBarkod(String barkod) {
		this.barkod = barkod;
	}


	public String getZemljaProizvodnje() {
		return zemljaProizvodnje;
	}


	public void setZemljaProizvodnje(String zemljaProizvodnje) {
		this.zemljaProizvodnje = zemljaProizvodnje;
	}


	public int getGodinaProizvodnje() {
		return godinaProizvodnje;
	}


	public void setGodinaProizvodnje(int godinaProizvodnje) {
		this.godinaProizvodnje = godinaProizvodnje;
	}


	public double getUvoznaCijena() {
		return uvoznaCijena;
	}


	public void setUvoznaCijena(double uvoznaCijena) {
		this.uvoznaCijena = uvoznaCijena;
	}
	
	
	public abstract double izracunajCijenu();


	public void prikaziInformacije() {
		System.out.println( "Proizvod [opisProizvoda=" + opisProizvoda + ", barkod=" + barkod + ", zemljaProizvodnje="
				+ zemljaProizvodnje + ", godinaProizvodnje=" + godinaProizvodnje + ", uvoznaCijena=" + uvoznaCijena
				+ "]");
	}


	
	
		
	}
	
	
	
	


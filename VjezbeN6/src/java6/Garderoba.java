package java6;

public class Garderoba extends Proizvod {
	private String materijalProizvodnje;
	private boolean zapaljivoDaNe;
	
	
	public Garderoba(String opisProizvoda, String barkod, String zemljaProizvodnje, int godinaProizvodnje,
			double uvoznaCijena, String materijalProizvodnje, boolean zapaljivoDaNe) {
		super(opisProizvoda, barkod, zemljaProizvodnje, godinaProizvodnje, uvoznaCijena);
		this.materijalProizvodnje = materijalProizvodnje;
		this.zapaljivoDaNe = zapaljivoDaNe;
	}

	
	

	public String getMaterijalProizvodnje() {
		return materijalProizvodnje;
	}


	public void setMaterijalProizvodnje(String materijalProizvodnje) {
		this.materijalProizvodnje = materijalProizvodnje;
	}


	public boolean isZapaljivoDaNe() {
		return zapaljivoDaNe;
	}


	public void setZapaljivoDaNe(boolean zapaljivoDaNe) {
		this.zapaljivoDaNe = zapaljivoDaNe;
	}
	
	
	@Override
	public double izracunajCijenu() {
		
	
	return getUvoznaCijena() * 1.05;
	

	}
}

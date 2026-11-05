package java6;

import java.time.LocalDate;

public class Hrana extends Proizvod {
	
	private int brojKalorija;
	private LocalDate datum;
	
	
	public Hrana(String opisProizvoda, String barkod, String zemljaProizvodnje, int godinaProizvodnje,
			double uvoznaCijena, int brojKalorija, LocalDate datum) {
		super(opisProizvoda, barkod, zemljaProizvodnje, godinaProizvodnje, uvoznaCijena);
		this.brojKalorija = brojKalorija;
		this.datum = datum;
	}


	public int getBrojKalorija() {
		return brojKalorija;
	}


	public void setBrojKalorija(int brojKalorija) {
		this.brojKalorija = brojKalorija;
	}


	public LocalDate getDatum() {
		return datum;
	}


	public void setDatum(LocalDate datum) {
		this.datum = datum;
	}


	@Override
	public String toString() {
		return "Hrana [brojKalorija=" + brojKalorija + ", datum=" + datum + "]";
	}
	
	@Override
	public double izracunajCijenu() {

	    if (datum.isBefore(LocalDate.now().plusMonths(6))) {
	        return getUvoznaCijena() * 1.05;
	    } else {
	        return getUvoznaCijena() * 1.10;
	    }
	}
	
	

}

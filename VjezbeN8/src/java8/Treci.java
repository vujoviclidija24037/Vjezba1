package java8;

import java.util.ArrayList;

public class Treci {
	
	private String oznaka;
	private String sifratermina;
	private String datumVrijemeTermina;
	private String oznakaSale;
	private int brojPrijavljenihStudenata;
	private String nazivPredmeta;
	
	
	public Treci(String oznaka, String sifratermina, String datumVrijemeTermina, String oznakaSale,
			int brojPrijavljenihStudenata) {
		super();
		this.oznaka = oznaka;
		this.sifratermina = sifratermina;
		this.datumVrijemeTermina = datumVrijemeTermina;
		this.oznakaSale = oznakaSale;
		this.brojPrijavljenihStudenata = brojPrijavljenihStudenata;
	}


	public String getOznaka() {
		return oznaka;
	}


	public void setOznaka(String oznaka) {
		this.oznaka = oznaka;
	}


	public String getSifratermina() {
		return sifratermina;
	}


	public void setSifratermina(String sifratermina) {
		this.sifratermina = sifratermina;
	}


	public String getDatumVrijemeTermina() {
		return datumVrijemeTermina;
	}


	public void setDatumVrijemeTermina(String datumVrijemeTermina) {
		this.datumVrijemeTermina = datumVrijemeTermina;
	}


	public String getOznakaSale() {
		return oznakaSale;
	}


	public void setOznakaSale(String oznakaSale) {
		this.oznakaSale = oznakaSale;
	}


	public int getBrojPrijavljenihStudenata() {
		return brojPrijavljenihStudenata;
	}


	public void setBrojPrijavljenihStudenata(int brojPrijavljenihStudenata) {
		this.brojPrijavljenihStudenata = brojPrijavljenihStudenata;
	}


	@Override
	public String toString() {
		return "Treci [oznaka=" + oznaka + ", sifratermina=" + sifratermina + ", datumVrijemeTermina="
				+ datumVrijemeTermina + ", oznakaSale=" + oznakaSale + ", brojPrijavljenihStudenata="
				+ brojPrijavljenihStudenata + "]";
	}
	
	
	//na osnovu sifre termina,iz niza ispitnih termina,pronaci i vratiti salu u kojoj se ispit odrzava
	
	//staticka metoda koja ce za zadati naziv predmeta izracunati ukupni broj prijavljenih studenata na svim ispitnim terminima tog predmeta,metodi se prosledjuje niz ispitnih termina i naziv predmeta 
	
	
	public static String nadjiSalu(ArrayList<Treci>lista,String sifratermina) {
		String out="";
		
	for(Treci z:lista) {
		if(z.getSifratermina().equals(sifratermina))
			return z.getOznakaSale();
	}
		return out;
		
		
		
		
	}
	
	public static int nadjiBrojPrijavljenihStudenata(ArrayList<Treci>lista,String nazivPredmeta) {
		int out=0;
		
	for(Treci z1:lista) {
		if(z1.getNazivPredmeta().equals(nazivPredmeta))
			out++;
	}
		return out;
	

}


	private Object getNazivPredmeta() {
		// TODO Auto-generated method stub
		return null;
	}
}



	
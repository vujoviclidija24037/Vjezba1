package Java4;

import java.util.ArrayList;

public class Auto {
	
	private String markaAuta;
	private int godisteAuta;
	private int snagaAuta;
	private boolean prodato;
	private double kubikazaMotora;
	private boolean registrovan;
	
	
	private static int brojProdatih=0;
	
	
	public Auto(String markaAuta, int godisteAuta, int snagaAuta, boolean prodato, double kubikazaMotora,
			boolean registrovan) {
		super();
		this.markaAuta = markaAuta;
		this.godisteAuta = godisteAuta;
		this.snagaAuta = snagaAuta;
		this.prodato = prodato;
		this.kubikazaMotora = kubikazaMotora;
		this.registrovan = registrovan;
	}


	public String getMarkaAuta() {
		return markaAuta;
	}


	public void setMarkaAuta(String markaAuta) {
		this.markaAuta = markaAuta;
	}


	public int getGodisteAuta() {
		return godisteAuta;
	}


	public void setGodisteAuta(int godisteAuta) {
		if(godisteAuta < 1885) {
			this.registrovan=false;
		} else {
		this.godisteAuta = godisteAuta;
	}
		if(prodato) {
			brojProdatih++;
			
		}

	}
	
	public int getSnagaAuta() {
		return snagaAuta;
	}


	public void setSnagaAuta(int snagaAuta) {
		this.snagaAuta = snagaAuta;
	}


	public boolean isProdato() {
		return prodato;
	}


	public void setProdato(boolean prodato) {
		this.prodato = prodato;
	}


	public double getKubikazaMotora() {
		return kubikazaMotora;
	}


	public void setKubikazaMotora(double kubikazaMotora) {
		this.kubikazaMotora = kubikazaMotora;
	}


	public boolean isRegistrovan() {
		return registrovan;
	}


	public void setRegistrovan(boolean registrovan) {
		if(this.godisteAuta<1985) {
			this.registrovan=false;
		}	else {
	
		this.registrovan = registrovan;
	} }


public static int  getBrojProdatih() {
	return brojProdatih;
}




@Override
public String toString() {
	String podaci = "Marka: " + markaAuta + ", godiste: " + godisteAuta
			+ ", snaga: " + snagaAuta + " kW, kubikaza: " + kubikazaMotora
			+ ", prodato: ";
	if (prodato) {
		podaci += "da";
	} else {
		podaci += "ne";
	}
	podaci += ", registrovan: ";
	if (registrovan) {
		podaci += "da";
	} else {
		podaci += "ne";
	}
	return podaci;
}

	
	
	

	
public static ArrayList<Auto> autaZaRegistraciju(ArrayList<Auto> auta) {
	ArrayList<Auto> rezultat = new ArrayList<Auto>();

	for (int i = 0; i < auta.size(); i++) {
		Auto a = auta.get(i);
		if (a.getGodisteAuta() >= 1985 && !a.isRegistrovan()) {
			rezultat.add(a);
		}
	}

	return rezultat;
}


private static double koeficijentGodista(int godiste) {
	if (godiste >= 1985 && godiste <= 2000) {
		return 3.0;
	} else if (godiste >= 2001 && godiste <= 2010) {
		return 2.0;
	} else {
		return 1.5;
	}
}

public static double iznosRegistracije(ArrayList<Auto> auta) {
	double suma = 0;

	for (int i = 0; i < auta.size(); i++) {
		Auto a = auta.get(i);
		if (a.getGodisteAuta() >= 1985) {
			suma += koeficijentGodista(a.getGodisteAuta()) * a.getKubikazaMotora() * a.getSnagaAuta();
		}
	}

	return suma;
}

}





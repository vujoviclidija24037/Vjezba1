package Java3;

public class Zaposleni {
	private String ime;
    private String prezime;
    private int godine;
    private int godineStaza;
    private double plata;
    
    
    //kontruktor
    
	public Zaposleni(String ime, String prezime, int godine, int godineStaza, double plata) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.godine = godine;
		this.godineStaza = godineStaza;
		this.plata = plata;
	}
	//getteri i setteri

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public int getGodine() {
		return godine;
	}

	public void setGodine(int godine) {
		this.godine = godine;
	}

	public int getGodineStaza() {
		return godineStaza;
	}

	public void setGodineStaza(int godineStaza) {
		this.godineStaza = godineStaza;
	}

	public double getPlata() {
		return plata;
	}

	public void setPlata(double plata) {
		this.plata = plata;
	}
	
	//metoda za ispisivanje zaposlenih
	public void ispisi() {
		System.out.println(ime + " " + prezime + " " + godineStaza);
    }
//testiranje getera i setera
	Zaposleni z1=new Zaposleni("Lidija"," Vujovic",21,1,1000);
	Zaposleni z2=new Zaposleni("Ana"," Simovic",21,3,1200);
	Zaposleni z3=new Zaposleni("Jovana"," Vujovic",28,1,1000);
	
	// provjera iznosa plate 
	public void provjeriPlatu() {
        if (plata < 800 && godineStaza > 10) {
            plata = plata * 1.06;
        }
    }
	
	
	
}

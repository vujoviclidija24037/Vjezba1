package Java3;

public class Televizor {

    private int brojKanala = 1;
    private String nazivKanala = "";
    private int jacinaTona = 0;
    //konstruktor,geteri,seteri
	public Televizor(int brojKanala, String nazivKanala, int jacinaTona) {
		super();
		this.brojKanala = brojKanala;
		this.nazivKanala = nazivKanala;
		this.jacinaTona = jacinaTona;
	}
	
   
  
 
	public int getBrojKanala() {
		return brojKanala;
	}

	public void setBrojKanala(int brojKanala) {
        if (brojKanala >= 1) {
            this.brojKanala = brojKanala;
        } else {
            System.out.println("Broj kanala mora biti veci ili jednak 1.");
        }
    }
	

	public String getNazivKanala() {
		return nazivKanala;
	}

	public void setJacinaTona1(int jacinaTona) {
        if (jacinaTona >= 0 && jacinaTona <= 10) {
            this.jacinaTona = jacinaTona;
        } else {
            System.out.println("Jacina tona mora biti izmedju 0 i 10.");
        }
    }
	public int getJacinaTona() {
		return jacinaTona;
	}

	//metoda za jacinu tona 
	
	public void pojacajTon() {
        if (jacinaTona < 10) {
            jacinaTona++;
        } else {
            System.out.println("Ton je vec na maksimumu (10).");
        }
        }
        //metoda za stampu 
         public void stampa() {
        System.out.println("Broj kanala: " + this.brojKanala);
        System.out.println("Naziv kanala: " + this.nazivKanala);
        System.out.println("Jacina tona: " + this.jacinaTona);
    }
 
        
    }
	
	
 

    
    
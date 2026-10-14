package Java4;


public class AnalizaNiza {

	private int [] niz; //atribut
	
	//kontruktor

	public AnalizaNiza(int[] niz) {
	
		this.niz = niz;
		
	}
	
	public double prosjekParniPozitivni() {
		double suma=0;
		double brojac=0;
		
		
		for (int i = 0; i < this.niz.length; i++) {
			if(this.niz[i]>0 && this.niz[i]% 2 == 0) {
				suma=suma+niz[i];
				brojac++;
				
				
			}
			
			
		}
		if(brojac == 0) {
			return 0;
			
		}
		return suma /brojac; 
	}
	
	public static void main(String[] args) {
		
		int duzinaNiza=10;
		int noviNiz[]=new int[duzinaNiza];
		
		for (int i = 0; i < duzinaNiza; i++) {
            noviNiz[i] = 2;
		}
		
		
		AnalizaNiza niz2= new AnalizaNiza (noviNiz);
		
		double rez= niz2.prosjekParniPozitivni();
		
		System.out.println(rez);
            
	}
	
	

}

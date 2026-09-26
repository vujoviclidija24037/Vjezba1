package Java2;
import java.util.Scanner;
//funkcija za stepenovanje bilo kojeg broja 


public class Stepen {
	
	public static int stepen(int x, int n) {
		
		int rezultat = 1;
		
		for( int i = 0; i<n;i++) {
			rezultat= rezultat * x;
			
			
		}
		return rezultat;
	}
		
		public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Unesite osnovu: ");
	        double osnova = sc.nextDouble();

	        System.out.print("Unesite izložilac (cijeli broj): ");
	        int izlozilac = sc.nextInt();

	        System.out.println(osnova + " na " + izlozilac + " = " + stepen((int) osnova, izlozilac));
	    }
	} 
		
	



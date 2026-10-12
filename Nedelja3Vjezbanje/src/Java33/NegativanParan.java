package Java33;
import java.util.Scanner;

	public class NegativanParan {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Unesite dužinu niza: ");
	        int n = sc.nextInt();

	        int[] niz = new int[n];

	        // Unos elemenata
	        for (int i = 0; i < n; i++) {
	            System.out.print("Unesite element " + (i + 1) + ": ");
	            niz[i] = sc.nextInt();
	        }

	        // Ispis parnih negativnih
	        System.out.println("Parni negativni elementi:");
	        for (int i = 0; i < n; i++) {
	            if (niz[i] < 0 && niz[i] % 2 == 0) {
	                System.out.println(niz[i]);
	            }
	        }

	        sc.close();
	    }
	}

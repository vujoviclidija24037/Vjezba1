package Java1;

import java.util.Scanner;

public class RastojanjeKancelarije {
	
	    public static void main(String[] args) {
	        
	    Scanner sc = new Scanner(System.in);

	    System.out.print("Unesite rastojanje u centimetrima: ");
	        int cm = sc.nextInt();

	        int metri = cm / 100;

	        System.out.println("Broj cijelih metara: " + metri);
	    }
	}




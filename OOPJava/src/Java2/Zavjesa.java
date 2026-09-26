package Java2;
import java.util.Scanner;
//potrebno je napisati program kojim cete provjeriti da li ce zavjesa prekriti prozor, radi se o pravougaoniku i prozor i zavjese oblik, za zavjesu i prozor je poznata gornja lijeva  donja desna kordinata, odradi kod
public class Zavjesa {
	 static boolean prekrivaProzor(int x1, int y1, int x2, int y2,
             int x3, int y3, int x4, int y4) {
		 if(x3>=x1 & y3 <= y1 & x4<=x2 & y2<=y4) {
			 return true;
			 
		 }else {
			 return false;
			 
		 }
	    }
	 


		public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Zavjesa:");
	        System.out.print("Unesite lijeve koridnate zavjese ");
	        int x1 = sc.nextInt();
	        int y1 = sc.nextInt();
	        System.out.print("unesite desne kordinate zavjese ");
	        int x2 = sc.nextInt();
	        int y2 = sc.nextInt();

	        System.out.println("Prozor:");
	        System.out.print("Unesite lijeve kordinate prozora ");
	        int x3 = sc.nextInt();
	        int y3 = sc.nextInt();
	        System.out.print("Unesite desne kordinate prozora ");
	        int x4 = sc.nextInt();
	        int y4 = sc.nextInt();

	        if (prekrivaProzor(x1, y1, x2, y2, x3, y3, x4, y4)) {
	            System.out.println("Zavjesa ce prekriti prozor.");
	        } else {
	            System.out.println("Zavjesa nece prekriti prozor.");
	        }
	    }
	}

	

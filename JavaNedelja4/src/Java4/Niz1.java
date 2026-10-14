package Java4;
import java.util.Scanner;
import java.util.Random;

public class Niz1 {
	 public static void main(String[] args) {
		 
		 Scanner sc = new Scanner(System.in);
		 Random r2 = new Random();
		 
		 System.out.println("Unesite niz brojeva:");
		 int duzinaNiza=sc.nextInt();
		 
		float [] noviNiz =new float[duzinaNiza];
		 
		 for (int i = 0; i < duzinaNiza; i++) {
	            System.out.print("Unesite element " + (i + 1) + ": ");
	            noviNiz[i] = r2.nextInt(100);
	            
	            
	        }
		 

		 for (int i = 0; i < duzinaNiza; i++) {
			 System.out.println(noviNiz[i]);
		 }
		 

		 for (int i = 0; i < duzinaNiza; i++) {
			 
			 if(noviNiz[i]% 2 == 0) {
				 noviNiz[i]*= -1;
			 }else {
				 noviNiz[i]= 1 / noviNiz [i];
			 
			 }
		 }
		 

		 for (int i = 0; i < duzinaNiza; i++) {
			 System.out.println(noviNiz[i]);
			 
		 }
		 
	 }
	

}

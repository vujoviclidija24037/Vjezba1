package Java1;
//srednja vrijednost dva broja 
import java.util.Scanner;

public class SrednjaVrijednost {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Unesite vrijednost paramentra a:");
		double a=sc.nextDouble();
		System.out.print("Unesite vrijednost paramentra b:");
		double b=sc.nextDouble();
		double sredina=(a+b)/2;
		System.out.println("Srednja vrijednost je: " + sredina);
		
		

	}

}

package Java2;
import java.util.Scanner;


//povrsina i obim pravougaonika
public class Pravougaonik {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.print("Unesite dimenzije stranice a: ");
	double a=sc.nextDouble();
	System.out.print("Unesite dimenzije stranice b: ");
	double b=sc.nextDouble();
	
	double povrsina=a*b;
	double obim=2*(a+b);
	
	System.out.println("Povrsina pravougaonika je:"+povrsina);
	System.out.println("Obim pravougaonika je:"+obim);
	
	
	
	

	}

}

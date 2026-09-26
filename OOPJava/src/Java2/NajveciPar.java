package Java2;
import java.util.Scanner;
//date su cijene 3 proizvoda napisati program koji treba nadje par proizvoda cija jcijena u zbiru najvecu vrijednost
public class NajveciPar {

static void NajveciPar( double a, double b,double c) {
	double zbir1= a+b;
	double zbir2=a+c;
	double zbir3=b+c;
	
	if (zbir1 >= zbir2 && zbir2 >= zbir3) {
        System.out.println("Najveći zbir imaju proizvodi 1 i 2: " + zbir2);
    } else if (zbir1 >= zbir2 && zbir2 >= zbir3) {
        System.out.println("Najveći zbir imaju proizvodi 1 i 3: " + zbir2);
    } else {
        System.out.println("Najveći zbir imaju proizvodi 2 i 3: " + zbir3);
    }
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Cijena prvog proizvoda: ");
    double a= sc.nextDouble();
    System.out.print("Cijena drugog proizvoda: ");
    double b = sc.nextDouble();
    System.out.print("Cijena trećeg proizvoda: ");
    double c = sc.nextDouble();

    NajveciPar(a, b, c);
}
}
	
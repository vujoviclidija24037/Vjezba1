package Java;
import java.util.Scanner;

public class Proizvodi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite cijenu prvog proizvoda: ");
        double a = sc.nextDouble();
        System.out.print("Unesite cijenu drugog proizvoda: ");
        double b = sc.nextDouble();
        System.out.print("Unesite cijenu treceg proizvoda: ");
        double c = sc.nextDouble();

        double zbirAB = a + b;
        double zbirAC = a + c;
        double zbirBC = b + c;

        if (zbirAB >= zbirAC && zbirAB >= zbirBC) {
            System.out.println("Par: prvi i drugi proizvod");
            System.out.println("Zbir: " + zbirAB);
        } else if (zbirAC >= zbirAB && zbirAC >= zbirBC) {
            System.out.println("Par: prvi i treci proizvod");
            System.out.println("Zbir: " + zbirAC);
        } else {
            System.out.println("Par: drugi i treci proizvod");
            System.out.println("Zbir: " + zbirBC);
        }

        
    }
}
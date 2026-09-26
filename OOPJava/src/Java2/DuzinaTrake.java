package Java2;

 import java.util.Scanner;

public class DuzinaTrake {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);

        System.out.print("Unesite povrsinu stoljnjaka P (u kvadratnim jedinicama): ");
        double p = unos.nextDouble();

       
        double r = Math.sqrt(p / Math.PI);

      
        double duzinaTrake = 2 * r * Math.PI;

        System.out.println("Poluprecnik stoljnjaka je: " + r);
        System.out.println("Potrebna duzina trake za ivicu je: " + duzinaTrake);
    }
}
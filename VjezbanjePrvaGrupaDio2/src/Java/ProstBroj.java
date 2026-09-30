package Java;
//ako je djeliv sa 1 ili samim sobom 
import java.util.Scanner;

public class ProstBroj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite broj:");

        int n = sc.nextInt();

        int brojDjelilaca = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                brojDjelilaca++;
            }
        }

        if (brojDjelilaca == 2) {
            System.out.println("Broj je prost.");
        } else {
            System.out.println("Broj nije prost.");
        }

        
    }
}
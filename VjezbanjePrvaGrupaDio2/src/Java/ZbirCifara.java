package Java;
//zbir najmanje i najvece cifre unesenog broja
import java.util.Scanner;

public class ZbirCifara {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite broj: ");
        int n = sc.nextInt();

        if (n < 0) {
            n = -n;
        }

        int cifra = n % 10;
        int min = cifra;
        int max = cifra;
        n = n / 10;

        while (n > 0) {
            cifra = n % 10;

            if (cifra < min) {
                min = cifra;
            }
            if (cifra > max) {
                max = cifra;
            }

            n = n / 10;
        }

        System.out.println("Zbir najmanje i najvece cifre: " + (min + max));
        
    }
}

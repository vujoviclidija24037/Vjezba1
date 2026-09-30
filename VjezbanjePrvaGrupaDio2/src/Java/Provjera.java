package Java;

import java.util.Scanner;

public class Provjera{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite četvorocifreni broj n: ");
        int n = sc.nextInt();

        int m = Math.abs(n);
        if (m < 1000 || m > 9999) {
            System.out.println("Broj nije četvorocifren.");
        } else if (n % 2 == 0) {
            int zbir = 0;
            while (m != 0) {
                int c = m % 10;
                if (c % 2 == 0)
                    zbir = zbir + c;
                m = m / 10;
            }
            System.out.println("Broj je paran. Zbir parnih cifara: " + zbir);
        } else {
            int proizvod = 1;
            while (m != 0) {
                int c = m % 10;
                if (c % 2 != 0)
                    proizvod = proizvod * c;
                m = m / 10;
            }
            System.out.println("Broj je neparan. Proizvod neparnih cifara: " + proizvod);
        }

        sc.close();
    }
}
        

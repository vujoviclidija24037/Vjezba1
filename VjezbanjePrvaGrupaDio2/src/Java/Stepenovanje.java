package Java;

import java.util.Scanner;

public class Stepenovanje {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite osnovu: ");
        double osnova = sc.nextDouble();

        System.out.print("Unesite izlozilac: ");
        int n = sc.nextInt();

        double rezultat = 1.0;

        for (int i = 0; i < Math.abs(n); i++) {
            rezultat *= osnova;
        }

        if (n < 0) {
            rezultat = 1 / rezultat;
        }

        System.out.println("Rezultat: " + rezultat);
        
    }
}

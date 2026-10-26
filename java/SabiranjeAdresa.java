package java;

import java.util.Scanner;

public class SabiranjeAdresa{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dužina niza: ");
        int n = sc.nextInt();
        int[] niz = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Broj kuće " + (i + 1) + ": ");
            niz[i] = sc.nextInt();
        }

        int zbir = 0;
        for (int broj : niz) {
            if (broj == 0) {
                break;          
            }
            zbir += broj;
        }

        System.out.println("Zbir: " + zbir);

        sc.close();
    }
}

package Java33;

import java.util.Scanner;

public class PozitivniElemNiza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite dužinu niza: ");
        int n = sc.nextInt();

        int[] niz = new int[n];

        // unosimo elemente niza 
        for (int i = 0; i < n; i++) {
            System.out.print("Unesite element " + (i + 1) + ": ");
            niz[i] = sc.nextInt();
        }

        // provjeravam koliko ima pozitivnih u taj niz 
        int brojPozitivnih = 0;
        for (int i = 0; i < n; i++) {
            if (niz[i] > 0) {
                brojPozitivnih++;
            }
        }

        System.out.println("Broj pozitivnih elemenata: " + brojPozitivnih);

        sc.close();
    }
}

package java;

import java.util.Scanner;

public class SuprotanBroj{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dužina niza: ");
        int n = sc.nextInt();
        int[] niz = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            niz[i] = sc.nextInt();
        }

        int broj = 0;
        for (int i = 0; i < niz.length; i++) {
            for (int j = i + 1; j < niz.length; j++) {
                if (niz[i] == -niz[j]) {
                    broj++;
                }
            }
        }

        System.out.println(broj);

        sc.close();
    }
}
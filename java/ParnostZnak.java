package java;

import java.util.Scanner;

public class ParnostZnak {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);

        System.out.print("Unesite cijeli broj: ");
        int broj = unos.nextInt();

        String znak;
        String parnost;

        if (broj >= 0) {
            znak = "pozitivan";
        } else {
            znak = "negativan";
        }

        if (broj % 2 == 0) {
            parnost = "paran";
        } else {
            parnost = "neparan";
        }

        System.out.println("Broj je " + znak + "/" + parnost);
    }
}

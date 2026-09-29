package Java1;
//rastojanje pomocu formule,a tacka c se nalazi na sredini puta
import java.util.Scanner;

import java.util.Scanner;

import java.util.Scanner;

public class Rastojanje{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite x1: ");
        double x1 = sc.nextDouble();

        System.out.print("Unesite y1: ");
        double y1 = sc.nextDouble();

        System.out.print("Unesite x2: ");
        double x2 = sc.nextDouble();

        System.out.print("Unesite y2: ");
        double y2 = sc.nextDouble();

        double x3 = (x1 + x2) / 2;
        double y3 = (y1 + y2) / 2;

        double rastojanje = Math.sqrt(
            (x3 - x1) * (x3 - x1) +
            (y3 - y1) * (y3 - y1)
        );

        System.out.println("Tačka susreta je: (" + x3 + ", " + y3 + ")");
        System.out.println("Rastojanje do tačke susreta je: " + rastojanje);
    }
}

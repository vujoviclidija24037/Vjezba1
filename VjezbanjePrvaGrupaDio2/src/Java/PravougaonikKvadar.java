package Java;
/*Napisati program koji provjerava da li se od pravouganika poznatih
dimenzija stranica mogu napraviti bar dva kvadrata čija je dužina ista kao i
dužina pravouganika.*/

import java.util.Scanner;

public class PravougaonikKvadar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite stranicu a: ");
        double a = sc.nextDouble();
        System.out.print("Unesite stranicu b: ");
        double b = sc.nextDouble();

        if (b >= 2 * a) {
            System.out.println("Mogu se napraviti bar dva kvadrata.");
        } else {
            System.out.println("Ne mogu se napraviti dva kvadrata.");
        }

       
    }
}

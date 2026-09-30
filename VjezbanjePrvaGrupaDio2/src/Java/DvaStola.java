package Java;
//poznat r,stampati veci obim kruga

import java.util.Scanner;

public class DvaStola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite poluprecnik prvog stola: ");
        double r1 = sc.nextDouble();
        System.out.print("Unesite poluprecnik drugog stola: ");
        double r2 = sc.nextDouble();

        double p1 = r1 * r1 * Math.PI;
        double p2 = r2 * r2 * Math.PI;

        double obim;
        if (p1 > p2) {
            obim = 2 * r1 * Math.PI;
        } else {
            obim = 2 * r2 * Math.PI;
        }

        System.out.println("Obim stola sa vecom povrsinom: " + obim);
        sc.close();
    }
}
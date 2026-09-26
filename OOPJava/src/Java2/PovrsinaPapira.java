package Java2;

import java.util.Scanner;

public class PovrsinaPapira {
	
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);

        System.out.print("Unesite sirinu lista papira (mm): ");
        double sirinaMM = unos.nextDouble();

        System.out.print("Unesite visinu lista papira (mm): ");
        double visinaMM = unos.nextDouble();

        
        double sirinaCM = sirinaMM / 10;
        double visinaCM = visinaMM / 10;

        double povrsina = sirinaCM * visinaCM;

        System.out.println("Povrsina lista papira je: " + povrsina + " cm2");
    }
}
package Java2;

import java.util.Scanner;

public class PovrsinaZida {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);

        System.out.print("Unesite X koordinatu gornje lijeve tacke: ");
        double x1 = unos.nextDouble();
        System.out.print("Unesite Y koordinatu gornje lijeve tacke: ");
        double y1 = unos.nextDouble();

        System.out.print("Unesite X koordinatu donje desne tacke: ");
        double x2 = unos.nextDouble();
        System.out.print("Unesite Y koordinatu donje desne tacke: ");
        double y2 = unos.nextDouble();

   
        double sirina = Math.abs(x2 - x1);
        double visina = Math.abs(y1 - y2);

        double povrsina = sirina * visina;
        double obim = 2 * (sirina + visina);

        System.out.println("Sirina zida je: " + sirina);
        System.out.println("Visina zida je: " + visina);
        System.out.println("Povrsina zida je: " + povrsina);
        System.out.println("Obim zida je: " + obim);
    }
}

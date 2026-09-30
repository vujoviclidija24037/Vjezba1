package Java;
//provjera nalazi li se x,y unutar pravougaonika

import java.util.Scanner;

public class TackaUPravougaonik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite x gornjeg lijevog tjemena: ");
        double x1 = sc.nextDouble();
        System.out.print("Unesite y gornjeg lijevog tjemena: ");
        double y1 = sc.nextDouble();

        System.out.print("Unesite x donjeg desnog tjemena: ");
        double x2 = sc.nextDouble();
        System.out.print("Unesite y donjeg desnog tjemena: ");
        double y2 = sc.nextDouble();

        System.out.print("Unesite x tacke: ");
        double x = sc.nextDouble();
        System.out.print("Unesite y tacke: ");
        double y = sc.nextDouble();

        if (x >= x1 && x <= x2 && y <= y1 && y >= y2) {
            System.out.println("Tacka se nalazi unutar pravougaonika.");
        } else {
            System.out.println("Tacka se ne nalazi unutar pravougaonika.");
        }

        
    }
}
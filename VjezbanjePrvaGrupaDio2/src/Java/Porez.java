package Java;

import java.util.Scanner;

public class Porez {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        double plata, porez, ukupno = 0;

        System.out.print("Unesi N: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Unesi platu: ");
            plata = sc.nextDouble();

            if (plata <= 1000) {
                porez = plata * 10 / 100;
            } else {
                porez = plata * 20 / 100;
            }

            ukupno = ukupno + porez;
        }

        System.out.println("Ukupan porez je: " + ukupno);
    }
}
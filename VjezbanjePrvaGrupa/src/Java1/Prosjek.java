package Java1;
//prosjek za 4 grada

import java.util.Scanner;

public class Prosjek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite broj stanovnika prvog grada: ");
        int grad1 = sc.nextInt();

        System.out.print("Unesite broj stanovnika drugog grada: ");
        int grad2 = sc.nextInt();

        System.out.print("Unesite broj stanovnika trećeg grada: ");
        int grad3 = sc.nextInt();

        System.out.print("Unesite broj stanovnika četvrtog grada: ");
        int grad4 = sc.nextInt();

        double prosjek = (grad1 + grad2 + grad3 + grad4) / 4.0;

        System.out.println("Prosječan broj stanovnika je: " + prosjek);
    }
}


package Java;

import java.util.Scanner;

public class Sprat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite petocifreni broj:");

        int n = sc.nextInt();

        int posljednja = n % 10;
        int pretposljednja = (n / 10) % 10;

        int sprat = pretposljednja + posljednja;

        System.out.println(sprat);
    }
}


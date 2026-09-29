package Java1;

import java.util.Scanner;

public class Zamjena{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite trocifreni broj:");
        int n = sc.nextInt();

        int prva = n / 100;
        int srednja = (n / 10) % 10;
        int posljednja = n % 10;

        int rezultat = posljednja * 100 + srednja * 10 + prva;

        System.out.println(rezultat);
    }
}


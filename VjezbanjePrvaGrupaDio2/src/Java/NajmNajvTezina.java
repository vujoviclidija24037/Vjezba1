package Java;
//sa casa 2 primjer
//za uneseni broj provjeriti jesu li nam jednake cifre najm i najvece tezine
import java.util.Scanner;

public class NajmNajvTezina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite n: ");
        int n = Math.abs(sc.nextInt());

        int cifraNM = n % 10;   
        int cifraNV = cifraNM;  

        while (n != 0) {
            cifraNV = n % 10;   
            n = n / 10;
        }

        if (cifraNM == cifraNV)
            System.out.println("Cifre najmanje i najveće težine su jednake.");
        else
            System.out.println("Cifre najmanje i najveće težine nisu jednake.");

        sc.close();
    }
}
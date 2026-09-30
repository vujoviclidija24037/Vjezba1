package Java;

import java.util.Scanner;

public class DvocifrenBroj{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite dvocifren broj:");

        int broj = sc.nextInt();

        int prva = broj / 10;
        int druga = broj % 10;

        if (prva > druga) {
            System.out.println(prva - druga);
        } else if (prva < druga) {
            System.out.println(prva + druga);
        } else {
            System.out.println(prva * druga);
        }
    }
}

package Java;

import java.util.Scanner;

public class Kvadrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite x i y: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if (x == 0 && y == 0)
            System.out.println("Tacka je u koordinatnom pocetku.");
        else if (x == 0)
            System.out.println("Tacka je na y-osi, ne pripada nijednom kvadrantu.");
        else if (y == 0)
            System.out.println("Tacka je na x-osi, ne pripada nijednom kvadrantu.");
        else if (x > 0 && y > 0)
            System.out.println("Tacka pripada I kvadrantu.");
        else if (x < 0 && y > 0)
            System.out.println("Tacka pripada II kvadrantu.");
        else if (x < 0 && y < 0)
            System.out.println("Tacka pripada III kvadrantu.");
        else
            System.out.println("Tacka pripada IV kvadrantu.");

        sc.close();
    }
}

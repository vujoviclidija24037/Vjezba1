package Java;

import java.util.Scanner;

public class Mrav {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Lijevo donje tjeme (x1 y1): ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.print("Desno gornje tjeme (x2 y2): ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        System.out.print("Polozaj mrava (x y): ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        boolean naVertikalnoj = (x == x1 || x == x2) && (y >= y1 && y <= y2);
        boolean naHorizontalnoj = (y == y1 || y == y2) && (x >= x1 && x <= x2);

        if (naVertikalnoj || naHorizontalnoj)
            System.out.println("Mrav se krece po ivici stola.");
        else
            System.out.println("Mrav se ne krece po ivici stola.");

        sc.close();
    }
}

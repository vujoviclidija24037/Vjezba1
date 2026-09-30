package Java;
//slican zadatak sa predavanja
import java.util.Scanner;

public class Uslov {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite x: ");
        double x = sc.nextDouble();

        double y;

        if (x <= -7)
            y = -2 * x + 7.0 / 2;
        else if (x < 1)
            y = (x * x - 3 * x + 5) / (x * x + 2);
        else if (x <= 8)
            y = Math.sqrt(x * x + 2 * x + 2) + Math.sqrt(Math.abs(3.0 / 2 * x - 4.0 / 7));
        else
            y = Math.abs(3 / (x * x) - 11 * x);

        System.out.println("y = " + y);

        sc.close();
    }
}

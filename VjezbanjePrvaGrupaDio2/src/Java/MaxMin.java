package Java;

//od tri broja naci max i min
import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite prvi broj: ");
        int a = sc.nextInt();
        System.out.print("Unesite drugi broj: ");
        int b = sc.nextInt();
        System.out.print("Unesite treci broj: ");
        int c = sc.nextInt();

        int max;
        int min;

        
        if (a >= b && a >= c) {
            max = a;
        } else if (b >= a && b >= c) {
            max = b;
        } else {
            max = c;
        }

        
        if (a <= b && a <= c) {
            min = a;
        } else if (b <= a && b <= c) {
            min = b;
        } else {
            min = c;
        }

        System.out.println("Maksimum: " + max);
        System.out.println("Minimum: " + min);
        sc.close();
    }
}
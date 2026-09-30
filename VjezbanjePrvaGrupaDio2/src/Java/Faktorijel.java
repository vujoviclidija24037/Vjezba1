package Java;
import java.util.Scanner;

public class Faktorijel {
    public static void main(String[] args) {
        int n;
        long p = 1;

        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite n: ");
        n = sc.nextInt();

        if (n >= 0) {
            for (int i = 2; i <= n; i++) {
                p = p * i;
            }
            System.out.printf("%d! = %d%n", n, p);
        } else {
            System.out.println("Nije prirodni broj");
        }

        sc.close();
    }
}


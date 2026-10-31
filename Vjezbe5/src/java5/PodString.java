package java5;

import java.util.Scanner;

public class PodString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesi prvi string:");
        String prvi = sc.nextLine();

        System.out.println("Unesi drugi string:");
        String drugi = sc.nextLine();

        if (prvi.contains(drugi)) {
            System.out.println("Drugi string je podstring prvog.");
        } else {
            System.out.println("Drugi string nije podstring prvog.");
        }
    }
}

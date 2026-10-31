package java5;
import java.util.Scanner;

public class UzastopnoPonavljanje{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesi tekst:");
        String tekst = sc.nextLine();

        for (int i = 0; i < tekst.length() - 1; i++) {

            if (tekst.charAt(i) == tekst.charAt(i + 1)) {

                System.out.println("Ponavljaju se slova: "
                        + tekst.charAt(i) + tekst.charAt(i + 1));
            }
        }
    }
}
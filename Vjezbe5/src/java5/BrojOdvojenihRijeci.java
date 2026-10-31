package java5;
import java.util.Scanner;

public class BrojOdvojenihRijeci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesi recenicu:");
        String recenica = sc.nextLine();

        String[] rijeci = recenica.trim().split("\\s+");

        int brojRijeci;

        if (recenica.trim().isEmpty()) {
            brojRijeci = 0;
        } else {
            brojRijeci = rijeci.length;
        }

        System.out.println("Broj rijeci je: " + brojRijeci);
    }
}
package Java;
//uslovi za temp i stanje 
import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite tempraturu:");

        int t = sc.nextInt();

        if (t <= 0) {
            System.out.println("cvrsto");
        } else if (t < 100) {
            System.out.println("tecno");
        } else {
            System.out.println("gasovito");
        }

        
    }
}
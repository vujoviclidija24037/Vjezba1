package Java1;
//zamjena vrijednosti x i y
import java.util.Scanner;

public class ZamjenaVrijednosti {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);

        System.out.print("Unesite vrijednost x : ");
        int x = unos.nextInt();

        System.out.print("Unesite vrijednost y : ");
        int y = unos.nextInt();

        System.out.println("Prije zamjene: x = " + x + ", y = " + y);

      
        int pomocna = x;
        x = y;
        y = pomocna;

        System.out.println("Poslije zamjene: x = " + x + ", y = " + y);
    }
}
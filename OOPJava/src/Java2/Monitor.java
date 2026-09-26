package Java2;
import java.util.Scanner;

public class Monitor {
	

static double povrsina(double d, double a, double b) {
    double k = d / Math.sqrt(a * a + b * b); 
    double stranicaA = a * k;
    double stranicaB = b * k;
    return stranicaA * stranicaB;
}


public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Unesite dužinu dijagonale monitora: ");
    double d = sc.nextDouble();

    double p = povrsina(d, 16, 9);

    System.out.println("Površina ekrana: " + p);
}
}
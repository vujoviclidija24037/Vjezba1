package Java1;
//kvadrat zbira cetvor.broja
import java.util.Scanner;

public class KvadratZbira {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Unesite cetvorocifreni broj:");
		int broj=sc.nextInt();
		int a = broj / 1000;
        int b = (broj/ 100) % 10;
        int c = (broj/ 10) % 10;
        int d = broj% 10;

        int zbir = a + b + c + d;
        int rezultat = zbir * zbir;

        System.out.println(rezultat);
    }


	}



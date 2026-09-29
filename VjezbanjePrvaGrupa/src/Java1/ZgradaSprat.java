package Java1;

import java.util.Scanner;

public class ZgradaSprat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Unesite prirodan cetvorocifreni broj:");
		int broj=sc.nextInt();
		int pretposlednja =(broj/10)%10;
		System.out.print("Broj stambene jedinice je: " +pretposlednja);

	}

}

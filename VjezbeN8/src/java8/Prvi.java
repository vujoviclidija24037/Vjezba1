package java8;

import java.util.Scanner;
//prvi sa kolkvijuma 
public class Prvi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		System.out.println("Unesite prirodan broj N:");
		int n=sc.nextInt();
		
		String binarni="";
		
		while(n>0) {
			binarni=(n%2)+binarni;
			n=n/2; 
		}
		System.out.println("Binarno:"+binarni);
		sc.close();
		
	}

} 

/* public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		System.out.println("Unesite prirodan broj N:");
		int n=sc.nextInt();
		
		String oktalni="";
		
		while(n>0) {
			oktalni=(n%2)+oktalni;
			n=n/8; // dijeljeno sa 8 za drugu grupu,oktalne
		}
		System.out.println("Oktalno:"+oktalno);
		sc.close();  */

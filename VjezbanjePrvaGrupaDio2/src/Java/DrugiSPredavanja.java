package Java;

import java.util.Scanner;

public class DrugiSPredavanja {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Unesite x:");
	     int x=sc.nextInt();
	     double izl;
	    
	     
	    
	     if(x<1)
	    	 izl=x*x;
	     else if (x<5)
	    	 izl=2-x;
	     else
	    	 izl=(x*x*x-1)/5;
	     
	     sc.close();
	        

	  }}

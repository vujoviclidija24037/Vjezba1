package Java2;
//Napisati program za igru fizz nakon unosa cijelog broja n treba provjeriti: ako je broj djeljiv sa 5 ali ne i sa 3 poruka treba da bude fizz, ako je broj djeliv sa 3 ali ne i sa 5 poruka treba da bude buzz, ako je djeljiv i sa 5 i sa 3 treba da bude poruka fizzbuzz, ako broj nije djeliv ni sa 3 ni sa 5, poruka treba da bude broj n//

public class ProvjeraN {
	//prvo moram da vidim koliko cifara ima broj
	
	public static int brCifara(int n) {
		String num= n + "";
		double sum=0;
		
		for(int i=0; i < num.length(); i++)
		{
			sum += Math.pow(Character.getNumericValue(num.charAt(i)), num.length()); //uzima prvu cifru iz iteracije
			
		}
	
		return n;
	}}

// drugi nacin
//public static boolean brCifara(int n) {
 //int brCifara =0:
 //while(n>o) {
// brCifara += 1;
 //n=n/10;
 //}
 //return brCifara;//
 

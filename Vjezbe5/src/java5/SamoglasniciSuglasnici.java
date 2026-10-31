package java5;
import java.util.Scanner;

public class SamoglasniciSuglasnici {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		// TODO Auto-generated method stub
		
		System.out.println("Unesite neku rijec");
		String rijec=sc.nextLine().toLowerCase();
		
		int brojSamoglasnika=0;
		int brojSuglasnika=0;
		
		for(int i=0;i<rijec.length();i++) {
			char slovo=rijec.charAt(i);
			
			if(slovo=='a' || slovo=='e'|| slovo=='i' ||  slovo=='o' || slovo=='u' ) {
				brojSamoglasnika++;
				
			} else {
				brojSuglasnika++;
				
			}
			
		}
		
		System.out.println("Broj samoglasnika je:"+brojSamoglasnika);
		System.out.println("Broj suglasnika je:"+brojSuglasnika);
		
		
		
		

	}

}

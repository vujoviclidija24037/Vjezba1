package Java2;
//dobili ste zadatak da nadjete sifru koja otvara vrata,otrkrili ste da na osnovu trocifrenog broja mozete otvoriti ta vrata tako sto proizvoda cifara tog broja oduzmete zbir istih tih cifara//
import java.util.Scanner;

public class NedeljaDruga {
	//kao fukncija isto kod provjezbati 
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Unesite trocifreni broj: ");
        int broj = sc.nextInt();
        
        if (broj < 100 || broj > 999) {
            System.out.println("Broj nije trocifren!");
            return;
        }

        int stotine = broj / 100;       
        int desetice = (broj / 10) % 10; 
        int jedinice = broj % 10;        
        
        int proizvod= stotine * desetice * jedinice ;
        int zbir= stotine + desetice + jedinice ;
        
        int sifra= proizvod + zbir;
        
        System.out.print(sifra);
        
        
        
        
        

	}

}

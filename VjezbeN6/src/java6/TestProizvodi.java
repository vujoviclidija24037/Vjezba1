package java6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class TestProizvodi {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		
		ArrayList<Proizvod>proizvodi=new ArrayList<>();
		
		
        proizvodi.add(new HemijskiProizvodi(
                "Detergent", "456", "Njemačka",
                2025, 10, 25, true));

        proizvodi.add(new Hrana(
                "Mlijeko", "789", "Srbija",
                2025, 2, 150,
                LocalDate.now().plusMonths(3)));
        
        System.out.println("SVI PROIZVODI:");

        for (Proizvod p : proizvodi) {
            p.prikaziInformacije();
            System.out.println("  ");
        }
        
        System.out.println("MALOPRODAJNE CIJENE:");

        for (Proizvod p : proizvodi) {
            System.out.println(p.getOpisProizvoda() + ": "
                    + p.izracunajCijenu());
        }

        
        System.out.println("Odaberi grupu:");
        System.out.println("1 - Garderoba");
        System.out.println("2 - Hemijski proizvodi");
        System.out.println("3 - Hrana");

        int izbor = sc.nextInt();

        double suma = 0;
        int broj = 0;

        for (Proizvod p : proizvodi) {

            if (izbor == 1 && p instanceof Garderoba ||
                izbor == 2 && p instanceof HemijskiProizvodi ||
                izbor == 3 && p instanceof Hrana) {

                suma += p.izracunajCijenu();
                broj++;
            }
        }

        if (broj > 0) {
            System.out.println("Prosjecna cijena: "
                    + suma / broj);
        } else {
            System.out.println("Nema proizvoda u ovoj grupi.");
        }

        sc.close();
    }

        
        


	}



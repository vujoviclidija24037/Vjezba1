package Java2;

import java.util.Scanner;

public class CijenaTaksija {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        double POCETNA_CIJENA = 1.0;
        double CIJENA_PO_KM = 0.5;

        System.out.print("Unesite broj predjenih kilometara: ");
        double km = sc.nextDouble();

        double cijenaVoznje = POCETNA_CIJENA + CIJENA_PO_KM * km;

        System.out.println("Cijena voznje je: " + cijenaVoznje + " eura");
    }
}

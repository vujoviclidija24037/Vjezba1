package Java4;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class AnalizaNiza{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        
        System.out.print("Unesite dužinu niza: ");
        int duzina = sc.nextInt();

        int[] niz = new int[duzina];
        for (int i = 0; i < duzina; i++) {
            niz[i] = rnd.nextInt(201) - 100;   
        }
        System.out.println("Originalni niz: " + Arrays.toString(niz));

        double[] izmijenjen = new double[duzina];
        for (int i = 0; i < duzina; i++) {
            if (niz[i] % 2 == 0) {
                izmijenjen[i] = -1 * niz[i];       
            } else {
                izmijenjen[i] = 1.0 / niz[i];      
            }
        }
        System.out.println("Izmijenjeni niz: " + Arrays.toString(izmijenjen));

    
        System.out.print("\nUnesite broj elemenata novog niza: ");
        int n = sc.nextInt();

        int[] unijeti = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Element [" + i + "]: ");
            unijeti[i] = sc.nextInt();
        }

        AnalizaNiza analiza = new AnalizaNiza();
        double prosjek = analiza.nadjiParniPozitivniProsjek(unijeti);

        System.out.println("Unijeti niz: " + Arrays.toString(unijeti));
        System.out.println("Prosjek pozitivnih parnih brojeva: " + prosjek);

        sc.close();
    }
}

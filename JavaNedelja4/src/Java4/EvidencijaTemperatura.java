package Java4;

import java.util.Arrays;
import java.util.Scanner;

public class EvidencijaTemperatura {

    private double[] temperature;

    
    public EvidencijaTemperatura(double[] temperature) {
        this.setTemperature(temperature);
    }

    
    public double[] getTemperature() {
        return temperature;
    }

    
    public void setTemperature(double[] temperature) {
        this.temperature = temperature;
    }

    
    public boolean sadrzi(double t) {
        for (double x : temperature) {
            if (x == t) {
                return true;
            }
        }
        return false;
    }

    /
    public double[] ukloni(double t) {
        int brojac = 0;
        for (double x : temperature) {
            if (x != t) {
                brojac++;
            }
        }

        double[] noviNiz = new double[brojac];
        int j = 0;
        for (double x : temperature) {
            if (x != t) {
                noviNiz[j] = x;
                j++;
            }
        }
        return noviNiz;
    }

    
    public double prosjecnaTemperatura(double[] niz) {
        if (niz.length == 0) {
            return 0;
        }
        double suma = 0;
        for (double x : niz) {
            suma += x;
        }
        return suma / niz.length;
    }


    public double maksimalnaTemperatura(double[] niz) {
        double max = niz[0];
        for (int i = 1; i < niz.length; i++) {
            if (niz[i] > max) {
                max = niz[i];
            }
        }
        return max;
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        double[] unos = new double[5];
        for (int i = 0; i < unos.length; i++) {
            System.out.print("Unesite temperaturu " + (i + 1) + ": ");
            unos[i] = sc.nextDouble();
        }

        EvidencijaTemperatura evidencija = new EvidencijaTemperatura(unos);

        
        System.out.println("\nDužina niza: " + evidencija.getTemperature().length);
        System.out.println("Temperature: " + Arrays.toString(evidencija.getTemperature()));

    
        System.out.print("\nUnesite temperaturu koju tražite: ");
        double trazena = sc.nextDouble();

        if (evidencija.sadrzi(trazena)) {
            System.out.println("Temperatura " + trazena + " se nalazi u nizu.");
        } else {
            System.out.println("Temperatura " + trazena + " se NE nalazi u nizu.");
        }

        
        double[] azuriran = evidencija.ukloni(trazena);
        evidencija.setTemperature(azuriran);

        System.out.println("\nAžurirani niz: " + Arrays.toString(evidencija.getTemperature()));

        
        if (azuriran.length > 0) {
            System.out.println("Prosječna temperatura: "
                    + evidencija.prosjecnaTemperatura(azuriran));
            System.out.println("Maksimalna temperatura: "
                    + evidencija.maksimalnaTemperatura(azuriran));
        } else {
            System.out.println("Niz je prazan, nema prosjeka ni maksimuma.");
        }

        sc.close();
    }
}

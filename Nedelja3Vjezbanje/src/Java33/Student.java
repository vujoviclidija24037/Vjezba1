package Java33;

public class Student {
    private String ime;
    private String prezime;
    private String brojIndeksa;
    private int ocjena1;
    private int ocjena2;
    private int ocjena3;

    
    private static String spisak = "";

    public Student(String ime, String prezime, String brojIndeksa,
                   int ocjena1, int ocjena2, int ocjena3) {
        this.ime = ime;
        this.prezime = prezime;
        this.brojIndeksa = brojIndeksa;
        this.ocjena1 = ocjena1;
        this.ocjena2 = ocjena2;
        this.ocjena3 = ocjena3;

        
        spisak += "(" + ime + ", " + prezime + ", " + (imaPravoNaKredit() ? "Da" : "Ne") + ")\n";
    }

    
    public double izracunajProsjek() {
        return (ocjena1 + ocjena2 + ocjena3) / 3.0;
    }

    
    public boolean imaPravoNaKredit() {
        return izracunajProsjek() > 9;
    }

    public void printStudent() {
        System.out.printf("%s %s (indeks: %s), ocjene: %d, %d, %d, prosjek: %.2f, kredit: %s%n",
                ime, prezime, brojIndeksa, ocjena1, ocjena2, ocjena3,
                izracunajProsjek(), imaPravoNaKredit() ? "Da" : "Ne");
    }

   
    public static void printSpisak() {
        System.out.println("Spisak studenata (Ime, Prezime, Stipendija):");
        System.out.print(spisak);
    }
}
package Java1;

public class KvadratStranice{
    public static void main(String[] args) {

        int duzina = 543;
        int sirina = 130;
        int stranica = 65;

        int poDuzini = duzina / stranica;
        int poSirini = sirina / stranica;

        int brojKvadrata = poDuzini * poSirini;

        System.out.println("Broj kvadrata: " + brojKvadrata);
    }
}

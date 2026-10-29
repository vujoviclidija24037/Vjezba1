package java7;

public class Automobil  extends Vozilo {
	
	private static final float FAKTOR_BRZINE=0.7f;

	public Automobil(String id, double maxBrzina) {
		super(id, maxBrzina);
	}

	@Override
    public double izracunajVrijemeDostave(double udaljenostKm) {
        double prosjecnaBrzina = getMaxBrzina();
        return udaljenostKm / prosjecnaBrzina;
    }
}

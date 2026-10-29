package java7;

public class Biciklo  extends Vozilo implements Economican {
	private static final float FAKTOR_BRZINE=0.5f;

	public Biciklo(String id, double maxBrzina) {
		super(id, maxBrzina);
	}

	@Override
	public double potrosnjaPoKm() {
		
		return 0.0;
	}

	@Override
	public double izracunajVrijemeDostave(double udaljenostKm) {
		return udaljenostKm / (getMaxBrzina());
	}
	
	

}

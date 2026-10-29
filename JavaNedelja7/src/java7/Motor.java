package java7;

public class Motor extends Vozilo implements Economican {
	
	private static final float FAKTOR_BRZINE=0.6f;

	public Motor(String id, double maxBrzina) {
		super(id, maxBrzina);
	}

	@Override
	public double potrosnjaPoKm() {
		// TODO Auto-generated method stub
		return 0.0;
	}

	@Override
	public double izracunajVrijemeDostave(double udaljenostKm) {
		return udaljenostKm / (getMaxBrzina());
	}
	
	

}

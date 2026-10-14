package Java4;

public class EvidencijaTemperatura {
//ovako mozemo ocekivati za kolokvijum zadatak 
	
	private double[] temperature;
	
	
	
	public EvidencijaTemperatura(double[] temperature) {
	super();
	this.temperature = temperature;
}

	




	public double[] getTemperature() {
		return temperature;
	}






	public void setTemperature(double[] temperature) {
		this.temperature = temperature;
	}

	
	public int getDuzina() {
        return temperature.length;
    }

	
	public void ispisiTemperature() {
        System.out.print("Temperature: ");
        if (temperature.length == 0) {
            System.out.println("(niz je prazan)");
            return;
        }
        for (int i = 0; i < temperature.length; i++) {
            System.out.print(temperature[i] + " ");
        }
        System.out.println();
    }
	
	
	public boolean sadrziTemperaturu(double t) {
        for (double x : temperature) {
            if (Double.compare(x, t) == 0) {
                return true;
            }
        }
        return false;
    }

	




	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

package Java33;

public class Color {
	private int red;
    private int green;
    private int blue;
    
    public Color(int red, int green, int blue) {
        setRed(red);
        setGreen(green);
        setBlue(blue);
    }

	public int getRed() {
		return red;
	}

	 public void setRed(int red) {
	        if (isValid(red)) {
	            this.red = red;
	        } else {
	            System.out.println("Greška: vrijednost za red mora biti između 0 i 255.");
	        }
	    }
	

	

	private boolean isValid(int red2) {
		// TODO Auto-generated method stub
		return false;
	}

	public int getGreen() {
		return green;
	}

	public void setGreen(int green) {
        if (isValid(green)) {
            this.green = green;
        } else {
            System.out.println("Greška: vrijednost za green mora biti između 0 i 255.");
        }
    }


	public int getBlue() {
		return blue;
	}

	public void setBlue(int blue) {
        if (isValid(blue)) {
            this.blue = blue;
        } else {
            System.out.println("Greška: vrijednost za blue mora biti između 0 i 255.");
        }
    }
	
	//mijenjanje vrijednosti ponovi!!!!
	public void addRed(int change) {
        int newValue = red + change;
        if (newValue < 0) {
            System.out.println("Upozorenje: red ispod 0, postavljeno na 0.");
            newValue = 0;
        } else if (newValue > 255) {
            System.out.println("Upozorenje: red iznad 255, postavljeno na 255.");
            newValue = 255;
        }
        red = newValue;
    }

	public void addGreen(int change) {
        int newValue = green + change;
        if (newValue < 0) {
            System.out.println("Upozorenje: green ispod 0, postavljeno na 0.");
            newValue = 0;
        } else if (newValue > 255) {
            System.out.println("Upozorenje: green iznad 255, postavljeno na 255.");
            newValue = 255;
        }
        green = newValue;
    }

    public void addBlue(int change) {
        int newValue = blue + change;
        if (newValue < 0) {
            System.out.println("Upozorenje: blue ispod 0, postavljeno na 0.");
            newValue = 0;
        } else if (newValue > 255) {
            System.out.println("Upozorenje: blue iznad 255, postavljeno na 255.");
            newValue = 255;
        }
        blue = newValue;
    }
    //ispis
    public void printColor() {
        System.out.println("red: " + red + ", green: " + green + ", blue: " + blue);
    }

}

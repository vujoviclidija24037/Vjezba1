package Java2;

public class Narcistic {
	
	public static boolean isNarcistic(int n) {
		int brcif=brCifara(n);
		int suma=0;
		while(n>0) {
			int cifra = n%10;
			suma += Math.pow(cifra,brcif);
			n=n/10;
		}
		if(n==suma) {
			return true;
		}else {
			return false;
		}
	}

	private static int brCifara(int n) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

package java8;
//staticka metoda koja kovertuje datum,iz jednog formata u drugi format
//hh:mm:ss u HHh:mmm:min
public class Drugi {

	public static String konvertujVrijeme(String vrijeme,String format,String zeljeniFromat) {
		int iSat=format.indexOf("HH");
		int iMin=format.indexOf("MM");
		int iSek=format.indexOf("SS");
		
		String sati=vrijeme.substring(iSat,iSat+2);
		String minuti=vrijeme.substring(iMin,iMin+2);
		String sekunde=vrijeme.substring(iSek,iSek+2);
		
		
		String rezultat=zeljeniFromat;
		
		rezultat=rezultat.replace("HH",sati);
		rezultat=rezultat.replace("MM",minuti);
		rezultat=rezultat.replace("SS",sekunde);
		
		return rezultat;
	}
	
	public static void main(String[] args) {
		String r=konvertujVrijeme("12:30:23","HH:MM:SS","HHh-MMmin");
		System.out.println(r);
	}

}
//druga grupa
/*public static String konvertujDatum(String datum,String format,String zeljeniFromat) {
		int iGod=format.indexOf(YYYY");
		int iMJ=format.indexOf("MM");
		int iDan=format.indexOf("DD");
		
		String godina=vrijeme.substring(iSat,iGod+4);
		String mjesec=vrijeme.substring(iMin,iMj+2);
		String dan=vrijeme.substring(iSek,iDan+2);
		
		
		String rezultat=zeljeniFromat;
		
		rezultat=rezultat.replace("YYYY",godina);
		rezultat=rezultat.replace("MM",mjesec);
		rezultat=rezultat.replace("DD",dan);
		
		return rezultat;
	}
	
	public static void main(String[] args) {
		
	}

}
*/

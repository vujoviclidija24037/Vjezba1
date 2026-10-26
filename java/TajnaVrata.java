package java;

import java.util.Scanner;

public class TajnaVrata {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);

        System.out.print("Unesite trocifren broj: ");
        int n = unos.nextInt();

        int jedinice = n % 10;
        int desetice = (n / 10) % 10;
        int stotine  = n / 100;

        int proizvod = stotine * desetice * jedinice;
        int zbir     = stotine + desetice + jedinice;

        int kod = proizvod - zbir;

        System.out.println("Kod je: " + kod);
    }
}

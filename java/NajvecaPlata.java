package java;

public class NajvecaPlata {
    public static void main(String[] args) {
        int[] plate = {540, 690, 900};

       
        int najveca = plate[0];
        for (int p : plate) {
            if (p > najveca) {
                najveca = p;
            }
        }

       
        
        
        int druga = Integer.MIN_VALUE;
        for (int p : plate) {
            if (p != najveca && p > druga) {
                druga = p;
            }
        }

        System.out.println(druga); // 690
    }
}
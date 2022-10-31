package TaximeterCalculation;

import java.util.Scanner;

public class TaximeterCalculation {

    public static void main(String[] args) {
        final Scanner s = new Scanner(System.in);
        final int taximeterOpeningFee = 10;
        int visitedKm;
        double total = 0d;

        System.out.print("Gidilen km:");
        visitedKm = s.nextInt();

        total = visitedKm * 2.20 + 10;

        if(total < 20){
            System.out.println("Taksi tutarı: 20 TL");
        }else{
            System.out.println("Taksi tutarı: " + total + "TL");
        }

        s.close();
    }
}
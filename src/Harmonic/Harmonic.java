package Harmonic;

import java.util.Scanner;

public class Harmonic {

    public static void main(String[] args) {
        final Scanner s = new Scanner(System.in);
        int number;
        double harmonicSum = 0d;

        System.out.print("Bir sayi giriniz:");
        number = s.nextInt();

        for (double i = 1; i <= number; i++){
            harmonicSum += (1/i);
        }

        System.out.println("Harmonik hesap toplamı: " + harmonicSum);

        s.close();
    }
}
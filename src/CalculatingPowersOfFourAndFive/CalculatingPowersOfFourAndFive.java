package CalculatingPowersOfFourAndFive;

import java.util.Scanner;

public class CalculatingPowersOfFourAndFive {

    public static void main(String[] args) {
        final Scanner s = new Scanner(System.in);
        int number;

        System.out.print("Bir sayı giriniz:");
        number = s.nextInt();

        for (int i = 4; i <= number; i *= 4){
            System.out.println("Girilen sayidan kucuk dordun kuvvetleri : " + i);

        }

        for (int i = 5; i <= number; i *= 5){
            System.out.println("Girilen sayidan kucuk besin kuvvetleri : " + i);
        }

        s.close();
    }
}
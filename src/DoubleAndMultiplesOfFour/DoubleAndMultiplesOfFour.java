package DoubleAndMultiplesOfFour;

import java.util.Scanner;

public class DoubleAndMultiplesOfFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f, sum = 0;

        do {
            System.out.print("Sayı giriniz: ");
            f = sc.nextInt();
            if (f % 2 == 1){
                break;
            }else if(f % 2 == 0 || f % 4 == 0){
                sum += f;
            }
        } while (f > 0);

        System.out.print("4'ün katı ve çift olan sayıların toplamı = " + sum);
    }
}
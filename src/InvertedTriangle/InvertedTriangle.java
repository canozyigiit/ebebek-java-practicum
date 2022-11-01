package InvertedTriangle;

import java.util.Scanner;

public class InvertedTriangle {

    public static void main(String[] args) {
        final Scanner s = new Scanner(System.in);
        int number;

        System.out.print("Bir sayı giriniz : ");
        number = s.nextInt();

        for(int i = 0; i < number; i++) {

            for(int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= (2 * number - 1 - 2 * i); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
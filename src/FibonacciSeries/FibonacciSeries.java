package FibonacciSeries;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        final Scanner s = new Scanner(System.in);
        int first = 0, second = 1, total = 0, n ;

        System.out.print("Sayi giriniz: ");
        n = s.nextInt();

        System.out.print(first);

        for (int i = 1 ; i < n ; i++){
            total = first + second ;
            System.out.print(" " + total);
            first = second;
            second = total;
        }
    }
}
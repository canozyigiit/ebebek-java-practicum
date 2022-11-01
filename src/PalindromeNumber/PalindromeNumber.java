package PalindromeNumber;

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {
        final Scanner s = new Scanner(System.in);
        int number;
        int temp, reverseNumber=0, lastNumber;

        System.out.print("Bir sayı giriniz:");
        number = s.nextInt();
        temp = number;

        while(temp!=0){
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }

        if(number == reverseNumber)
            System.out.println("Sayi palidrom sayıdır");
        else
            System.out.println("Sayi palidrom sayi değildir");

        s.close();
    }
}
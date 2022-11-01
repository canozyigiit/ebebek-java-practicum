package PerfectNumber;

import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {
        final Scanner s = new Scanner(System.in);
        int number, total = 0;

        System.out.println("Sayi giriniz: ");
        number = s.nextInt();

        for(int i = 1; i < number; i++){
            if(number % i == 0){
                total += i;
            }
        }

        if(number == total){
            System.out.println(number + "mükemmel sayıdır");
        }else{
            System.out.println(number + "mükemmel sayı değildir");
        }
    }
}
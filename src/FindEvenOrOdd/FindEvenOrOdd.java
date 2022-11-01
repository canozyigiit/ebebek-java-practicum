package FindEvenOrOdd;

import java.util.Scanner;

public class FindEvenOrOdd {

    public static void main(String[] args) {
        int inputNumber, piece = 0, total = 0;
        double average;
        Scanner sc = new Scanner(System.in);

        System.out.print("Lütfen Bir Sayı Giriniz : ");
        inputNumber = sc.nextInt();

        for(int i = 0; i <= inputNumber; i++){
            if(i%3==0 && i%4==0){
                total += i;
                piece++;
            }
        }
        average = total /(piece -1);
        System.out.print("Sayıların ortalaması  : " + average);
        sc.close();

    }
}

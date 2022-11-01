package EbobEkok;

import java.util.Scanner;

public class EbobEkok {

    public static void main(String[] args) {
        final Scanner s = new Scanner(System.in);
        int ekok = 0, ebob = 0;
        int number1, number2;

        System.out.print("Birinci sayiyi giriniz:");
        number1 = s.nextInt();

        System.out.print("İkinci sayiyi giriniz:");
        number2 = s.nextInt();

        for(int i = 1; i < number1; i++)
        {
            if(number1 % i == 0 && number2 % i == 0) {
                ebob = i;
            }
        }

        for(int i = number1 * number2; i > 0; i--)
        {
            if(i % number1 == 0 && i % number2 == 0) {
                ekok = i;
            }
        }

        System.out.println("EBOB:  " + ebob);
        System.out.println("EKOK: " + ekok);

        s.close();
    }
}
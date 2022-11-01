package DigitTotal;

import java.util.Scanner;

public class DigitTotal {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.print("Lütfen bir tam sayı yazınınız: ");

        int sayi = girdi.nextInt();
        int toplam = 0;

        while (sayi != 0) {
            toplam += sayi % 10;
            sayi=sayi/10;
        }
        System.out.println("Yazdığınız sayının basamakları toplamı: "+toplam);
    }
}

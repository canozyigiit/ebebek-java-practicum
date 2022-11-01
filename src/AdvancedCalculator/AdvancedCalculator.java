package AdvancedCalculator;

import java.util.Scanner;

public class AdvancedCalculator {

    public static void main(String[] args) {
        final Scanner s = new Scanner(System.in);
        int select;

        String menu = "1-Toplama Islemi\n" +
                "2-Cikarma islemi\n" +
                "3=Carpma Islemi\n" +
                "4=Bolme Islemi\n" +
                "5-Uslu sayi hesaplama\n" +
                "6-Faktoriyel Hesaplama]\n" +
                "7-Diktortgen Alan ve Cevre Hesaplama\n" +
                "8-Mod alma islemi\n" +
                "0-Cikis yap";
        System.out.println(menu);

        do {
            System.out.print("Lutfen Bir Islem Seciniz :");
            select = s.nextInt();

            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    rectangle();
                    break;
                case 8:
                    mod();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");

            }
        } while (select != 0);

        s.close();
    }

    static void plus() {
        final Scanner s = new Scanner(System.in);
        int number, number2;

        System.out.println("Birinci degeri yazin : ");
        number = s.nextInt();

        System.out.println("Ikinci degeri yazin : ");
        number2 = s.nextInt();

        int result = (number + number2);
        System.out.println("Toplama isleminin snucu : " + result);

        s.close();
    }

    static void minus() {
        final Scanner s = new Scanner(System.in);
        int number, number2;

        System.out.println("Birinci degeri yazin : ");
        number = s.nextInt();

        System.out.println("Ikinci degeri yazin : ");
        number2 = s.nextInt();

        int result = (number - number2);
        System.out.println("Cikarma isleminin snucu : " + result);

        s.close();
    }

    static void times() {
        final Scanner s = new Scanner(System.in);
        int number, number2;

        System.out.println("Birinci degeri yazin : ");
        number = s.nextInt();

        System.out.println("Ikinci degeri yazin : ");
        number2 = s.nextInt();

        int result = (number * number2);
        System.out.println("Carpma isleminin snucu : " + result);

        s.close();
    }

    static void divided() {
        final Scanner s = new Scanner(System.in);
        double number, number2;

        System.out.println("Payi yazin : ");
        number = s.nextDouble();

        System.out.println("Paydayi degeri yazin : ");
        number2 = s.nextDouble();

        double result = (number / number2);
        if (number2 == 0) {
            System.out.println("Hatali sayi yazdiniz payda 0 olamaz tekrar deneyiniz !");
        } else {
            System.out.println("Bolme isleminin snucu : " + result);
        }

        s.close();
    }
    static void power(){
        final Scanner s = new Scanner(System.in);
        int base, pow, result = 1;

        System.out.println("Tabani  yazin : ");
        base = s.nextInt();

        System.out.println("Ussu yazin : ");
        pow = s.nextInt();

        for (int i = 1; i <= pow; i++){
            result *= base;

        }

        System.out.println(base + " Ussu " + pow + " isleminin sonucu : " + result);

        s.close();
    }
    static void factorial(){
        final Scanner s = new Scanner(System.in);
        int result = 1, num;

        System.out.print("Kac faktoriyel istediginizi girin : ");
        num = s.nextInt();

        for (int i = 1;i <= num; i++){
            result *= i;
        }

        System.out.println(num + " Faktoriyel = " + result);

        s.close();
    }
    static void rectangle(){
        final Scanner s = new Scanner(System.in);
        double num1,num2;

        System.out.println("Kisa kenari girin : ");
        num1= s.nextDouble();

        System.out.println("Uzun kenari girin : ");
        num2= s.nextDouble();

        double area = num1 * num2;
        double perimeter = (num1 + num2) * 2;

        System.out.println("Diktortgenin alani : " + area + " Diktortgenin cevresi : " + perimeter);

        s.close();
    }
    static void mod(){
        final Scanner s = new Scanner(System.in);
        double num1,num2;

        System.out.println("Modu alinacak sayiyi girin : ");
        num1 = s.nextDouble();

        System.out.println("Modu  girin : ");
        num2 = s.nextDouble();

        double result = num1 % num2;

        System.out.println(result);

        s.close();
    }
}
package Calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        final Scanner s = new Scanner(System.in);
        int num1, num2;
        int choice;

        System.out.print("Sayi 1 gir:");
        num1 = s.nextInt();

        System.out.print("Sayi 2 gir:");
        num2 = s.nextInt();

        System.out.println("1-Toplama \n 2-Çıkarma \n 3-Çarpma \n 4-Bölme \n");
        choice = s.nextInt();

        switch (choice){
            case 1:
                System.out.println("Toplama : " + (num1 + num2));
                break;
            case 2:
                System.out.println("Çıkarma : " + (num1 - num2));
                break;
            case 3:
                System.out.println("Çarpma : " + (num1 * num2));
                break;
            case 4:
                System.out.println("Bölme : " + (num1 / num2));
                break;
            default:
                System.out.println("Geçersiz işlem.");
                break;
        }

        s.close();
    }
}
package NumberSorting;

import java.util.Scanner;

public class NumberSorting {

    public static void main(String[] args) {
        final Scanner s = new Scanner(System.in);
        int num1, num2, num3;

        System.out.print("Sayi 1 gir: ");
        num1 = s.nextInt();

        System.out.print("Sayi 2 gir: ");
        num2 = s.nextInt();

        System.out.print("Sayi 3 gir: ");
        num3 = s.nextInt();

        if(num1 <= num2 && num1 <= num3){
            System.out.println(num2 <= num3 ? (num1 + " < " + num2 + " < " + num3): (num1 + " < " + num3 + " < " + num2));
        }

        if(num2 <= num1 && num2 <= num3){
            System.out.println(num1 <= num3 ? (num2 + " < " + num1 + " < " + num3): (num2 + " < " + num3 + " < " + num1));
        }

        if(num3 <= num1 && num3 <= num2){
            System.out.println(num1 <= num2 ? (num3 + " < " + num1 + " < " + num2): (num3 + " < " + num2 + " < " + num1));
        }

        s.close();
    }
}
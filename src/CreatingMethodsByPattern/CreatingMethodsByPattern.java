package CreatingMethodsByPattern;

import java.util.Scanner;

public class CreatingMethodsByPattern {
    static void pattern(int a) {
        if (a > 0) {
            System.out.print(a + " ");
            pattern(a - 5);
        }
        System.out.print(a + " ");
    }

    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Sayi giriniz:");
        number = input.nextInt();

        pattern(number);
    }
}
package RecursiveExponentiationNumber;

import java.util.Scanner;

public class RecursiveExponentiationNumber {

    static int exponentiation(int base, int exponent) {
        if (exponent == 0)
            return 1;
        return base * exponentiation(base, exponent - 1);
    }

    public static void main(String[] args) {
        final Scanner s = new Scanner(System.in);
        int base, exponent;

        System.out.print("Sayi giriniz: ");
        base = s.nextInt();

        System.out.print("Alınacak üs'ü giriniz: ");
        exponent = s.nextInt();

        System.out.println(exponentiation(base, exponent));

        s.close();
    }
}
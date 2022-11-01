package Combination;

import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {

        int n, r, com;
        int facn = 1, facr = 1, facnr = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen kombinasyonu alınacak sayıyı giriniz: ");
        n = input.nextInt();
        System.out.print("Lütfen kaçlı kombinasyonunu almak istiyorsanız sayıyı giriniz: ");
        r = input.nextInt();

        for (int i = 1; i <= n; i++){
            facn *= i;
        }

        for (int i = 1; i <= r; i++){
            facr *= i;
        }

        for (int i = 1; i <= (n-r); i++){
            facnr *= i;
        }

        com = facn/(facr*facnr);

        System.out.print("Kombinasyon : " + com);
    }
}
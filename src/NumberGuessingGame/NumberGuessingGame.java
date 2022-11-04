package NumberGuessingGame;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        final Scanner s = new Scanner(System.in);

        Random rand = new Random();
        int number = rand.nextInt(100);

        int right = 0;
        int guess;
        int[] wrongGuesses = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        while (right < 5) {
            System.out.println("---------------------------");
            System.out.print("Lütfen tahmin giriniz: ");
            guess = s.nextInt();

            if (guess < 0 || guess > 100) {
                System.out.println("\nLütfen tahmininiz 0 - 100 arasında giriniz.");

                if (isWrong) {
                    right++;
                    System.out.println("Yanlış bir giriş yaptın kalan hakkınız : " + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("Bir sonraki girişiniz kalan haklarınızdan düşürecektir");
                }
                continue;
            }

            if (guess == number) {
                System.out.println("\nTebrikler tahminin doğru, sayi: " + number);
                isWin = true;
                break;
            } else {
                System.out.println("\nTahmininiz yanlış");

                if (guess > number) {
                    System.out.println(guess + " tahmininiz girilen sayıdan yüksek.");
                } else {
                    System.out.println(guess + " tahmininiz girilen sayıdan küçük");
                }

                wrongGuesses[right] = guess;
                right++;
                System.out.println("Kalan hak: " + (5 - right));
            }
        }

        if (!isWin) {
            System.out.println("\nKaybettiniz...");
            System.out.println("Gizli sayı " + number);
            if (!isWrong) {
                System.out.println("Tahminlerin" + Arrays.toString(wrongGuesses));
            }
        }
    }
}

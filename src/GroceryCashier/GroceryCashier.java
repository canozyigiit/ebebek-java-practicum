package GroceryCashier;

import java.util.Scanner;

public class GroceryCashier {

    public static void main(String[] args) {
        final Scanner s = new Scanner(System.in);
        final double unitPearPrice = 2.14;
        final double unitApplePrice = 3.67;
        final double unitTomatoesPrice = 1.11;
        final double unitBananaPrice = 0.95;
        final double unitAuberginePrice = 5.00;
        double pearKilogram,appleKilogram,tomatoesKilogram,bananaKilogram,aubergineKilogram;

        double total = 0d;

        System.out.print("Aldığınız armut kilogramı: ");
        pearKilogram = s.nextDouble();

        System.out.print("Elma armut kilogramı: ");
        appleKilogram = s.nextDouble();

        System.out.print("Domates armut kilogramı: ");
        tomatoesKilogram = s.nextDouble();

        System.out.print("Muz armut kilogramı: ");
        bananaKilogram = s.nextDouble();

        System.out.print("Patlican armut kilogramı: ");
        aubergineKilogram = s.nextDouble();

        total = (pearKilogram * unitPearPrice)
                + (appleKilogram * unitApplePrice)
                + (tomatoesKilogram * unitTomatoesPrice)
                + (bananaKilogram * unitBananaPrice)
                + (aubergineKilogram * unitAuberginePrice);

        System.out.println("Toplam tutar : " + total);

        s.close();
    }
}
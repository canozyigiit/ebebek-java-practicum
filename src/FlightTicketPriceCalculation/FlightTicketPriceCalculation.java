package FlightTicketPriceCalculation;

import java.util.Scanner;

public class FlightTicketPriceCalculation {

    public static void main(String[] args) {
        final Scanner s = new Scanner(System.in);
        final double unitDistanceCharge = 0.1;

        int age, distance, tripType;

        System.out.print("Gideceğiniz mesafeyi(KM) giriniz:");
        distance = s.nextInt();

        System.out.print("Yaşınızı giriniz:");
        age = s.nextInt();

        System.out.print("Yolculuk tipini giriniz: (1 veya 2)");
        tripType = s.nextInt();

        if(!(age <= 0 || distance <= 0 || (tripType != 1 && tripType != 2))){
            double ageDiscount, normalPrice, totalPrice;

            if(tripType == 1){
                if (age < 12)
                {
                    normalPrice = distance * unitDistanceCharge;
                    ageDiscount = normalPrice * 0.50;
                    totalPrice = normalPrice - ageDiscount;
                    System.out.println("Ödeyeceğiniz tutar: " + totalPrice);
                } else if (age < 24 && age > 12)
                {
                    normalPrice = distance * unitDistanceCharge;
                    ageDiscount = normalPrice * 0.10;
                    totalPrice = normalPrice - ageDiscount;
                    System.out.println("Ödeyeceğiniz tutar: " + totalPrice);
                } else if (age > 65)
                {
                    normalPrice = distance * unitDistanceCharge;
                    ageDiscount = normalPrice * 0.30;
                    totalPrice = normalPrice - ageDiscount;
                    System.out.println("Ödeyeceğiniz tutar: " + totalPrice);
                }
            }else if(tripType == 2){
                double roundTrip, discountedPrice;

                if (age < 12)
                {
                    normalPrice = distance * unitDistanceCharge;
                    ageDiscount = normalPrice * 0.50;
                    discountedPrice = normalPrice - ageDiscount;
                    roundTrip = discountedPrice * 0.20;
                    totalPrice = (discountedPrice - roundTrip) * 2;
                    System.out.println("Ödeyeceğiniz tutar: " + totalPrice);

                } else if (age < 24 && age > 12)
                {
                    normalPrice = distance * unitDistanceCharge;
                    ageDiscount = normalPrice * 0.10;
                    discountedPrice = normalPrice - ageDiscount;
                    roundTrip = discountedPrice * 0.20;
                    totalPrice = (discountedPrice - roundTrip) * 2;
                    System.out.println("Ödeyeceğiniz tutar: " + totalPrice);

                } else if (age > 65)
                {
                    normalPrice = distance * unitDistanceCharge;
                    ageDiscount = normalPrice * 0.30;
                    discountedPrice = normalPrice - ageDiscount;
                    roundTrip = discountedPrice * 0.20;
                    totalPrice = (discountedPrice - roundTrip) * 2;
                    System.out.println("Ödeyeceğiniz tutar: " + totalPrice);
                }
            }
        }else{
            System.out.println("Hatali Veri Girdiniz!");
        }
        s.close();
    }
}
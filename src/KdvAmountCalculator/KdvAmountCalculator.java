package KdvAmountCalculator;
import java.util.Scanner;

public class KdvAmountCalculator {

    public static void main(String[] args) {
        final Scanner s = new Scanner(System.in);
        int price;

        System.out.print("Ürünün fiyatını giriniz:");
        price = s.nextInt();

        if(price >= 0 && price <= 1000){
            System.out.println("Ürünün kdv'si: " + (price * 0.18));
        }else{
            System.out.println("Ürünün kdv'si: " + (price * 0.08));
        }

        s.close();
    }
}
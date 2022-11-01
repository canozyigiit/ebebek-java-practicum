package SuggestingEvents;

import java.util.Scanner;

public class SuggestingEvents {

    public static void main(String[] args) {
        final Scanner s = new Scanner(System.in);
        int temperature;

        System.out.print("Hava sıcaklığını giriniz: ");
        temperature = s.nextInt();

        if(temperature < 5){
            System.out.println("Kayak");
        }else if(temperature >= 5 && temperature < 15){
            System.out.println("Sinema");
        }else if(temperature >= 15 && temperature < 25){
            System.out.println("Piknik");
        }else if(temperature >= 25){
            System.out.println("Yüzme");
        }

        s.close();
    }
}
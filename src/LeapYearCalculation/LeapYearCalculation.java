package LeapYearCalculation;

import java.util.Scanner;

public class LeapYearCalculation {

    public static void main(String[] args) {
        final Scanner s = new Scanner(System.in);
        int year;

        System.out.print("Yıl giriniz: ");
        year = s.nextInt();

        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                if ( year % 400 == 0)
                    System.out.println("Girdiğiniz yıl artık yıldır.");
                else
                    System.out.println("Girdiğiniz yıl artık yıl değildir.");
            }
            else
                System.out.println("Girdiğiniz yıl artık yıldır.");
        }
        else
            System.out.println("Girdiğiniz yıl artık yıl değildir.");


        s.close();

    }

}


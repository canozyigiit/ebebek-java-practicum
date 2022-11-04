package ArrayMinMax;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMinAndMax {

    public static void main(String[] args) {
        final Scanner s = new Scanner(System.in);
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};

        System.out.println(Arrays.toString(list));

        for (int item : list){
            System.out.print(item);
            System.out.print(" , ");
        }

        Arrays.sort(list);

        System.out.println();
        System.out.print("Sayi giriniz:  ");
        int nearNumber = s.nextInt();

        int minvalue = list[0];
        int maxvalue = list[0];

        for (int i : list){
            if (i < nearNumber){
                minvalue = i;
            }
            if (i > nearNumber){
                maxvalue = i;
                break;
            }
        }

        System.out.println("Girilen sayıya en yakın en küçük eleman:  " + minvalue);
        System.out.println("Girilen sayıya en yakın en büyük eleman:  " + maxvalue);
    }
}

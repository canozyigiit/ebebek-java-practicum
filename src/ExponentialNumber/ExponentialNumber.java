package ExponentialNumber;

import java.util.Scanner;

public class ExponentialNumber {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int i,num,exp,str=1;

        System.out.print("Sayiyi giriniz: ");
        num = scn.nextInt();
        System.out.print("Üssü giriniz: ");
        exp = scn.nextInt();

        for (i = 0;i<exp;i++){
            str*=num;
        }
        System.out.println("Sonuç: " + str);
    }
}
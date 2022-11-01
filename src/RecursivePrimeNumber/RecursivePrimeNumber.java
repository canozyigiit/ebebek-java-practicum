package RecursivePrimeNumber;

import java.util.Scanner;

public class RecursivePrimeNumber {

    static boolean checkPrime(int number,int index){
        if(number <= 2){
            return number == 2;
        }
        if(number % index==0){
            return false;
        }
        if(index * index > number){
            return true;
        }
        return checkPrime(number,index+1);

    }
    public static void main(String[] args) {
        final Scanner s = new Scanner(System.in);
        int number;

        while(true){
            System.out.print("Sayi giriniz: ");
            number = s.nextInt();

            if(checkPrime(number,2)){
                System.out.println(number+" asaldır.");
            }else{
                System.out.println(number+" asal değildir...");
            }
        }
    }
}
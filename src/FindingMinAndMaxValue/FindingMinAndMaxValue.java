package FindingMinAndMaxValue;

import java.util.Scanner;

public class FindingMinAndMaxValue {

    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);
        int limit, number , min = 0 , max = 0;

        System.out.print("Enter the limit : ");
        limit = input.nextInt();

        for (int i = 1 ; i <= limit ; i++){

            System.out.print("Enter the number : ");
            number = input.nextInt();

            if (i == 1){
                min = number;
                max = number;
            }

            if (min > number){
                min = number;

            }
            if (max < number){
                max = number;
            }

        }
        System.out.println("The smallest value = " + min);
        System.out.println("The biggest value = " + max);
    }
}
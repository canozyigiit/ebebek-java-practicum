package ArraySorting;

import java.util.Scanner;

public class ArraySortingApplication {

    public static int[] SelectionShort(int [] arr){
        int min, temp;

        for (int i = 0; i < arr.length; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        return arr;
    }

    public static void printArray(int [] arr){

        System.out.print("Sorted array = ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        final Scanner s = new Scanner(System.in);

        System.out.print("Dizi büyüklüğünü gir: ");

        int size = s.nextInt();
        int[] list = new int [size];
        int [] arr = new int[size];


        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + ". sayi gir = ");
            int number = s.nextInt();

            list[i] = number;
        }

        arr = SelectionShort(list);

        printArray(arr);

        s.close();
    }
}

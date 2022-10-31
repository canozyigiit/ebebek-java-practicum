package BodyMassIndexCalculation;

import java.util.Scanner;

public class BodyMassIndexCalculation {

    public static void main(String[] args) {
        final Scanner s = new Scanner(System.in);
        double size, kilo, index = 0d;

        System.out.print("Kilonuz: ");
        kilo = s.nextDouble();

        System.out.print("Boyunuz: ");
        size = s.nextDouble();

        index = kilo / (size * size);

        System.out.println("Vücut Kitle İndeksiniz : " + index);

        s.close();
    }
}
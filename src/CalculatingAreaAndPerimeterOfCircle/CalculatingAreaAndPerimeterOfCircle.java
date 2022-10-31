package CalculatingAreaAndPerimeterOfCircle;

import java.util.Scanner;

public class CalculatingAreaAndPerimeterOfCircle {

    public static void main(String[] args) {
        final Scanner s = new Scanner(System.in);
        final double pi = Math.PI;
        int halfDiameter;
        double area = 0d, environment = 0d;

        System.out.print("Yari çap giriniz: ");
        halfDiameter = s.nextInt();

        area = pi * halfDiameter * halfDiameter;
        environment = 2 * pi * halfDiameter;

        System.out.println("Dairenin alanı: " + area);
        System.out.println("Dairenin çevresi: " + environment);

        s.close();
    }
}
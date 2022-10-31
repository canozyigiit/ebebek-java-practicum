package FindingTheHypotenuseInRightTriangle;

import java.util.Scanner;

public class FindingTheHypotenuseInRightTriangle {

    public static void main(String[] args) {
        final Scanner s = new Scanner(System.in);

        int edge1, edge2, edge3;
        double area,u,environment;

        System.out.print("İlk kenarı giriniz:");
        edge1 = s.nextInt();

        System.out.print("İkinci kenarı giriniz:");
        edge2 = s.nextInt();

        System.out.print("Üçüncü kenarı giriniz:");
        edge3 = s.nextInt();

        u = (edge1 + edge2 + edge2) / 2;
        area = Math.sqrt(u * (u - edge1) * (u - edge2) * (u - edge3));
        environment = edge1 + edge2 + edge3;

        System.out.println("Üçgenin alanı: " + area);
        System.out.println("Üçgenin çevresi: " + environment);


        s.close();
    }
}
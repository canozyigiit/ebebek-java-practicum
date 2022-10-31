package com.not.ortalamasi;

import java.util.Scanner;

public class GradeAverageApplication {

    public static void main(String[] args) {
        final Scanner s = new Scanner(System.in);
        int math, physics, chemical, turkish, history, music;
        double average = 0d;

        System.out.print("Matematik notunu giriniz: ");
        math = s.nextInt();

        System.out.print("Fizik notunu giriniz: ");
        physics = s.nextInt();

        System.out.print("Kimya notunu giriniz: ");
        chemical = s.nextInt();

        System.out.print("Türkçe notunu giriniz: ");
        turkish = s.nextInt();

        System.out.print("Tarih notunu giriniz: ");
        history = s.nextInt();

        System.out.print("Müzik notunu giriniz: ");
        music = s.nextInt();

        average = (math + physics + chemical + turkish + history + music) / 5;

        System.out.println(average > 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı");

        s.close();
    }
}
package PassStatus;

import java.util.Scanner;

public class PassStatus {

    public static void main(String[] args) {
        final Scanner s = new Scanner(System.in);
        final int LESSON_COUNT = 5;
        int math, physics, chemical, turkish, music;
        int totalLessonPoint = 0;
        double average = 0d;

        System.out.print("Matematik notunu giriniz: ");
        math = s.nextInt();

        System.out.print("Fizik notunu giriniz: ");
        physics = s.nextInt();

        System.out.print("Kimya notunu giriniz: ");
        chemical = s.nextInt();

        System.out.print("Türkçe notunu giriniz: ");
        turkish = s.nextInt();

        System.out.print("Müzik notunu giriniz: ");
        music = s.nextInt();

        if(math >= 0 && math <= 100) {
            totalLessonPoint += math;
        }

        if(physics >= 0 && physics <= 100){
            totalLessonPoint += physics;
        }

        if(turkish >= 0 && turkish <= 100) {
            totalLessonPoint += turkish;
        }

        if(chemical >= 0 && chemical <= 100) {
            totalLessonPoint+= chemical;
        }

        if(music >= 0 && music <= 100) {
            totalLessonPoint += music;
        }

        average = totalLessonPoint / LESSON_COUNT;

        if(average >= 55) {
            System.out.print("Sınıfı Geçti");
        }else{
            System.out.print("Sınıfta Kaldı");
        }

        s.close();
    }
}
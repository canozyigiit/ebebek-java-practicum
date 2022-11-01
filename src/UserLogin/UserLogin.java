package UserLogin;

import java.util.Scanner;

public class UserLogin {

    public static void main(String[] args) {
        String username, password, choice, newPassword ;
        final Scanner s = new Scanner(System.in);

        System.out.print("Kullanci Adinizi yaziniz: ");
        username = s.nextLine();

        System.out.print("Sifrenizi yaziniz:");
        password = s.nextLine();

        if (username.equals("patika") && password.equals("java") ){
            System.out.println(" ***  Giris yaptiniz **** ");
        }
        else{
            System.out.println("Girilen şifre hatalı, şifrenizi sıfırlamak için yes/no seçiniz...");

            choice = s.nextLine();

            if(choice.equals("no")){
                System.out.println(" giris sonlandirildi ");}

            else if (choice.equals("yes")) {
                System.out.println(" yeni sifrenizi yazin ");
                newPassword = s.nextLine();

                if(newPassword.equals("java") || newPassword.equals(password)){
                    System.out.println("Hatali giris tekrar dene...");
                }
                else{
                    System.out.println("Şifreniz basariyla yenilendi.");
                }
            }
            else{
                System.out.println("Hatalı seçim yaptınız. ");
            }
        }
    }
}
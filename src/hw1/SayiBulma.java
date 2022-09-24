package hw1;

import java.util.Scanner;

public class SayiBulma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] sayilar = new int[5];
        sayilar[0] = 1;
        sayilar[1] = 4;
        sayilar[2] = 5;
        sayilar[3] = 2;
        sayilar[4] = 9;
        int aranacakSayi = scanner.nextInt();
        boolean varmi = false;
        for (int sayi : sayilar) {
            if (sayi == aranacakSayi) {
                varmi = true;
                break;
            }
        }
        if (varmi) {
            System.out.println("Girdiginiz sayi mevcuttur");
        } else {
            System.out.println("Girdiginiz sayi mevcut degildir");
        }
    }
}

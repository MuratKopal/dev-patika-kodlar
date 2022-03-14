package methods;

import java.util.Scanner;

public class UsluSayiHesaplama {
    static void power () {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban sayısını giriniz : ");
        int base = scan.nextInt();
        System.out.print("Üs sayısını giriniz : ");
        int exponent = scan.nextInt();
        int result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        System.out.println("Sonuç : " + result);
    }

    public static void main(String[] args) {
        power();
    }
}

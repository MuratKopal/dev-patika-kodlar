package methods;

import java.util.Scanner;

public class DeseneGoreMetot {
    static int i = 0;
    static void pattern(int num, int n) {
        System.out.print(num + " ");

        if (num > 0 && i == 0) {
            pattern(num - 5, n);
        } else if (num <= 0 || i == 1) {
            i = 1;
            if (num < n)
                pattern(num + 5, n);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int num = scan.nextInt();
        pattern(num, num);
    }
}

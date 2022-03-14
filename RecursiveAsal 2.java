package methods;

import java.util.Scanner;

public class RecursiveAsal {
    static int asal(int num,int n)
    {
        if(num<2)
            return 0;
        if(n==1)
            return 1;
        else
        {
            if(num % n == 0)
                return 0;
            else
                return asal(num, n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int num = scan.nextInt();
        int status=asal(num,num/2);
        if(status==0)
            System.out.print(num+" Asal sayı degildir.");
        else
            System.out.print(num+" Asal sayıdır.");
    }
}

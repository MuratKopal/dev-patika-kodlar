package If;

import java.util.Scanner;

public class NotOrtalamasiHesaplama {

    public static void main(String[] args) {

        double matematik, fizik, kimya, turkce, tarih, muzik;

        Scanner scan = new Scanner(System.in);

        System.out.println("Matematik Notunuzu Giriniz : ");
        matematik = scan.nextDouble();
        System.out.println("Fizik Notunuzu Giriniz : ");
        fizik = scan.nextDouble();
        System.out.println("Kimya Notunuzu Giriniz : ");
        kimya = scan.nextDouble();
        System.out.println("Türkçe Notunuzu Giriniz : ");
        turkce = scan.nextDouble();
        System.out.println("Tarih Notunuzu Giriniz : ");
        tarih = scan.nextDouble();
        System.out.println("Müzik Notunuzu Giriniz : ");
        muzik = scan.nextDouble();

        double ortalama = (matematik + fizik + kimya + turkce + tarih + muzik)/6;
        System.out.println("Not Ortalamanız : " + ortalama);
        String sonuc = (ortalama > 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(sonuc);




    }

}

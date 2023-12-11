import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Ilk olarak degiskenler olusturuldu
        int Mat, Fiz, Turkce, Tarih, Muzik;

        // Scanner sınıfı tanımlandı
        Scanner inp = new Scanner(System.in);

        // Inputlar teker teker alındı
        System.out.print(" Matematik Notunu Giriniz: ");
        Mat = inp.nextInt();

        System.out.print(" Fizik Notunu Giriniz: ");
        Fiz = inp.nextInt();

        System.out.print(" Turkce Notunu Giriniz: ");
        Turkce = inp.nextInt();

        System.out.print(" Tarih Notunu Giriniz: ");
        Tarih = inp.nextInt();

        System.out.print(" Muzik Notunu Giriniz: ");
        Muzik = inp.nextInt();

        // Toplam not bulundu sonrasında ise ortalama hesaplandı.

        int toplam = (Mat + Fiz + Turkce + Tarih + Muzik);

        double sonuc = (toplam/5.0);

        // Ilk once ortalama print edildi, sonrasında ise kosullu ifade kullanılarak Gecip kaldıgı belirlendi.

        System.out.println(" Ortalama : " + sonuc);

        System.out.println( sonuc < 60 ? "Üzgünüz kaldınız": "Tebrikler Gectiniz");

    }
}
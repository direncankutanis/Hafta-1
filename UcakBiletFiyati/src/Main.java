import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Degiskenler Tanimlandi.
        int mesafe, yas, yolculukTipi;
        double ucretTotal;

        Scanner input = new Scanner(System.in);

        // Girdiler alındı
        System.out.println("Gidilecek mesafeyi giriniz(km): ");
        mesafe = input.nextInt();

        // Mesafe alındıktan sonra ucret hesaplanmalı
        ucretTotal = mesafe * 0.10;

        System.out.println("Yasınızı Giriniz: ");
        yas = input.nextInt();
        System.out.println("Yolculuk Tipini Giriniz(1 - Tek Yön, 2 - Gidiş-Dönüş): ");
        yolculukTipi = input.nextInt();

        // Kosul olusturuldu
        if ((mesafe > 0 && yas > 0) && (yolculukTipi == 1 || yolculukTipi == 2)) {
            if (yas < 12 & yolculukTipi == 1) {
                System.out.println("TekYön Bilet Fiyatı: " + (ucretTotal *= 0.5) + (" TL"));
            } else if ((12 <= yas && yas <= 24) & yolculukTipi == 1) {
                System.out.println("TekYön Bilet Fiyatı: " + (ucretTotal *= 0.9)+ (" TL"));
            } else if ((yas >= 65) & yolculukTipi == 1) {
                System.out.println("TekYön Bilet Fiyatı: " + (ucretTotal *= 0.7)+ (" TL"));
            }

            // Gidiş-dönüş için ayrı bir indirim hesaplaması yapıldı
            if (yolculukTipi == 2) {
                ucretTotal *= 0.8;
            }

            // Ucret bilgisi genel olarak ekrana yazdırıldı
            System.out.println("Gidiş - Dönüş Bilet Fiyatı: " + ucretTotal + (" TL"));
        } else {
            System.out.println("Hatalı Bilgi Girdiniz");
        }

        // Scanner kapatıldı
        input.close();

    }
}
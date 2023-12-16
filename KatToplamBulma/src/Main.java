import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // degisken tanimlama
        int sayi;
        int toplamSayi = 0;

        Scanner inp = new Scanner(System.in);

        // Kosul olusturma
        do {
            System.out.println("İstediginiz sayiyi giriniz: ");
            sayi = inp.nextInt();

            if (sayi % 4 == 0) {
                toplamSayi += sayi;
            }

        } while (sayi % 2 == 0);

        System.out.println("İstenilen sayıların toplamı " + toplamSayi + "'dır");


    }
}
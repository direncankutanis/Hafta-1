import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //İlk önce degisken atandi
        Double urunFiyati;
        // Scanner tanimlandi
        Scanner input = new Scanner(System.in);

        // Input alındı
        System.out.println(" Urun Fiyatını Giriniz: ");
        urunFiyati = input.nextDouble();

        // KDV tutari bulundu

        Double kdv = (urunFiyati * 0.18);

        System.out.println(" Odenen kdv tutari: " + kdv);

        // KDV'li Toplam Fiyat hesaplandi.

        Double toplamFiyat = (urunFiyati + kdv);

        System.out.println("Urunun KDV'li toplam fiyatı: " + toplamFiyat);










    }
}
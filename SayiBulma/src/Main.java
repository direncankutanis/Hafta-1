
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // degiskenler tanimlandi
        int istenenSayi;

        Scanner inp = new Scanner(System.in);

        System.out.print("Istediginiz sayıyı giriniz: ");

        istenenSayi = inp.nextInt();

        int toplam = 0;
        int adet = 0;

        // Dongü yaratıldı

        for (int i = 0; i <= istenenSayi; i++) {
            if ((i % 4 == 0) && (i % 3 == 0)) {
                toplam += i;
                adet++;
            }


        }
        // Ortalaması hesaplandı
        double ortalamaSayi = (toplam / adet);
        System.out.println("0'dan " + istenenSayi + " kadar olan 3 ve 4'e tam bölünen sayıların ortalaması: " + ortalamaSayi);


    }
}
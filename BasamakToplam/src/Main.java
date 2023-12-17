import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Sayı Giriniz: ");
        int sayi = inp.nextInt();

        int toplam = 0;
        int kalan;

        while (sayi > 0) {
            kalan = sayi % 10;
            toplam += kalan;
            sayi /= 10;
        }
        System.out.println("Girdiginiz sayının basamakları toplamı: " + toplam);


    }
}
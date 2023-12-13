import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Degiskenler tanimladi.
        int a, b, c;

        // Scanner tanimlandi.
        Scanner input = new Scanner(System.in);

        System.out.println("a sayısını giriniz: ");
        a = input.nextInt();

        System.out.println("b sayısını giriniz: ");
        b = input.nextInt();

        System.out.println("c sayısını giriniz: ");
        c = input.nextInt();

        int islem = (a + b * c - b);

        // Sonuc yazdırma
        System.out.println("İşlemin sonucu: " + islem);
    }
}

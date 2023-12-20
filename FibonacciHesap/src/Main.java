import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Eleman sayısı giriniz: ");
        int sayi = scanner.nextInt();

        int sayi1 = 0, sayi2 = 1, sonrakiSayi;

        for (int i = 1; i <= sayi; i++) {
            System.out.print(sayi1 + " ");

            sonrakiSayi = sayi1 + sayi2;
            sayi1 = sayi2;
            sayi2 = sonrakiSayi;
        }
    }
}

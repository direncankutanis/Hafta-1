import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Bir sayi giriniz");
        int sayi = inp.nextInt();
        int toplam = 0;

        if (sayi > 0) {
            for (int i = 1; i < sayi; i++) {
                if (sayi % i == 0) {
                    toplam += i;
                }
            }
            if (toplam == sayi) {
                System.out.println(sayi + " Mükemmel bir sayidir.");
            } else {
                System.out.println(sayi + " Mükemmel bir sayi değildir.");
            }
        } else {
            System.out.println("Negatif bir sayı girdiniz.");
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        // Kullanıcıdan n ve r degerleri alındı
        System.out.println("Lütfen n degerini giriniz: ");
        int n = inp.nextInt();

        System.out.println("Lütfen r degerini giriniz: ");
        int r = inp.nextInt();

        // Hatalı girişi kontrol et
        if (n < r || r < 0) {
            System.out.println("Hatalı Giriş");
        } else {
            int totalN = 1, totalR = 1, asılTotal = 1;
            for (int i = 1; i <= n; i++) {
                totalN = totalN * i;
            }
            for (int i = 1; i <= r; i++) {
                totalR = totalR * i;
            }
            for (int i = 1; i <= n - r; i++) {
                asılTotal = asılTotal * i;
            }

            int komb = (totalN / (totalR * asılTotal));
            System.out.println("n sayısının r ile kombinasyonu: " + komb + " olarak hesaplandı");
        }
    }
}


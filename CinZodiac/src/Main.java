import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // degiskenler tanimlandı
        int dogumYili;

        Scanner input = new Scanner(System.in);

        System.out.println("Doğum yılınızı giriniz");
        dogumYili = input.nextInt();

        // Kosul tanımlandı.

        if (dogumYili > 0 && dogumYili <= 2023) {
            int kalan = dogumYili % 12;
            if (kalan == 0) {
                System.out.println("Çin zodyağınız Maymun");
            } else if (kalan == 1) {
                System.out.println("Çin zodyağınız Horoz");
            } else if (kalan == 2) {
                System.out.println("Çin zodyağınız Köpek");
            } else if (kalan == 3) {
                System.out.println("Çin zodyağınız Domuz");
            } else if (kalan == 4) {
                System.out.println("Çin zodyağınız Fare");
            } else if (kalan == 5) {
                System.out.println("Çin zodyağınız Öküz");
            } else if (kalan == 6) {
                System.out.println("Çin zodyağınız Kaplan");
            } else if (kalan == 7) {
                System.out.println("Çin zodyağınız Tavşan");
            } else if (kalan == 8) {
                System.out.println("Çin zodyağınız Ejderha");
            } else if (kalan == 9) {
                System.out.println("Çin zodyağınız Yılan");
            } else if (kalan == 10) {
                System.out.println("Çin zodyağınız At");
            } else if (kalan == 11) {
                System.out.println("Çin zodyağınız Koyun");
            } else {
                System.out.println("Jesus?");
            }
        } else {
            System.out.println("Jesus ? ");
        }
    }
}

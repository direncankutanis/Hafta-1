import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Kullanıcıdan tam sayı  almak
        System.out.print("Bir tam sayı girin: ");
        int tamSayi = scanner.nextInt();

        // Kullanıcıdan ondalıklı sayı girişi almak
        System.out.print("Bir ondalıklı sayı girin: ");
        double ondalikliSayi = scanner.nextDouble();

        // Implicit (otomatik) tip dönüşümü
        double tamSayiOndalikli = tamSayi; // Tam sayıyı ondalıklıya dönüştür

        int ondalikliSayiTam = (int) ondalikliSayi; // Ondalıklı sayıyı tam sayıya dönüştür

        // Sonuçları ekrana yazdır
        System.out.println("Girilen tam sayı: " + tamSayi);
        System.out.println("Girilen ondalıklı sayı: " + ondalikliSayi);
        System.out.println("Tam sayıyı ondalıklıya dönüştürüldü (Implicit): " + tamSayiOndalikli);
        System.out.println("Ondalıklı sayıyı tam sayıya dönüştürüldü: " + ondalikliSayiTam);
    }

}

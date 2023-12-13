import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // degiskenler tanimlandi
        int sayi1, sayi2, secim;

        Scanner input = new Scanner(System.in);
        System.out.print("ilk sayiyi giriniz: ");
        sayi1 = input.nextInt();

        System.out.print("ikinci sayiyi giriniz: ");
        sayi2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarna\n3-Carpma\n4-Bolme");
        System.out.print("Seciminiz nedir?: ");
        secim = input.nextInt();

        // Switch case kullanarak islem secimini yapmak

        switch (secim) {
            case 1:
                secim = sayi1 + sayi2;
                System.out.print("Toplama isleminizin sonucu: " + secim);
                break;
            case 2:
                secim = sayi1 - sayi2;
                System.out.print("Cıkarma isleminizin sonucu: " + secim);
                break;
            case 3:
                secim = sayi1 * sayi2;
                System.out.print("Carpma isleminizin sonucu: " + secim);
                break;
            case 4:
                secim = sayi1 / sayi2;
                System.out.print("Bolme isleminizin sonucu: " + secim);
                break;
            default:
                System.out.println("Gecersiz bir sayi girdiniz");

        }
    }
}
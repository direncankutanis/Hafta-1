import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // degiskenler tanımlandı.
        int day, month;

        Scanner input = new Scanner(System.in);

        System.out.println("Doğdugunuz günü giriniz");
        day = input.nextInt();

        System.out.println("Doğdugunuz ayı giriniz");
        month = input.nextInt();

        if ((day >= 21 && month == 3) || (day <= 20 && month == 4)) {
            System.out.println("Burcunuz Koç");
        } else if ((day >= 21 && month == 4) || (day <= 21 && month == 5)) {
            System.out.println("Burcunuz Boğa");
        } else if ((day >= 22 && month == 5) || (day <= 22 && month == 6)) {
            System.out.println("Burcunuz ikizler");
        } else if ((day >= 23 && month == 6) || (day <= 22 && month == 7)) {
            System.out.println("Burcunuz Yengeç");
        } else if ((day >= 23 && month == 7) || (day <= 22 && month == 8)) {
            System.out.println("Burcunuz Aslan");
        } else if ((day >= 23 && month == 8) || (day <= 22 && month == 9)) {
            System.out.println("Burcunuz Basak");
        } else if ((day >= 23 && month == 9) || (day <= 22 && month == 10)) {
            System.out.println("Burcunuz Terazi");
        } else if ((day >= 23 && month == 10) || (day <= 21 && month == 11)) {
            System.out.println("Burcunuz Akrep");
        } else if ((day >= 22 && month == 11) || (day <= 21 && month == 12)) {
            System.out.println("Burcunuz Yay");
        } else if ((day >= 22 && month == 12) || (day <= 21 && month == 1)) {
            System.out.println("Burcunuz Oglak");
        } else if ((day >= 22 && month == 1) || (day <= 19 && month == 2)) {
            System.out.println("Burcunuz Kova");
        } else if ((day >= 20 && month == 2) || (day <= 20 && month == 3)) {
            System.out.println("Burcunuz Koç");
        } else {
            System.out.println("Yanlıs tarih girdiniz");
        }


    }
}
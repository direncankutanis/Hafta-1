import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // degisken tanimlandi
        int sayi;

        Scanner input = new Scanner(System.in);

        System.out.println("Bir sayı giriniz: ");
        sayi = input.nextInt();

        // Kosul tanimlama
        double harmonikToplam = 0;

        for (double i = 1; i <= sayi; i++ ){
            harmonikToplam += (1/i);
        }

        System.out.println(sayi + " 'ın harmonik serisi: " + harmonikToplam + "dır.");



    }
}
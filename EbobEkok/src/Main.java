import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Degiskenler tanimlandi
        Scanner inp = new Scanner(System.in);

        System.out.println("llk sayiyi giriniz");
        int sayi1 = inp.nextInt();
        System.out.println("ikinci sayiyi giriniz");
        int sayi2 = inp.nextInt();
        int ekok;

        // Ebob bulma
        int ebob = 1;
        int i = 1;


        while (i <= sayi1 && i <= sayi2) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                ebob = i;
            }
            i++;
        }

        System.out.println("İki sayınıın ebob'u " + ebob + " sayısıdır.");
        // ekok bulma
        ekok = (sayi2 * sayi1) / ebob;

        System.out.println("İki sayınıın ekok'u " + ekok + " sayısıdır.");


    }
}
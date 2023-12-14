import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Degiskenler belirlendi.
        int sayi1, sayi2, sayi3;

        Scanner input = new Scanner(System.in);

        System.out.print("Sayi1'i Giriniz: ");
        sayi1 = input.nextInt();

        System.out.print("Sayi2'i Giriniz: ");
        sayi2 = input.nextInt();

        System.out.print("Sayi3'i Giriniz: ");
        sayi3 = input.nextInt();

        // Bu sayıları sıralam
        if ((sayi1 > sayi2) && (sayi1 > sayi3)) {
            if (sayi2 > sayi3) {
                System.out.println("Sayi1 > Sayi2 > Sayi3");

            } else if (sayi3 > sayi2) {
                System.out.println(" Sayi1 > Sayi3 > Sayi2");
            } else {
                System.out.println(" Sayi1 > Sayi3 = Sayi2");

            }
        } else if ((sayi2 > sayi3) && (sayi2 > sayi1)) {
            if (sayi3 > sayi1) {
                System.out.println("Sayi2 > Sayi3 > Sayi1");
            } else if (sayi1 > sayi3) {
                System.out.println("Sayi2 > Sayi1 > Sayi3");
            } else {
                System.out.println("Sayi2 > Sayi1 = Sayi3");
            }
        } else if ((sayi3 > sayi2) && (sayi3 > sayi1)) {
            if (sayi2 > sayi1) {
                System.out.println("Sayi3 > Sayi2 > Sayi1");
            } else if (sayi1 > sayi2) {
                System.out.println("Sayi3 > Sayi1 > Sayi3");

            } else {
                System.out.println("Sayi3 > Sayi1 = Sayi2");

            }
        } else {
            System.out.println("Sayi3 = Sayi1 = Sayi2");


        }


    }
}
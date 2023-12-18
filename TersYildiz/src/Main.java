import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Lütfen Bir basamak sayısı giriniz");
        int satirSayisi = inp.nextInt();

        for (int i = 0; i < satirSayisi; i++) {
            // Boşlukları yazdır
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Yıldızları yazdır
            for (int k = 0; k < 2 * (satirSayisi - i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();


        }

    }
}
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan degerleri alma
        System.out.println("Taban giriniz: ");
        int a = inp.nextInt();

        System.out.println("Us giriniz: ");
        int b = inp.nextInt();

        //Dongu yaratarak ussun alınması
        int carpim = 1;
        for (int i = 1; i <= b; i++) {
            carpim *= a;
        }
        System.out.println(a + "Sayısının " + b + "üssü: " + carpim + " dır");


    }
}
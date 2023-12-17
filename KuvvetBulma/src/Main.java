import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // degisken tanimlandi
        int istenilenSayi;

        Scanner input = new Scanner(System.in);

        System.out.println("Bir sayı giriniz: ");
        istenilenSayi = input.nextInt();

        // ilk döngü 4 ün kuvvetleri icin
        for (int i = 1; i <= istenilenSayi; i*=4 ){
            System.out.print(i + ",");
        }

        // ikinci döngü 5 'in katları icin
        for (int i = 1; i <= istenilenSayi; i*=5 ){
            System.out.print(i + ",");
        }

    }
}
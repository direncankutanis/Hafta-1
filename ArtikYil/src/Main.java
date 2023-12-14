import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // degisken tanimlandı
        int year;

        Scanner input = new Scanner(System.in);

        System.out.println("Bakılmasını istediginiz yılı giriniz: ");
        year = input.nextInt();

        // kosul tanımlamasi

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + "  senesi artık senedir.");
        } else {
            System.out.println(year + "  senesi artık sene degildir.");
        }


    }
}
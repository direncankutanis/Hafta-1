import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Ilk once degiskenler tanimlandi
        Double kilo, boy;

        //Scanner tanimlandi
        Scanner input = new Scanner(System.in);

        //Input girisi
        System.out.println("Kilonuzu Giriniz(kg): ");
        kilo = input.nextDouble();

        System.out.println("Boyunuzu Giriniz(m): ");
        boy = input.nextDouble();

        // Vucut index'i ölçme
        Double index = (kilo/(boy*boy));
        System.out.println("Vucut Kitle Indexiniz: " + index);





    }
}
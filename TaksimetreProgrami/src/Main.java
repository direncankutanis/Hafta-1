import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // degiskenler tanimlandi
        Double km, minTutar, taksimetreAcilis;

        // Scanner tanimlandi.
        Scanner input = new Scanner(System.in);

        //input
        System.out.println("Kaç Km Yol Gittiniz: ");
        km = input.nextDouble();

        System.out.println("min Tutar giriniz: ");
        minTutar = input.nextDouble();

        System.out.println("Taksimetre acilis ücreti: ");
        taksimetreAcilis = input.nextDouble();

        // Toplam tutarı hesaplama

        Double taksimetreUcreti = ((km * 2) + (taksimetreAcilis));

        taksimetreUcreti = (taksimetreUcreti < minTutar) ? minTutar : taksimetreUcreti;
        System.out.println("Taksimetre ücreti: " + taksimetreUcreti);










    }
}
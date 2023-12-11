import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // a ve b kenarları tanimlandi.
        Double aKenar, bKenar;

        // Scanner tanimlandi
        Scanner input = new Scanner(System.in);

        // Input
        System.out.println("a kenarını giriniz: ");
        aKenar = input.nextDouble();

        System.out.println("b kenarini giriniz: ");
        bKenar = input.nextDouble();

        // c kenarını bulma

        Double cKenar = Math.sqrt( (aKenar * aKenar) + (bKenar * bKenar));
        System.out.println(" Hipotenüs uzunlugu: " + cKenar);

        // Bu matematik icin üzgünüm odevde verilen formul :(

        Double u = ((aKenar + bKenar + cKenar) / 2);

        Double alan = Math.sqrt((u *(u - aKenar) *(u - bKenar) * (u - cKenar)));

        System.out.println("Ucgenin Alani: " + alan);








    }
}
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Meyve ve Sebzelerin kilo fiyatı girildi.
        final Double armutkgfiyat = 2.14;
        final Double elmakgfiyat = 3.67;
        final Double domateskgfiyat = 1.11;
        final Double muzkgfiyat = 0.95;
        final Double patlicankgfiyat = 5.00;

        // Scanner tanimlandi.
        Scanner input = new Scanner(System.in);

        // Kaç kilo aldıgı girildi.
        System.out.println("Kaç kg Armut aldınız: ");
        Double armutkilo = input.nextDouble();
        Double totalarmut = armutkgfiyat * armutkilo;

        System.out.println("Kaç kg Elma aldınız: ");
        Double elmakilo = input.nextDouble();
        Double totalelma = elmakgfiyat * elmakilo;

        System.out.println("Kaç kg Domates aldınız: ");
        Double domateskilo = input.nextDouble();
        Double totaldomates = domateskgfiyat * domateskilo;

        System.out.println("Kaç kg Muz aldınız: ");
        Double muzkilo = input.nextDouble();
        Double totalmuz = muzkgfiyat * muzkilo;

        System.out.println("Kaç kg Patlican aldınız: ");
        Double patlicankilo = input.nextDouble();
        Double totalpatlican = patlicankgfiyat * patlicankilo;

        // total fiyat
        Double ManavTutar = (totalarmut + totalelma + totaldomates + totalmuz + totalpatlican);
        System.out.println("Toplamda Manav ücretiniz: " + ManavTutar);



    }
}
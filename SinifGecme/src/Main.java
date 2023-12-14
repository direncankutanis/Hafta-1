import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double Matematik, Fizik, Turkce, Kimya, Muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunu Giriniz: ");
        Matematik = input.nextDouble();

        System.out.print("Fizik Notunu Giriniz: ");
        Fizik = input.nextDouble();

        System.out.print("Turkce Notunu Giriniz: ");
        Turkce = input.nextDouble();

        System.out.print("Kimya Notunu Giriniz: ");
        Kimya = input.nextDouble();

        System.out.print("Muzik Notunu Giriniz: ");
        Muzik = input.nextDouble();

        Double totalNot = ((Matematik + Fizik + Turkce + Kimya + Muzik) / 5);

        if (0 <= totalNot && totalNot <= 100) {
            if (totalNot < 55) {
                System.out.print("Uzgünüz Kaldınız");
            } else {
                System.out.print("Tebrikler Gectiniz");
            }
        } else {
            System.out.print("Notunuz 0 ile 100 arasında değil ????");
        }





    }
}
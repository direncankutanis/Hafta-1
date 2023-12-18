import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // degiskenler tanimlandi
        Scanner inp = new Scanner(System.in);

        System.out.println("Kac sayi gireceksiniz: ");
        int n = inp.nextInt();

        if (n < 1) {
            System.out.println("1'den fazla sayı girmeniz gerekmektedir.");
        }

        int number;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int i = 1;

        while (i <= n) {
            if (i == 1) {
                System.out.println(i + ". İlk sayıyı giriniz: .");
            } else {
                System.out.println(i + ". Sıradaki sayıyı giriniz: .");
            }

            number = inp.nextInt();
            if (number > max) {
                max = number;
            }
            if (min > number) {
                min = number;
            }
            i++;
        }

        System.out.println(max + " Bu sayılar arasındaki en büyük sayıdır.");
        System.out.println(min + " Bu sayılar arasındaki en küçük sayıdır.");
    }
}


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        for (int sayi = 2; sayi <= 100; sayi++) {
            int bölenSayısı = 0;

            for (int i = 2; i <= sayi / 2; i++) {
                if (sayi % i == 0) {
                    bölenSayısı++;
                    break; // Eğer bir bölen bulunduysa döngüden çıkılır
                }
            }

            if (bölenSayısı == 0) {
                System.out.print(sayi + " ");
            }
        }

    }
}
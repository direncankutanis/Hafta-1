import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // degiskenler tanimlandi
        int r;
        int 𝛼;
        double pi = 3.14;

        Scanner input = new Scanner(System.in);

        // input
        System.out.println("Yaricapi Giriniz: ");
        r = input.nextInt();

        System.out.println("Merkez aci olcusu giriniz: ");
        𝛼 = input.nextInt();

        // Alan hesaplama
        Double Alan = ((pi * (r*r) * 𝛼) / 360);

        System.out.println("Dairenin Alani: " + Alan);



    }
}


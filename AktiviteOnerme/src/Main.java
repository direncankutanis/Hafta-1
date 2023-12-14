import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // degiskenler belirlendi
        int sicaklik;

        Scanner input = new Scanner(System.in);
        // Kullanıcıdan sıcaklık bilgisi alınsın
        System.out.println("Lütfen sıcaklıgı giriniz: ");
        sicaklik = input.nextInt();

        //Koşula göre aktivite belirleme
        if (-5 < sicaklik && sicaklik < 25){
            if (sicaklik < 5){
                System.out.println("Kayak yapabilirsin.");

            }else if(5 < sicaklik && sicaklik < 15){
                System.out.println("Sinemaya Gidebilirsin.");

            }else if (15 < sicaklik && sicaklik < 25){
                System.out.println("Piknik yapabilirsin.");

            }else{
                System.out.println("Yüzmeye Gidebilirsin.");

            }
            }else{
            System.out.println("Bu havada dışarı mı çıkılır ?.");

        }



    }

}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password, newPassword;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız: ");
        userName = input.nextLine();

        System.out.print("Password: ");
        password = input.nextLine();

        // Kullanıcı adının ve şifrenin kontrolü
        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Hoşgeldiniz");
        } else if (userName.equals("patika") && !password.equals("java123")) {
            System.out.println("Şifre yanlış. Şifrenizi değiştirmek ister misiniz? (Evet / Hayır) ");
            String degismeIstemi = input.nextLine();
            if (degismeIstemi.equalsIgnoreCase("Evet")) {
                System.out.print("Yeni şifrenizi giriniz: ");
                newPassword = input.nextLine();
                if (newPassword.equals(password)) {
                    System.out.println("Şifre eski şifre ile aynı olamaz");
                } else {
                    System.out.println("Şifreniz değiştirildi");
                }
            } else if (degismeIstemi.equalsIgnoreCase("Hayır")) {
                System.out.println("Şifrenizi hatırlamaya çalışın");
            } else {
                System.out.println("Yanlış bir komut girdiniz");
            }
        } else if (!userName.equals("patika") && password.equals("java123")) {
            System.out.println("Kullanıcı adı yanlış.");
        } else {
            System.out.println("Kullanıcı adı ve şifre yanlış.");
        }
    }
}




import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        // degiskenler tanimlandı
        int right = 3;
        int balance = 1500;
        int select;
        // Bloke olmama durumunda ki kosullar
        while (right > 0) {
            System.out.print("Kullanıcı Adınız :");
            userName = input.nextLine();
            System.out.print("Parolanız : ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
            // Yapılmak istenen islemler belirlendi
                do {
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();
                    input.nextLine();
                    // kosullar switch casee ile tekrar yazıldı
                    switch (select) {
                        case 1:
                            System.out.println("Para miktarı: ");
                            int depositAmount = input.nextInt();
                            balance += depositAmount;
                            break;
                        case 2:
                            System.out.print("Para miktarı : ");
                            int withdrawAmount = input.nextInt();
                            if (withdrawAmount > balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                balance -= withdrawAmount;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                        case 4:
                            System.out.println("Çıkış yapılıyor. İyi günler!");
                            return;
                        default:
                            System.out.println("Geçersiz işlem seçtiniz. Lütfen tekrar deneyin.");
                    }
                } while (true);

            } else {
                right--;
                System.out.println("Kullanıcı adı veya parola hatalı. Kalan hakkınız: " + right);
                if (right == 0) { // hakların bittiği durum olusturuldu
                    System.out.println("Hesabınız bloke oldu. Lütfen banka ile iletişime geçin.");
                }
            }
        }
    }
}



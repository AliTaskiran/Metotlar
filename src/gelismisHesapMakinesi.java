import java.sql.SQLOutput;
import java.util.Scanner;

public class gelismisHesapMakinesi {
    static int plus(int a, int b) {
        int result = a + b;
        return result;

    }

    static int minus(int a, int b) {
        int result = a - b;
        return result;

    }

    static int times(int a, int b) {
        int result = a * b;
        return result;

    }

    static int divided(int a, int b) {

        if (b == 0) {

            System.out.println("Bir Sayı Sıfıra Bölünemez");
            return 0;
        }
        int result = a / b;
        return result;

    }

    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {

            result *= a;

        }

        return result;

    }

    static int mod(int a, int b) {
        int result = a % b;
        return result;

    }

    static void calc(int a, int b) {
        System.out.println("Çevresi :" + (2 * (a + b)));
        System.out.println("Alanı :" + (a * b));

    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int select;

        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Mod Alma\n"
                + "7- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";


        do {
            System.out.println(menu);
            System.out.println("Lütfen Bir işlem seçiniz");
            select = scan.nextInt();
            int a = 0, b = 0;
            if (select != 0) {

                System.out.println("İlk Sayı: ");
                a = scan.nextInt();
                System.out.println("İkinci Sayı:");
                b = scan.nextInt();
            }
            switch (select) {
                case 1:
                    System.out.println(plus(a, b));
                    break;
                case 2:
                    System.out.println(minus(a, b));
                    break;
                case 3:
                    System.out.println(times(a, b));
                    break;
                case 4:
                    System.out.println(divided(a, b));
                    break;
                case 5:
                    System.out.println(power(a, b));
                    break;
                case 6:
                    System.out.println(mod(a, b));
                    break;
                case 7:
                    calc(a, b);
                    break;
                case 0:
                    System.out.println("Güle GÜle");
                    break;


                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");

            }
        } while (select != 0);

    }

}


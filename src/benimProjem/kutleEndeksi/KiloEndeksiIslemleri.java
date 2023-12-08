package benimProjem.kutleEndeksi;

import java.util.Scanner;

public class KiloEndeksiIslemleri {

    public void kutleEndeksiCalistir() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dünya Sağlık Örgütü (WHO) vücut kitle indeksine gore kutle endeksi programina hosgeldiniz");
        System.out.println("Lutfen cinsiyetinizi giriniz \n(Erkek \nKadin)");
        char cinsiyet = scanner.next().toUpperCase().charAt(0);
        System.out.println("Lutfen boyunuzu santimetre olarak giriniz (165, 156 seklinde) ");
        double boy = scanner.nextDouble();
        System.out.println("Lutfen kilonuzu giriniz");
        double kilo = scanner.nextDouble();

        double kutleEndeksi = (kilo / ((boy/100) * (boy/100)));
        double idealKiloErkek = 50 +2.3 * ((boy / 2.54) -60);
        double idealKiloKadin = 45 +2.3 * ((boy / 2.54) -60);


        if(cinsiyet=='K'){
            System.out.println(" idel kilonuz = "+idealKiloKadin);
        }else {
            System.out.println(" idel kilonuz "+ idealKiloErkek);
        }
        if (kutleEndeksi < 16) {
            System.out.println("***************Anoreksi veya Eksik Beslenme***********");

        } else if (kutleEndeksi < 18.5) {
            System.out.println("******************Zayıf***********");

        } else if (kutleEndeksi < 25) {
            System.out.println("***************ideal Kilo*****************");

        } else if (kutleEndeksi < 30) {
            System.out.println("**********kilolu*************");

        } else if (kutleEndeksi < 35) {
            System.out.println("************1. Sınıf Orta Obezite***************");

        } else if (kutleEndeksi < 40) {
            System.out.println("*************2. Sınıf Yüksek Obezite************8");

        } else if (kutleEndeksi > 40) {
            System.out.println("************Morbid veya Masif Obezite************");

        } else {
            System.out.println("****Hesap araliginin disinda degerler***" );
        }


    }

}

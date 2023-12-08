package benimProjem.anaEkran;

import benimProjem.atmProjesi.AtmProjesi;
import benimProjem.kullanici.Kullanici;
import benimProjem.kutleEndeksi.KiloEndeksiIslemleri;
import benimProjem.yasTahmini.YasTahmini;
import benimProjem.burcTahmini.burctahmini;
import benimProjem.kullanici.KullaniciManager;

import java.util.Scanner;

public class AnaEkranKarsilama {
 KullaniciManager kullaniciManager = new KullaniciManager();
 AtmProjesi atmProjesi = new AtmProjesi();
 KiloEndeksiIslemleri kiloEndeksiIslemleri = new KiloEndeksiIslemleri();

    public Kullanici sistemeGiris(){
        System.out.println("Team130 bitirme Projeme hosgeldiniz\n" +
                "sisteme giris yapmak icin once kayit yapmaniz gerekmektedir");
                return kullaniciManager.kullaniciEkle();
    }
    public Kullanici menuGoster (Kullanici kullanici) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen test etmek istedigniz projemizi secin" +
                "\n1.Atm" +
                "\n2.Ideal Kilo " +
                "\n3. Burc tahmini " +
                "\n4. Yas Tahmini\n" +
                "5. cikis");
        String secenek = scanner.next();

        switch (secenek) {
            case "1":
                atmProjesi.atmProjesiCalistir(kullanici);
                menuGoster(kullanici);
                break;
            case "2":
                kiloEndeksiIslemleri.kutleEndeksiCalistir();
                System.out.println();
                System.out.println();
                System.out.println("================================================");
                menuGoster(kullanici);
                break;
            case "3":
                burctahmini.burctahmini();
                System.out.println();
                System.out.println();
                System.out.println("================================================");
                menuGoster(kullanici);
                break;
            case "4":
                YasTahmini.yasTahmini();
                System.out.println();
                System.out.println();
                System.out.println("================================================");
                menuGoster(kullanici);
                break;
            case "5":
                cikis();
                break;
            default:
                System.out.println("yanlis secim");

        }
return kullanici;
    }  public void cikis(){
        System.out.println("bizi tercih ettginiz icin tesekkur ederiz");

    }
}

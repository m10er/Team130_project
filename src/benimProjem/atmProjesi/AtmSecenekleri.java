package benimProjem.atmProjesi;

import benimProjem.kullanici.Kullanici;

import java.util.Scanner;

public class AtmSecenekleri {
    Atmekran atmekran = new Atmekran();

    public void atmGiris(Kullanici kullanici) {
        Scanner scan = new Scanner(System.in);

        System.out.println(atmekran.hosgeldinMesaji);
    }
    public void atmMenusu(Kullanici kullanici) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(atmekran.islemSecenekleri);
        String islemSecimi1 = scanner.next();
        switch (islemSecimi1) {
            case "1":
                bakiyeGoruntuleme(kullanici);
                System.out.println("atm menusune donmek icin lutfen 1 e basiniz\nAtmden cikis yapmak icin herhangi bir tusa basiniz");
                char sec = scanner.next().charAt(0);
                if(sec == '1'){
                    atmMenusu(kullanici);
                }else {
                    cikisIslemi();
                }
                break;
            case "2":
                paraCekme(kullanici);
                System.out.println("atm menusune donmek icin lutfen 1 e basiniz\nCikis yapmak icin herhangi bir tusa");
                char sec2 = scanner.next().charAt(0);
                paraCekme(kullanici);
                if(sec2 == '1'){
                    atmMenusu(kullanici);
                }else {
                    cikisIslemi();
                }
                break;
            case "3":
                paraYatirma(kullanici);
                System.out.println("atm menusune donmek icin lutfen 1 e basiniz\nCikis yapmak icin herhangi bir tusa");
                char sec3 = scanner.next().charAt(0);
                paraCekme(kullanici);
                if(sec3 == '1'){
                    atmMenusu(kullanici);
                }else {
                    cikisIslemi();
                }
            case "4":
                cikisIslemi();
                break;
            default:
                System.out.println("Yanlis secim");
        }

    } private void paraYatirma(Kullanici kullanici) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yatirmak istediginiz tutari giriniz");
        double tutar = scanner.nextDouble();
        kullanici.setKullaniciBakiye(kullanici.getKullaniciBakiye()+tutar);
        System.out.println("yeni bakiyeniz" + kullanici.getKullaniciBakiye());

    }

    public void bakiyeGoruntuleme(Kullanici kullanici){
        System.out.println("bakiyeniz =" + kullanici.getKullaniciBakiye());
    }
    public void paraCekme(Kullanici kullanici){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cekmek istediginiz tutari girin");
        double cekilecektutar = scanner.nextDouble();

        if (cekilecektutar > kullanici.getKullaniciBakiye()) {
            System.out.println("Bakiyeniz yetersizdir");
        } else {
            kullanici.setKullaniciBakiye(kullanici.getKullaniciBakiye()-cekilecektutar);
            System.out.println("Para cekme islemi basariyla gerceklesmistir" +
                    "\nKalan bakiye=" + kullanici.getKullaniciBakiye());
        }
    }
    public void  cikisIslemi(){
        System.out.println(atmekran.cikisIslemi);
    }
}
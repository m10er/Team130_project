package benimProjem.kullanici;

import dersehazirlik.DataAcces;
import dersehazirlik.DataManager;

import java.util.Arrays;
import java.util.Scanner;

public class KullaniciManager {
    public  static Scanner scanner = new Scanner(System.in);
   DataAccess dataAcces;

    public KullaniciManager() {
 dataAcces = new DataAccess();
    }
  public Kullanici kullaniciEkle(){
        Kullanici kullanici = new Kullanici();
        System.out.println("Lutfen eklemek istediginiz kullanicinin adini giriniz");
        String kullaniciAdi = scanner.next();
        System.out.println("Lutfen eklemek istediginiz kullanici sifrenizi giriniz");
        String kulaniciSifre = scanner.next();
        System.out.println("Lutfen dogum tarinihizi GG/AA/YYYY seklinde giriniz");
        String kullaniciDogumTarihi = scanner.next();
        String[] dogumtarihi= kullaniciDogumTarihi.split("/");
        int dogumGun= Integer.parseInt(dogumtarihi[0]);
        int dogumAy=Integer.parseInt(dogumtarihi[1]);

        boolean flag = true;
      for (int i = 0; i < dataAcces.kullaniciList.size(); i++) {
          if (kullaniciAdi.equals(dataAcces.kullaniciList.get(i).kullaniciAdi)){
              System.out.println("sisteme kayitli kullanici adi.Lutfen farkli kullanici adi ile deneyiniz");
          flag=false;
          }

      }
        if (kullaniciAdi.length()<6){
            System.out.println("kullanici adi en az 6 karakter olmali");
            flag = false;
        }
        if (kullaniciAdi.contains(" ")){
            System.out.println("Kullanii adi bosluk iceremez");
            flag = false;
        }
        if (kulaniciSifre.length()<4){
            System.out.println("sifreniz en az 4 karakterden olusmali");
            flag = false;
        }if (kulaniciSifre.contains(" ")){
            System.out.println("sifrenizde bosluk olamaz");
            flag = false;
        }
        if (!kullaniciDogumTarihi.contains("/")) {
            System.out.println("lutfen dogum tarihini gosterildigi sekilde giriniz");
            flag=false;
        }
        if (dogumGun<0&& dogumGun>31){
            System.out.println("dogum  tarhinde gunleri yanlis girdiniz");
            flag= false;
        }
        if (dogumAy<0 && dogumAy>12){
            System.out.println("dogum tarihinde aylari yanlis girdiniz");
            flag=false;
        }
        if(dogumtarihi[2].length()!=4){
            System.out.println("dogum yilini 4 haneli giriniz");
        }


        boolean flagSistemeGiris= false;
        if (flag){
            dataAcces.kullaniciEkle(kullanici);
            System.out.println("sisteme kaydiniz basariyla yapilmistir");
            flagSistemeGiris=true;
        }else {
            kullaniciEkle();
        }
        return kullanici;
    }
}

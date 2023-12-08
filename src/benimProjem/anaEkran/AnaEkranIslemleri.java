package benimProjem.anaEkran;

import benimProjem.kullanici.Kullanici;

public class AnaEkranIslemleri {
    AnaEkranKarsilama anaEkranKarsilama = new AnaEkranKarsilama();

    public void projeCalistir() {

        Kullanici kullanici = anaEkranKarsilama.sistemeGiris();
        anaEkranKarsilama.menuGoster(kullanici);
        }


}

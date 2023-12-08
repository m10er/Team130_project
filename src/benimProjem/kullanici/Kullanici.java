package benimProjem.kullanici;

public class Kullanici {
    int kullaniciId;
    String kullaniciAdi;
    String kullaniciSifre;
    String kullaniciDogumTarihi;
    double kullaniciBoy;
    double  kullaniciKilo;
    double kullaniciBakiye;

    public Kullanici() {
    }

    public Kullanici(String kullaniciAdi, String kullaniciSifre, String kullaniciDogumTarihi) {
        this.kullaniciAdi = kullaniciAdi;
        this.kullaniciSifre = kullaniciSifre;
        this.kullaniciDogumTarihi = kullaniciDogumTarihi;
    }


    public int getKullaniciId() {
        return kullaniciId;
    }

    public void setKullaniciId(int kullaniciId) {
        this.kullaniciId = kullaniciId;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getKullaniciSifre() {
        return kullaniciSifre;
    }

    public void setKullaniciSifre(String kullaniciSifre) {
        this.kullaniciSifre = kullaniciSifre;
    }

    public String getKullaniciDogumTarihi() {
        return kullaniciDogumTarihi;
    }

    public void setKullaniciDogumTarihi(String kullaniciDogumTarihi) {
        this.kullaniciDogumTarihi = kullaniciDogumTarihi;
    }

    public double getKullaniciBoy() {
        return kullaniciBoy;
    }

    public void setKullaniciBoy(double kullaniciBoy) {
        this.kullaniciBoy = kullaniciBoy;
    }

    public double getKullaniciKilo() {
        return kullaniciKilo;
    }

    public void setKullaniciKilo(double kullaniciKilo) {
        this.kullaniciKilo = kullaniciKilo;
    }

    public double getKullaniciBakiye() {
        return kullaniciBakiye;
    }

    public void setKullaniciBakiye(double kullaniciBakiye) {
        this.kullaniciBakiye = kullaniciBakiye;
    }
}

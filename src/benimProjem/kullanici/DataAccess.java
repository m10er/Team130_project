package benimProjem.kullanici;

import java.util.ArrayList;
import java.util.List;

public class DataAccess {
    public static List<Kullanici> kullaniciList;

    public DataAccess() {
       kullaniciList=new ArrayList<>();
       kullaniciList.add(new Kullanici("kullanici","123456","01.01.1991"));
       kullaniciList.add(new Kullanici("muammer","123456","01.01.1990"));

    }void  kullaniciEkle(Kullanici kullanici){
        kullaniciList.add(kullanici);
    }

}

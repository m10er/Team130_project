package benimProjem.atmProjesi;

import benimProjem.kullanici.DataAccess;
import benimProjem.kullanici.Kullanici;

import java.util.List;
import java.util.Scanner;

public class AtmProjesi {
 AtmSecenekleri atmSecenekleri = new AtmSecenekleri();

  public void  atmProjesiCalistir(Kullanici kullanici){
      atmSecenekleri.atmGiris(kullanici);
      atmSecenekleri.atmMenusu(kullanici);

  }

}

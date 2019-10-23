package ba.unsa.etf.rpr;
import java.util.Arrays;
public class Supermarket {
    Artikl[] artikli;
    int brojac = 0;
    Supermarket() {
        artikli = new Artikl[1000];
    }

    public void dodajArtikl(Artikl a) {
        artikli[brojac] = a;
        brojac++;
    }

    public Artikl[] getArtikli() {
        return artikli;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl temp = null;
        for(int i=0; i<brojac; i++) {
            if (artikli[i]!=null && artikli[i].getKod().equals(kod)) {
                temp = artikli[i];
                //artikli[i]=null;
                for(int j=i; j<brojac; j++) {
                    artikli[j] = artikli[j+1];
                }
//                artikli[brojac-1] = null;
                brojac = brojac - 1;
            }
        }
        return temp;
    }

}

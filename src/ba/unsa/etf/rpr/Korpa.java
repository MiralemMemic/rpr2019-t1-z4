package ba.unsa.etf.rpr;

public class Korpa {
    Artikl[] artikli;
    static int brojac=0;
    Korpa() {
        artikli = new Artikl[50];
    }

    public boolean dodajArtikl(Artikl a) {
        if (brojac==49) return false;
        artikli[brojac] = a;
        brojac++;
        return true;
    }

    public Artikl[] getArtikli() {
        return artikli;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl temp = null;
        for(int i=0; i<brojac; i++) {
            if ( artikli[i].getKod().equals(kod)) {
                temp = artikli[i];
                artikli[i]=null;
                for(int j=i; j<brojac; j++) {
                    artikli[j] = artikli[j+1];
                }
                brojac = brojac - 1;
            }
        }
        return temp;
    }

    public int dajUkupnuCijenuArtikala() {
        int suma = 0;
        for(int i=0; i<brojac; i++) {
            suma = suma + artikli[i].getCijena();
        }
        return suma;
    }
}

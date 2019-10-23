package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {
    private Artikl a;
    private Korpa k;

    @BeforeEach
    void set(){
        a = new Artikl("Sveska", 2, "s33");
        k = new Korpa();
    }

    @Test
    void dodajArtikl() {
        k.dodajArtikl(a);
        assertEquals(2, k.dajUkupnuCijenuArtikala());
    }

    @Test
    void getArtikli() {
       // Artikl[] t = new Artikl[1];
        //t=a;
        //assertArrayEquals(t, k);
    }


    @Test
    void dajUkupnuCijenuArtikala() {
        k.dodajArtikl(a);
        Artikl b = new Artikl("tanjir", 10, "t1");
        k.dodajArtikl(b);
        assertEquals(12, k.dajUkupnuCijenuArtikala());
    }
}
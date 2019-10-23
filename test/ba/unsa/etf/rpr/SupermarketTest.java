package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {
    private Artikl a;
    private Supermarket s;

    @BeforeEach
    void set() {
        a = new Artikl("Cokolada", 17, "c98");
        s = new Supermarket();
    }
    @Test
    void dodajArtikl() {
        s.dodajArtikl(a);
        assertEquals(17, s.artikli[0].getCijena());
    }

    @Test
    void getArtikli() {
        s.dodajArtikl(a);
        Artikl[] test = s.getArtikli();
        assertEquals(17, test[0].getCijena());
    }

    @Test
    void izbaciArtiklSaKodom() {
        s.dodajArtikl(a);
        Artikl b = new Artikl("kasika", 4, "k6");
        s.dodajArtikl(b);
        s.izbaciArtiklSaKodom("c98");
        assertEquals(1, s.brojac);
    }
}
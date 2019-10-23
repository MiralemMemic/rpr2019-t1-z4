package ba.unsa.etf.rpr;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class ArtiklTest {
    private Artikl a;

    @BeforeEach
    void set(){
        a = new Artikl("Knjiga", 50, "k12");
    }
    @Test
    void getNaziv() {
        assertEquals("Knjiga", a.getNaziv());
    }

    @Test
    void getKod() {
        assertEquals("k12", a.getKod());
    }

    @Test
    void getCijena() {
        assertEquals(50, a.getCijena());
    }
}
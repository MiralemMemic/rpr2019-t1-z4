package ba.unsa.etf.rpr;

public class Artikl {
    String naziv, kod;
    int cijena;
    Artikl(String naziv, int cijena, String kod) {
        this.naziv=naziv; this.cijena=cijena; this.kod=kod;
    }

    public String getNaziv() {
        return naziv;
    }

    public String getKod() {
        return kod;
    }

    public int getCijena() {
        return this.cijena;
    }
}

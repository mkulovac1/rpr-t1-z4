package ba.unsa.etf.rpr;

public class Artikl {
    String naziv;
    int cijena;
    String kod;

    public Artikl(String n, int c, String k) {
        naziv = n; cijena = c; kod = k;
    }

    public String getNaziv() {
        return naziv;
    }
    public int getCijena() {
        return cijena;
    }
    public String getKod() {
        return kod;
    }
}

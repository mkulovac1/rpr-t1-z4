package ba.unsa.etf.rpr;

public class Supermarket {
    Artikl[] artikli;
    int broj = 0;

    public Supermarket() {
        artikli = new Artikl[1000];
    }

    public void dodajArtikl(Artikl a) {
        artikli[broj] = new Artikl(a.naziv, a.cijena, a.kod);
        broj++;
    }

    public Artikl izbaciArtiklSaKodom(String kod_uporedni) {
        for(int i = 0; i < broj; i++) {
            if(artikli[i].kod.equals(kod_uporedni)) {
                for(int j = i + 1; j < broj; i++) {
                    artikli[j - 1] = artikli[j];
                }
                broj--;
                i--;
            }
        }
        return artikli[broj + 1];
    }

    public Artikl[] getArtikli() {
        return artikli;
    }

}

package ba.unsa.etf.rpr;

public class Korpa {
    Artikl[] artikli;
    int br = 0;
    public Korpa() {
        artikli = new Artikl[50];
    }

    public boolean dodajArtikl(Artikl a) {

            if(br == 50)
                return false;
            else {
                artikli[br] = new Artikl(a.naziv, a.cijena, a.kod);
                br++;
                return true;
            }
    }

    public Artikl[] getArtikli() {
        return artikli;
    }

    public int dajUkupnuCijenuArtikala() {
        int ukupno = 0;
        for(Artikl a : artikli)
            ukupno += a.cijena;
        return ukupno;
    }

    public Artikl izbaciArtiklSaKodom(String kod_uporedni) {
        for(int i = 0; i < br; i++) {
            if(artikli[i].kod.equals(kod_uporedni)) {
                for(int j = i + 1; j < br; i++) {
                    artikli[j - 1] = artikli[j];
                }
                br--;
                i--;
            }
        }
        return artikli[br + 1];
    }
}

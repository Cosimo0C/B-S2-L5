package cosimocrupi.entita;

public class GiocoTavola extends Gioco{
    protected int giocatori;
    protected int miniutiGiocati;

    public GiocoTavola(int idGioco, String titolo, int annoProd, double prezzo, int giocatori, int miniutiGiocati) {
        super(idGioco, titolo, annoProd, prezzo);
        this.idGioco=idGioco;
        this.titolo=titolo;
        this.annoProd=annoProd;
        this.prezzo=prezzo;
        this.giocatori=giocatori;
        this.miniutiGiocati=miniutiGiocati;
    }
    @Override
    public String toString(){
        return this.idGioco+" "+this.titolo+" "+this.annoProd+" "+this.prezzo+" "+this.giocatori+" "+this.miniutiGiocati;
    }
    public int getGiocatori() {
        return giocatori;
    }

    public int getMiniutiGiocati() {
        return miniutiGiocati;
    }

    public void setGiocatori(int giocatori) {
        this.giocatori = giocatori;
    }

    public void setMiniutiGiocati(int miniutiGiocati) {
        this.miniutiGiocati = miniutiGiocati;
    }
}

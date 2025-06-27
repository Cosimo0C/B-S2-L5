package cosimocrupi.entita;


public class Videogioco extends Gioco{
    protected String piattaforma;
    protected int ore;
    protected Genere genere;

    public Videogioco(int idGioco, String titolo, int annoProd, double prezzo, String piattaforma, int ore, Genere genere) {
        super(idGioco, titolo, annoProd, prezzo);
        this.idGioco=idGioco;
        this.titolo=titolo;
        this.annoProd=annoProd;
        this.prezzo=prezzo;
        this.piattaforma=piattaforma;
        this.ore=ore;
        this.genere=genere;
    }

    @Override
    public String toString() {
        return this.idGioco+" "+this.titolo+" "+this.annoProd+" "+this.prezzo+" "+this.piattaforma+" "+this.ore+" "+this.genere;
    }

    public String getPiattaforma() {
        return piattaforma;
    }

    public int getOre() {
        return ore;
    }

    public Genere getGenere() {
        return genere;
    }

    public void setPiattaforma(String piattaforma) {
        this.piattaforma = piattaforma;
    }

    public void setOre(int ore) {
        this.ore = ore;
    }

    public void setGenere(Genere genere) {
        this.genere = genere;
    }
}

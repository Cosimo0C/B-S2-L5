package cosimocrupi.entita;

public abstract class Gioco{
protected int idGioco;
protected String titolo;
protected int annoProd;
protected double prezzo;

public Gioco(int idGioco, String titolo,int annoProd, double prezzo){
    this.idGioco=idGioco;
    this.titolo=titolo;
    this.annoProd=annoProd;
    this.prezzo=prezzo;
    }

    public int getIdGioco() {
        return idGioco;
    }

    public String getTitolo() {
        return titolo;
    }

    public int getAnnoProd() {
        return annoProd;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setTitolo( String titolo){
        this.titolo=titolo;
    }

    public void setAnnoProd(int annoProd) {
        this.annoProd = annoProd;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo=prezzo;
    }
}
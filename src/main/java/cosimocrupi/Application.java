package cosimocrupi;

import cosimocrupi.entita.Collezione;
import cosimocrupi.entita.Genere;
import cosimocrupi.entita.GiocoTavola;
import cosimocrupi.entita.Videogioco;

public class Application {

    public static void main(String[] args) {
        Videogioco v1= new Videogioco(112, "God of war", 2012, 50, "PS3", 50, Genere.AZIONE);
        Videogioco v2= new Videogioco(113, "Uncharted", 2014, 55, "PS4", 150, Genere.AVVENTURA);
        GiocoTavola g1= new GiocoTavola(211, "Monopoli", 2000, 25, 6, 60);
        GiocoTavola g2= new GiocoTavola(212, "Uno", 2005, 15, 4, 60);
        Collezione collezione=new Collezione();
        collezione.addElemento();
    }
}

package cosimocrupi;

import cosimocrupi.entita.Collezione;
import cosimocrupi.entita.Genere;
import cosimocrupi.entita.GiocoTavola;
import cosimocrupi.entita.Videogioco;

public class Application {

    public static void main(String[] args) {
        Collezione collezione=new Collezione();
        System.out.print(collezione.prezzoRicerca(56));
    }
}

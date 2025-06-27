package cosimocrupi.entita;

import java.util.Scanner;

public class Collezione {
    public void addElemento(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Ciao! Benvenuto nel gestore dell'aggiunta di un gioco!");
        int ris = 0;
        do {
            System.out.println("Che gioco vorresti aggiungere? Videogioco(1) o Gioco Da tavola(2). 0 per terminare.");
            ris=Integer.parseInt(scanner.nextLine());
            if (ris>=0 & ris<3){
                System.out.println("ciao!");
            } else if (ris==0) {
                System.out.println("Grazie! Arrivederci!");
            }else {
                System.out.println("Il numero non è compreso tra le risposte possibili! Riprova");
                addElemento();
            }
        }while(ris!=0);

    }
}

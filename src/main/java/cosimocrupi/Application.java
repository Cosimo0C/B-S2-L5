package cosimocrupi;

import cosimocrupi.entita.Collezione;
import cosimocrupi.entita.Genere;
import cosimocrupi.entita.GiocoTavola;
import cosimocrupi.entita.Videogioco;
import cosimocrupi.exception.ExceptiionToonumber;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Collezione collezione=new Collezione();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ciao! Benvenuto nel gestore generale!");
        int ris=0;
        do {
            System.out.println("Scegli tra: 1 L'aggiunta - 2 Ricerca ID - 3 Ricerca per giocatori - 4 Rimozioni elemento Id - 5 Aggiornamento elemento con Id - 6 Ricerca Prezzo - 7 Statistiche varie! 0 per terminare!");
            ris= Integer.parseInt(scanner.nextLine());
            if (ris>=0 & ris<=7){
                switch (ris){
                    case 1:
                        collezione.addElemento();
                        break;
                    case 2:
                        System.out.println("Che Id vorresti cercare?");
                        int idRicera=Integer.parseInt(scanner.nextLine());
                        collezione.IdRicera(idRicera);
                        break;
                    case 3:
                        System.out.println("Inserisci un gioco entro dei numeri di giocatori");
                        int numGioca=Integer.parseInt(scanner.nextLine());
                        collezione.giocatoriRicerca(numGioca);
                        break;
                    case 4:
                        System.out.println("Quale gioco vuoi eliminare? Inserisci l'Id");
                        int idDelete=Integer.parseInt(scanner.nextLine());
                        collezione.eliminaId(idDelete);
                        break;
                    case 5:
                        System.out.println("Quale gioco vuoi aggiornare? Inserisci l'Id!");
                        int idSet=Integer.parseInt(scanner.nextLine());
                        collezione.aggiornamentoElmento(idSet);
                        break;
                    case 6:
                        System.out.println("Entro quale prezzo vuoi vedere i giochi disponibili? Inserisci un prezzo");
                        int prezzoRice=Integer.parseInt(scanner.nextLine());
                        collezione.prezzoRicerca(prezzoRice);
                        break;
                    case 7:
                        System.out.println("Questi sono le statistiche varie");
                        collezione.statistica();
                        break;
                    default:
                        System.out.println("DEFAULT");
                        break;
                }
            }else if (ris==0){
                System.out.println("Grazie! Arrivederci!");
            }else {
               throw new ExceptiionToonumber();
            }
        }while(ris!=0);
    }
}

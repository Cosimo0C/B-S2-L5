package cosimocrupi.entita;

import cosimocrupi.exception.ExceptionIdSame;

import java.util.*;
import java.util.stream.Collectors;

public class Collezione {
    Videogioco v1= new Videogioco(112, "God of war", 2012, 50, "PS3", 50, Genere.AZIONE);
    Videogioco v2= new Videogioco(113, "Uncharted", 2014, 55, "PS4", 150, Genere.AVVENTURA);
    GiocoTavola g1= new GiocoTavola(211, "Monopoli", 2000, 25, 6, 60);
    GiocoTavola g2= new GiocoTavola(212, "Uno", 2005, 15, 4, 60);
    ExceptionIdSame exc= new ExceptionIdSame();
    public Map<Integer, Gioco> giochi=new HashMap<>();
    {
        giochi.put(v1.idGioco, v1);
        giochi.put(v2.idGioco, v2);
        giochi.put(g1.idGioco, g1);
        giochi.put(g2.idGioco, g2);
    }
    public List<GiocoTavola> giochiT=new ArrayList<>();
    {
        giochiT.add(g1);
        giochiT.add(g2);
    }
    public void addElemento(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Ciao! Benvenuto nel gestore dell'aggiunta di un gioco!");
        int ris = 0;
        do {
            System.out.println("Che gioco vorresti aggiungere? Videogioco(1) o Gioco Da tavola(2). 0 per terminare.");
            ris=Integer.parseInt(scanner.nextLine());
            if (ris>=0 & ris<3){
                if (ris==1){
                    System.out.println("Inserisci un Id del gioco di soli numeri interi!");
                    int idGioco= Integer.parseInt(scanner.nextLine());
                    if (idGioco>=0){
                        for (int i = 0; i < giochi.size(); i++) {
                            if (idGioco==giochi.get(i).idGioco){
                               exc.getMessage();
                            }
                        }
                    }
                    System.out.println("Inserisci il titolo del videogioco");
                    String titolo= scanner.nextLine();
                    System.out.println("Inserisci l'anno di produzione");
                    int annoProd=Integer.parseInt(scanner.nextLine());
                    System.out.println("Inserisci il prezzo");
                    double prezzo=Double.parseDouble(scanner.nextLine());
                    System.out.println("Inserisci la piattaforma di gioco");
                    String piattaforma=scanner.nextLine();
                    System.out.println("Inserisci le ore di gioco");
                    int ore=Integer.parseInt(scanner.nextLine());
                    System.out.println("Inserisci il genere tra AZIONE(1), AVVENTURA(2), SPORT(3), SPARATUTTO(4)");
                    int rispGenere=Integer.parseInt(scanner.nextLine());
                    Genere genere=Genere.NULL;
                    switch (rispGenere){
                        case 1:
                            genere= Genere.AZIONE;
                            break;
                        case 2:
                            genere = Genere.AVVENTURA;
                            break;
                        case 3:
                            genere = Genere.SPORT;
                            break;
                        case 4:
                            genere= Genere.SPARATUTTO;
                            break;
                        default:
                            System.out.println("default");
                            break;
                    }
                    Videogioco nome = new Videogioco(idGioco, titolo, annoProd, prezzo, piattaforma, ore, genere);
                    giochi.put(nome.idGioco, nome);
                }else {

                    System.out.println("Inserisci un Id del gioco di soli numeri interi!");
                    int idGioco= Integer.parseInt(scanner.nextLine());
                    System.out.println("Inserisci il titolo del videogioco");
                    String titolo= scanner.nextLine();
                    System.out.println("Inserisci l'anno di produzione");
                    int annoProd=Integer.parseInt(scanner.nextLine());
                    System.out.println("Inserisci il prezzo");
                    double prezzo=Double.parseDouble(scanner.nextLine());
                    System.out.println("Inserisci quanti giocatori si può giocare da 2 a 10");
                    int giocatori=Integer.parseInt(scanner.nextLine());
                    if (giocatori < 2 || giocatori>10){
                        System.out.println("Errore non è tra 2 e 10");
                        addElemento();
                    }
                    System.out.println("Inserisci i minuti di gioco");
                    int minuti=Integer.parseInt(scanner.nextLine());
                    GiocoTavola nome= new GiocoTavola(idGioco, titolo, annoProd, prezzo, giocatori, minuti);
                    giochi.put(nome.idGioco, nome);
                    giochiT.add(nome);
                }
            } else if (ris==0) {
                System.out.println("Grazie! Arrivederci!");
            }else {
                System.out.println("Il numero non è compreso tra le risposte possibili! Riprova");
                addElemento();
            }
        }while(ris!=0);

    }
    public Gioco IdRicera(int Id){
        return giochi.get(Id);
    }
    public List<Gioco> prezzoRicerca(int prezzo){
        return giochi.values().stream().filter(gioco -> gioco.prezzo < prezzo).toList();
    }
    public List<GiocoTavola> giocatoriRicerca(int numero){
        return giochiT.stream().filter(gioco -> gioco.giocatori<numero).toList();
    }
    public void eliminaId(int Id){
        giochi.remove(Id);
    }
    public void aggiornamentoElmento(int Id){
        Scanner scanner= new Scanner(System.in);
        int ris=0;
        do {
            System.out.println("Cosa vuoi cambiare tra Titolo(1), Anno(2), Prezzo(3). 0 per uscire");
            ris= Integer.parseInt(scanner.nextLine());
            if (ris>=1 & ris<=3) {
                switch (ris) {
                    case 1:
                        System.out.println("Inserisci il titolo");
                        String titolo = scanner.nextLine();
                        giochi.get(Id).setTitolo(titolo);
                        break;
                    case 2:
                        System.out.println("Inserisci l'anno");
                        int anno = Integer.parseInt(scanner.nextLine());
                        giochi.get(Id).setAnnoProd(anno);
                        break;
                    case 3:
                        System.out.println("Inserisci il prezzo");
                        double prezzo = Double.parseDouble(scanner.nextLine());
                        giochi.get(Id).setPrezzo(prezzo);
                        break;
                    default:
                        System.out.println("DEFAULT");
                        break;
                }
            }else{
                System.out.println("Fuori numero! Riprova");
                aggiornamentoElmento(Id);
            }
        }while (ris!=0);
    }
    public void statistica (){
        OptionalDouble prezzoalto= giochi.values().stream().mapToDouble(Gioco::getPrezzo).max();
        System.out.println(prezzoalto);
        double mediaPrezzi = giochi.values().stream().collect(Collectors.averagingDouble(Gioco::getPrezzo));
        System.out.println("La media dei prezzi è "+mediaPrezzi);
        IntSummaryStatistics stat= giochi.values().stream().mapToInt(Gioco::getIdGioco).summaryStatistics();
        System.out.println(stat);
    }
}

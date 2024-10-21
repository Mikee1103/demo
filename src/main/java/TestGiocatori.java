import java.util.Scanner;

public class TestGiocatori {
    static Giocatori[] gioc = new Giocatori[100];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int indice = 0;
        int indice2 = 0;
        int goal;
        int giocacanc;
        int giocator;
        String nome;
        Boolean capitano;
        do {
            System.out.println(" ");
            System.out.println("1 - aggiungere un giocatore alla squadra");
            System.out.println("2 - visualizzare tutti i giocatori");
            System.out.println("3 - modificare i dati di un giocatore");
            System.out.println("4 - cancellare un giocatore dalla squadra");
            System.out.println("5 - visualizzare i giocatori che hanno realizzato più di 5 goal.");
            System.out.println("6 - visualizzare il capitano");
            System.out.println("7 - assegnare il ruolo di capitano in modo casuale se non ancora presente");
            System.out.println("8 - esci");
            indice2 = in.nextInt();
            switch (indice2) {
                case 1:
                    System.out.println("inserisci numero goal");
                    goal = in.nextInt();
                    in.nextLine();
                    System.out.println("inserisci nome");
                    nome = in.nextLine();
                    in.nextLine();
                    System.out.println("è capitano? (true/false)");
                    capitano = in.nextBoolean();
                    in.nextLine();
                    aggiuntaGiocatore(goal, nome, capitano, indice);
                    indice++;
                    break;
                case 2:
                    for (int i = 0; i < indice; i++) {
                        System.out.println(stampa(i));
                    }
                    break;
                case 3:
                    System.out.println("scegli giocatore da modificare");
                    giocator = in.nextInt();
                    System.out.println("inserisci numero goal nuovo");
                    goal = in.nextInt();
                    in.nextLine();
                    System.out.println("inserisci nuovo nome");
                    nome = in.nextLine();
                    in.nextLine();
                    System.out.println("è capitano?(true/false)");
                    capitano = in.nextBoolean();
                    in.nextLine();
                    modifica(giocator, goal, nome, capitano);
                    break;
                case 4:
                    System.out.println("che giocatore vuoi cancellare?");
                    giocacanc=in.nextInt();
                    cancellazione(gioc, indice, giocacanc);
                    break;
                case 5:
                    for (int i = 0; i < indice; i++) {
                        System.out.println(sopra5goal(i));
                    }
                    break;
                case 6:
                    System.out.println();
                    break;
            }
        }
        while (indice2 != 8);
    }
    public static void aggiuntaGiocatore(int newGoal, String newNome, Boolean newCapitano, int indice){
        gioc [indice] = new Giocatori(newGoal,newNome,newCapitano);
    }
    public static String stampa(int i){
        String giocatore=" ";
        giocatore=giocatore+gioc [i].getNome() + " " + gioc [i].getGoal() + " " +gioc [i].getCapitano() + " ";
        return giocatore;
    }
    public static void modifica(int giocator, int newGoal, String newNome, Boolean newCapitano){
        gioc[giocator].setGoal(newGoal);
        gioc[giocator].setNome(newNome);
        gioc[giocator].setCapitano(newCapitano);


    }
    public static int cancellazione(Giocatori[]gio,int indice, int giocatorcanc){
        for(int i=giocatorcanc;i<indice;i++){
            gio[i]=gio[i+1];
        }
        return indice-1;
    }
    public static String sopra5goal(int giocat){
        String GiocatoreForte="";
        if(gioc[giocat].getGoal()<5)
            return "non trovato";
        else
            GiocatoreForte=GiocatoreForte + gioc[giocat].getNome();
        return GiocatoreForte;
    }
}
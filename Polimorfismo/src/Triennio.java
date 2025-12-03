public class Triennio extends Studente{

    String indirizzo;

    public Triennio(String nome, String cognome, String classe){
        /* super(nome, cognome, classe);
        this.indirizzo = "Informatica"; */
        this(nome, cognome, classe, "Informatica");
    }

    public Triennio(String nome, String cognome, String classe, String indirizzo){
        super(nome, cognome, classe);
        this.indirizzo = indirizzo;
    }
}

public class Studente extends Persona{
    String classe;

    public Studente(String nome, String cognome, String classe){
        super(nome, cognome);
        this.classe = classe;
    }

    @Override
    public String toString() {
        
        return super.toString()+" "+classe;
    } 
}

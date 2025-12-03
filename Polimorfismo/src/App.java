/*
 * OVERLOAD di un metodo: in presenza di metodi che hanno lo stesso nome, ma con firma diversa,
 * ossia, cambiano il numero e/o il tipo dei parametri ma mantenendo lo stesso nome.
 * 
 * 
 * OVERRIDE di un metodo: in presenza di ereditarietà, un figlio sovrascrive, 
 * utilizzando la stessa firma, un metodo che era stato scritto nella classe padre.
 */

 /*
  * COMPILE TIME: viene deciso quale metodo mandare in esecuzione in base
                  al tipo della variabile

    RUN TIME: mentre il programma è in esecuzione, si va a vedere a cosa punta la variabile,
              ossia, il tipo di dato dell'oggetto referenziato. Verrà eseguito il metodo,
              la cui firma è stata determinata a tempo di compilazione, in base al fatto 
              che questo sia o meno presente nella classe figlia, cioè, se nella classe figlia
              è presente un override del metodo (ossia una sua nuova versione), 
              allora verrrà eseguito questo, altrimenti si esaeguirà quello del padre di cui 
              era stato salvato il riferimento a tempo di compilazione.

    Il nome POLIMORFISMO deriva proprio da questa circostanza.
    Il termine viene dal greco POLI (=molti) e MORPHE (=forme), ossia,
    una cosa che può assumere diverse forme.

    Nell'esempio fatto in classe, infatti, il metodo toString() è uno soltanto,
    con un'unica firma, che assume forme diverse in base all'oggetto a cui si riferisce.
  */

public class App extends Object{
    

    public static void main(String[] args) throws Exception {
        
      Triennio t = new Triennio();

        Object p = new Persona("Mario", "Rossi");
        Object s = new Studente("Ugo", "Verdi", "4Bi");

        // è possibile grazie al principio di Liskov
        Persona p3;
        
        p3 = new Studente("Sandro", "Bianchi", "3Bi");

        Object o = new Studente("Carla", "Violetti", "5Bi");

        //System.out.println(p.toString());
        //System.out.println(s.toString());
        System.out.println(p3.toString());
    }
}

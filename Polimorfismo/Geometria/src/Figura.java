/*
    abstract rende una classe non instanziabile, ossia,
    non posso scrivere il comando new Costruttore()

    Una classe astratta esiste solo per essere sottoclassata,
    ossia, ereditata da un'altra classe.
    Il suo scopo è quello di fungere da modello base impedendone una creazione diretta di oggetti.
*/

public abstract class Figura {
    private int base;
    private int altezza;
    private String nome;

   
    public Figura(int base, int altezza, String nome){
        this.base = base;
        this.altezza = altezza;
        this.nome = nome;
    }

    

    public void setBase(int base){
        this.base = base;
    }

    public void setAltezza(int altezza){
        this.altezza = altezza;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getBase(){
        return this.base;
    }

     public int getAltezza(){
        return this.altezza;
    }

     public String getNome(){
        return this.nome;
    }



    @Override
    public String toString() {
        
        return "nome = "+nome+" - base = "+base+" - altezza = "+altezza;
    }


    // un metodo astratto è un metodo senza corpo, ossia, in Java, senza le parentesi graffe
    public abstract double area();


     // questo metodo permette di definire quando una figura è uguale ad un'altra figura
    // Decidiamo che due figure sono uguali quando hanno lo stesso nome
    @Override
    public boolean equals(Object obj) {
        // se this e obj contengono lo stesso indirizzo di un oggetto,
        // sicuramente saranno uguali
        if (this == obj) 
        {
            return true;
        }

        // se obj è null, vuol dire che non sta referenziando alcun oggetto.
        // pertanto, non sarà sicuramente uguale a this che invece contiene un indirizzo
        if (obj == null) {
            return false;
        }

        // in questo caso, la classe dell'oggetto corrente (referenziato con this)
        // e quella del parametro obj sono diverse: ciò implica che obj non è una figura
        // e pertando non potrà essere uguale a this
        if (this.getClass() != obj.getClass() ) {
            return false;
        }
        
        // se arrivo qui, vuol dire che obj ha un valore e che è del tipo Figura.
        // allora, ha senso recuperarne il contenuto (l'oggetto referenziato)

        Figura f = (Figura)obj;

        /*if (this.getNome().equals(f.getNome() ) ) {
            return true;
        }
        else
            return false;*/

        return  this.getNome().equals(f.getNome());
            
    } 

}

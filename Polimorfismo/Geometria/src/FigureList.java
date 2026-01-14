import java.util.ArrayList;
import java.util.Collections;

public class FigureList 
{
    ArrayList<Figura> collezione;

    public FigureList()
    {
        collezione = new ArrayList<Figura>();
    }

    public FigureList(int capacity)
    {
        collezione = new ArrayList<>(capacity);
    }

    public FigureList(Figura f)
    {
        this(1);
        collezione.add(f);
    }

    /**
     * Aggiunge una figura nella posizione passata come indice.
     * Se l'incide non è valido, solleva un'eccezione.
     * @param index
     * @param figura
     */
    public void addFigura(int index, Figura figura){
        collezione.add(index, figura);
    }


    /**
     * Rimuove tutte le figure il cui nome è uguale o contiene la stringa passata come parametro.
     * Restituisce il numero di figure rimosse.
     * 
     * @param nameLike
     * @return
     */
    public int removeFigure(String nameLike){
        int numeroFigure = 0;
        
        for (int i = collezione.size()-1; i >=0; i--) {
            if (collezione.get(i).getNome().contains(nameLike)) {
                collezione.remove(i);                
                numeroFigure++;
            }
        }
        
        return numeroFigure;
    }

    public void sort()
    {
        Collections.sort(collezione);
    }
}

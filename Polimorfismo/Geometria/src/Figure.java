// gestisce una collezione di figure
public class Figure {
    private Figura[] collezione;
    private int count;
    private int dimmax;

    public Figure(int dimmax){
        this.dimmax = dimmax;
        collezione = new Figura[dimmax];
        this.count = 0;
    }

    public void add(Figura f) throws Exception{
        if (count<dimmax) {

            if(indexOf(f) >=0 )
                collezione[count++] = f;
            else
                throw new Exception("Figura già presente");
            
            /*collezione[count] = f;
            count++;*/
        }
        else{
            throw new Exception("Collezione piena");
        }
    }


    // restituisce l'indice della figura item all'interno della collezione, se esiste.
    // altrimenti, restituisce -1.
    public int indexOf(Figura item){
        for (int i = 0; i < count; i++) {
            if (collezione[i].equals(item)) 
            {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        
        String tmp="";

        for (int i = 0; i < count; i++) {
            tmp+=collezione[i].toString()+"\n";
        }

        return tmp;
    }

    public int getCount(){
        return count;
    }

    public Figura getElement(int index){
        if (index>=0 && index<count) {
            return collezione[index];    
        }
        else{
            throw new ArrayIndexOutOfBoundsException("Valore indice non corretto");
        }
        
    }
}

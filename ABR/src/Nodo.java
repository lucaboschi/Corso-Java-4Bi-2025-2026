public class Nodo {
    private int key;
    private Nodo sinistra;
    private Nodo destra;


    public Nodo(int key) {
        this.key = key;
        this.sinistra = null;
        this.destra = null;
    }


    public int getKey() {
        return key;
    }


    public void setKey(int key) {
        this.key = key;
    }


    public Nodo getSinistra() {
        return sinistra;
    }


    public void setSinistra(Nodo sinistra) {
        this.sinistra = sinistra;
    }


    public Nodo getDestra() {
        return destra;
    }


    public void setDestra(Nodo destra) {
        this.destra = destra;
    }

    
    
}

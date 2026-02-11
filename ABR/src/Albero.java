import java.security.PublicKey;

public class Albero {

    private Nodo radice;

    // COSTRUTTORI

    public Albero()
    {
        radice = null;
    }

    public Albero(Nodo radice)
    {
        this.radice = radice;
    }

    

    // SET GET
    
    public Nodo getRadice() {
        return radice;
    }

    public void setRadice(Nodo radice) {
        this.radice = radice;
    }


    // METODI DI GESTIONE DELL'ALBERO

    public void insert(int key)
    {
        radice = insertRicorsivoKey(radice, key);
    }

    private Nodo insertRicorsivoKey(Nodo root, int key)
    {
        // se non esiste una radice e passo il valore null,
        // viene costruito un nuovo nodo con il valore della key e impostato come radice
        
        if (root == null) {
            root = new Nodo(key);
            return root;
        }
        // inizia il processo ricorsivo
        else if(key < root.getKey()){
            root.setSinistra(insertRicorsivoKey(root.getSinistra(), key));
        }else if(key > root.getKey()){
            root.setDestra(insertRicorsivoKey(root.getDestra(), key));
        }
        
        return root;
    }

    public void insert(Nodo nodo)
    {
        if(nodo == null) return;

        // sicurezza: se mi viene passato un nodo che, oltre alla key, ha anche i riferimenti a dx e sx
        nodo.setSinistra(null);
        nodo.setDestra(null);

        radice = insertRicorsivoNodo(radice, nodo);
    }

    private Nodo insertRicorsivoNodo(Nodo root, Nodo nodo)
    {
        // se non esiste una radice e passo il valore null,
        // viene impostato come root tale valore
        
        if (root == null) {
            root = nodo;
            return root;
        }
        // inizia il processo ricorsivo
        else if(nodo.getKey() < root.getKey()){
            root.setSinistra(insertRicorsivoNodo(root.getSinistra(), nodo));
        }else if(nodo.getKey() > root.getKey()){
            root.setDestra(insertRicorsivoNodo(root.getDestra(), nodo));
        }
        
        return root;
    }

    public void visitaInOrder()
    {
        visitaInOrderRicorsiva(radice);
    }

    private void visitaInOrderRicorsiva(Nodo root)
    {
        if (root!=null) 
        {
            visitaInOrderRicorsiva(root.getSinistra());    
            System.out.print(root.getKey()+ " ");
            visitaInOrderRicorsiva(root.getDestra());    
        }
    }    



    public void visitaPreOrder()
    {
        visitaPreOrderRicorsiva(radice);
    }

    private void visitaPreOrderRicorsiva(Nodo root)
    {
        if (root!=null) 
        {
            System.out.print(root.getKey()+ " ");
            visitaPreOrderRicorsiva(root.getSinistra());    
            visitaPreOrderRicorsiva(root.getDestra());    
        }
    }



    public void visitaPostOrder()
    {
        visitaPostOrderRicorsiva(radice);
    }

    private void visitaPostOrderRicorsiva(Nodo root)
    {
        if (root!=null) 
        {
            visitaPostOrderRicorsiva(root.getSinistra());    
            visitaPostOrderRicorsiva(root.getDestra());    
            System.out.print(root.getKey()+ " ");
        }
    }

}

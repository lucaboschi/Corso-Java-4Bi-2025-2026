public class Rettangolo extends Figura{

    public Rettangolo(int base, int altezza, String nome)
    {
        super(base, altezza, nome);
    }

    @Override
    public String toString() {
        
        return getClass().getName()+ " "+super.toString();
    }

    @Override
    public double area() {
        
        return getAltezza()*getBase();
    }
}

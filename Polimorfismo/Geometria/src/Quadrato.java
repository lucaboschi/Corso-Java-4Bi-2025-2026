public class Quadrato extends Rettangolo{
    int lato;

    public Quadrato(int lato, String nome){
        super(lato, lato, nome);
        this.lato = lato;
    }

    public void setLato(int lato){
        this.lato = lato;
    }

    public int getLato(){
        return lato;
    }

    @Override
    public String toString() {
        
        return getClass().getName() + " - "+getNome()+" - lato = "+getLato();
    }

    @Override
    public double area() {
        
        return Math.pow(getLato(), 2);
    }


    public double perimetro()
    {
        return getLato()*4;
    }
}

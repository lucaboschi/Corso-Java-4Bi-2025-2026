public class CampoCalcio implements IMisurabile, IStampabile{

    String nome;
    int lunghezza;
    int larghezza;


    public CampoCalcio(String nome, int lunghezza, int larghezza){
        this.larghezza = larghezza;
        this.lunghezza = lunghezza;
        this.nome = nome;
    }

    @Override
    public double area(){
        return lunghezza*larghezza;
    }

    @Override
    public double perimetro(){
        return (lunghezza*2)+(larghezza*2);
    }

    @Override
    public String toMaiuscString() {
        return nome.toUpperCase();
    }


    
}

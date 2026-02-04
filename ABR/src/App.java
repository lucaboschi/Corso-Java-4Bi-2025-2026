public class App {
    public static void main(String[] args) {
        Albero albero = new Albero();

        Nodo n1 = new Nodo(50);

        albero.insert(n1);
        albero.insert(30);
        albero.insert(20);
        albero.insert(40);
        albero.insert(70);
        albero.insert(60);
        albero.insert(80);
    }
}

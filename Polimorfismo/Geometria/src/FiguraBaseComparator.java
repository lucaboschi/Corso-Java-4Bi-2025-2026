import java.util.Comparator;

public class FiguraBaseComparator implements Comparator<Figura>{

    @Override
    public int compare(Figura o1, Figura o2) {
        int b1 = o1.getBase();
        int b2 = o2.getBase();

        if (b1>b2) {
            return 1;
        }
        else if (b1 == b2){
            return 0;
        }
        else{
            return -1;
        }
    }

}

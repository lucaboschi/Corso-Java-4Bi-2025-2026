import java.util.Comparator;

public class App {
    public static void main(String[] args) throws Exception {

        try {

            IMisurabile xx = new CampoCalcio("MaraCanà", 120, 40);


            Figura ff = new Rettangolo(3, 4, "rett");

            
            FigureList collFigure = new FigureList(5);


            Rettangolo r1;
            r1 = new Rettangolo(10, 56, "R2");

            collFigure.addFigura(r1);

            Figura r2;
            r2 = new Rettangolo(30, 40, "R1");

            collFigure.addFigura(r2);

            Figura f3 = new Quadrato(5, "Q1");
            collFigure.addFigura(f3);

            Figura f4 = new Quadrato(89, "quadrato 2");
            collFigure.addFigura(f4);

            System.out.println("\n\n****************************\n\n");
            System.out.println(collFigure);

            collFigure.sort();

            System.out.println("\n\n** ORDINAMENTO PREDEFINITO (nome) **\n\n");
            System.out.println(collFigure);

            System.out.println("\n\n** ORDINAMENTO AGGIUNTIVO (base) **\n\n");

            // lo faccio quando il criterio aggiuntivo di ordinamento è importante
            // da giustificare la creazione di una nuova classe di tipo Comparator
            collFigure.sort(new FiguraBaseComparator());
            System.out.println(collFigure);
            

            //  LAMBDA

            System.out.println("\n\n** ORDINAMENTO AGGIUNTIVO (inventato in loco dal programmatore - in questo caso, altezza) **\n\n");
            collFigure.sort(Comparator.comparing( (Figura f) -> (f.getAltezza())).reversed());
            System.out.println(collFigure);


            // REFERENCE METHOD
            System.out.println("\n\n** ORDINAMENTO AGGIUNTIVO (inventato in loco dal programmatore - reference method, base) **\n\n");
            collFigure.sort(Comparator.comparing(Figura :: getBase));
            System.out.println(collFigure);

            //System.out.println("\n\n************* AREA ***************\n\n");

            /*for (int i = 0; i < collFigure.getCount(); i++) {
                System.out.println(collFigure.getElement(i).area());
            }

            System.out.println(collFigure.getElement(0).toString());

            Figura f1 = collFigure.getElement(0);

            Figura f2 = collFigure.getElement(1);

            if (f1.equals(f2)) {
                System.out.println("UGUALI");
            } else {
                System.out.println("DIVERSE");
            }
*/
            //System.out.println("\n\n***************   PERIMETRO  *************\n\n");

           // for (int i = 0; i < collFigure.getCount(); i++) {
            //    if (collFigure.getElement(i) instanceof Quadrato) {

                    /*
                     * Quadrato q = (Quadrato)collFigure.getElement(i);
                     * double permetroQ = q.perimetro();
                     * System.out.println(permetroQ);
                     */

           //         System.out.println("perimetro :" + ((Quadrato) collFigure.getElement(i)).perimetro());

            //    }
            //}

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}

public class App {
    public static void main(String[] args) throws Exception {

        try {

            Figure collFigure = new Figure(5);

            Rettangolo r1;
            r1 = new Rettangolo(20, 36, "R1");

            collFigure.add(r1);

            Figura r2;
            r2 = new Rettangolo(30, 40, "R1");

            collFigure.add(r2);

            Figura f3 = new Quadrato(5, "Q1");
            collFigure.add(f3);

            Figura f4 = new Quadrato(8, "Q1");
            collFigure.add(f4);

            System.out.println("\n\n****************************\n\n");
            System.out.println(collFigure);

            System.out.println("\n\n************* AREA ***************\n\n");

            for (int i = 0; i < collFigure.getCount(); i++) {
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

            System.out.println("\n\n***************   PERIMETRO  *************\n\n");

            for (int i = 0; i < collFigure.getCount(); i++) {
                if (collFigure.getElement(i) instanceof Quadrato) {

                    /*
                     * Quadrato q = (Quadrato)collFigure.getElement(i);
                     * double permetroQ = q.perimetro();
                     * System.out.println(permetroQ);
                     */

                    System.out.println("perimetro :" + ((Quadrato) collFigure.getElement(i)).perimetro());

                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}

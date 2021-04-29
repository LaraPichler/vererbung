public class Gehaltsberechnung {
    public static void main(String[] args) {
        Mitarbeiter[] ma = new Mitarbeiter[3];

        ma[0] = new Beamter(1, "Meier", 41,3021, 91, 10);
        ma[1] = new Angestellter(2, "Smith", 16, 2020, 502, 132);
        ma[2] = new Arbeiter(3, "Doe", 20, 113, 35, 11, 13);

        double bruttoSumme = 0.0;
        for(int i = 0; i<ma.length; i++){
            bruttoSumme += ma[i].monatsBrutto();
        }
        System.out.println("Bruttosumme" + bruttoSumme);
    }
}

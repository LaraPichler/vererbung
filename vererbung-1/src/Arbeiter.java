public class Arbeiter extends Mitarbeiter{
    private double stundenLohn;
    private double anzahlStunden;
    private double ueberstundenZuschlag;
    private double anzahlUeberstunden;

    public Arbeiter(int persNr, String name, int dienstAlter, double stundenLohn, double anzahlStunden, double ueberstundenZuschlag, double anzahlUeberstunden) {
        super(persNr, name);
        this.stundenLohn = stundenLohn;
        this.anzahlStunden = anzahlStunden;
        this.ueberstundenZuschlag = ueberstundenZuschlag;
        this.anzahlUeberstunden = anzahlUeberstunden;
    }

    public double monatsBrutto() {
        return stundenLohn*anzahlStunden + (stundenLohn + ueberstundenZuschlag)*anzahlStunden;
    }
}

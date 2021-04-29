public abstract class Mitarbeiter {
    private int persNr;
    private String name;
    private int dienstAlter;

    public Mitarbeiter(int persNr, String name) {
        this.persNr = persNr;
        this.name = name;
        this.dienstAlter = 0;
    }

    public abstract double monatsBrutto();
}

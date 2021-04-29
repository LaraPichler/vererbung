public class Beamter extends Mitarbeiter{

    private double grundGehalt;
    private double familienZuschlag;
    private double stellenZulage;

    public Beamter(int persNr, String name, int dienstAlter, double grundGehalt, double familienZuschlag, double stellenZulage) {
        super(persNr, name);
        this.grundGehalt = grundGehalt;
        this.familienZuschlag = familienZuschlag;
        this.stellenZulage = stellenZulage;
    }

    public double monatsBrutto() {
        return grundGehalt + familienZuschlag + stellenZulage;
    }
}

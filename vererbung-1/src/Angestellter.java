public class Angestellter extends Mitarbeiter{
    private double grundGehalt;
    private double ortsZuschlag;
    private double zulage;

    public Angestellter(int persNr, String name, int dienstAlter, double grundGehalt, double ortsZuschlag, double zulage) {
        super(persNr, name);
        this.grundGehalt = grundGehalt;
        this.ortsZuschlag = ortsZuschlag;
        this.zulage = zulage;
    }

    @Override
    public double monatsBrutto() {
        return grundGehalt + ortsZuschlag + zulage;
    }
}

package gestionInscription;

public class Moto extends Vehicule {

    private int cylindree;

    public Moto(int numId, Constructeur constructeur, int cyl) throws MotoCylindreeException {
        super(constructeur);
        if (cyl <= 400) {
            //la cly de moto doit > 400, sinon coef<0
            MotoCylindreeException e = new MotoCylindreeException(cyl);
            throw e;
        }
        this.cylindree = cyl;
        // TODO Auto-generated constructor stub
    }

    public int getCylindree() {
        return cylindree;
    }

    @Override
    public float getCoefficientVehicule() {
        int cylindreeStandard = 500;
        float proportion = 0.25f;
        //int tranche = 25;
        float coef = 1;
        int diff;
        int n;

        diff = cylindree - cylindreeStandard;
        n = diff / 25;
        coef = coef * (1 + n * proportion);
        return coef;
    }

}

package gestionInscription;

public class Voiture extends Vehicule {

    private int puissance;

    public Voiture(int numId, Constructeur constructeur, int pui) throws VehiculeException {
        super(constructeur);
        if (pui <= 0) {
            VehiculeException e = new VehiculeException(pui);
            throw e;
        }
        this.puissance = pui;
        // TODO Auto-generated constructor stub
    }

    public int getPuissance() {
        return puissance;
    }

    @Override
    public float getCoefficientVehicule() {
        int puissanceStandard = 300;
        float coef = 1;
        int diff;
        float proportion = 0.05f;

        diff = puissance - puissanceStandard;

        if (diff == 0) {
            coef = coef;
        } else {
            if (diff > 0) {
                coef = coef * (1 + (diff * proportion));
            } else {
                if (diff >= -20 && diff < 0) {
                    coef = coef;
                } else {
                    if (diff < -20) {
                        coef *= (1 + 0.05 * (int) ((diff + 20) / 20));
                    }
                }
            }
        }
        return coef;
    }
}

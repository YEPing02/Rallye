package gestionInscription;

public class Camion extends Vehicule {

    private int poids;

    public Camion(int numId, Constructeur constructeur, int poi) throws VehiculeException {
        super(constructeur);
        if (poi <= 0) {
            VehiculeException e = new VehiculeException(poi);
            throw e;
        }
        this.poids = poi;
        // TODO Auto-generated constructor stub
    }

    public int getPoids() {
        return poids;
    }

    //méthode pour calculer le coef d'un voiture
    public float getCoefficientVehicule() { // poids minimum 1000/100 *0.1 =1   
        int poidsStandard = 2000;
        int n;
        int diff;
        float coef = 1;
        float proportion = 0.1f;
        diff = poids - poidsStandard;
        n = diff / 100;  // 190/100=1MOD90
        coef = coef * (1 + n * proportion);
        return coef;
    }

}

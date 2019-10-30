package gestionInscription;

public class VehiculeException extends Exception {

    //Exception pour vérifier le puissance /poids /cly d'un véhicule
    protected int i;

    public VehiculeException(int i) {
        this.i = i;
    }

    @Override
    public String getMessage() {
        return "Valeur " + i + " pas autorisé.";
    }
}

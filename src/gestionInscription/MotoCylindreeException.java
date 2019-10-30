package gestionInscription;

public class MotoCylindreeException extends VehiculeException {

    //Exception la cylindrée doit être supérieur à 400, sinon coef négatif
    public MotoCylindreeException(int i) {
        super(i);
    }

    @Override
    public String getMessage() {
        return "La cylindrée doit être supérieur à 400 :  " + this.i + " pas autorisé.";
    }
}

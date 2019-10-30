package gestionClassement;

public class TempsInvalideException extends Exception {

    //exception pour le temps pas correspondre à demande ex. temps < 0
    float temps;

    public TempsInvalideException(float temps) {
        this.temps = temps;
    }

    public String getMessage() {
        return ("Temps " + this.temps + " pas autorisé");
    }

}

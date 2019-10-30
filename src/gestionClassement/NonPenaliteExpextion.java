package gestionClassement;

public class NonPenaliteExpextion extends Exception {
//Exception si pas une pénalité concernant cette inscription

    public NonPenaliteExpextion() {

    }

    public String getMessage() {
        return ("Pénalité n'existe pas");
    }

}

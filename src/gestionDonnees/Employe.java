package gestionDonnees;

public class Employe extends Utilisateur {

    private String nomE;
    private String prenomE;

    //Constructeurs
    public Employe(int identifiant, String mdp, String nomE, String prenomE) {
        super(identifiant, mdp);
        this.nomE = nomE;
        this.prenomE = prenomE;
    }

    //Méthodes
    public String getNomE() {
        return this.nomE;
    }

    public String getPrenomE() {
        return this.prenomE;
    }
}

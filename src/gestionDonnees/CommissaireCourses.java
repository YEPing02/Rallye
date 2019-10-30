package gestionDonnees;

public class CommissaireCourses extends Utilisateur {

    private String nomCm;
    private String prenomCm;

    //Constructeurs
    public CommissaireCourses(int identifiant, String mdp, String nomCm, String prenomCm) {
        super(identifiant, mdp);
        this.nomCm = nomCm;
        this.prenomCm = prenomCm;

    }

    //Méthodes
    public String getNomCm() {
        return this.nomCm;
    }

    public String getPrenomCm() {
        return this.prenomCm;
    }
}

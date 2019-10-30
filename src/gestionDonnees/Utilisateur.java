package gestionDonnees;

public class Utilisateur {

    private int identifiant;
    private String mdp;

    //Constructeurs
    public Utilisateur(int identifiant, String mdp) {
        this.identifiant = identifiant;
        this.mdp = mdp;
    }

    public Utilisateur() {

    }
    //Méthodes

    public int getIdentifiant() {
        return this.identifiant;
    }

    public String getMdp() {
        return this.mdp;
    }
}

package gestionDonnees;

public class Partenaire extends Utilisateur {

    private String raisonSoc;
    private String typePartenaire;

    //Constructeurs
    public Partenaire(int identifiant, String mdp, String raisonSoc, String typePartenaire) {
        super(identifiant, mdp);
        this.raisonSoc = raisonSoc;
        this.typePartenaire = typePartenaire;
    }

    //Méthodes
    public String getRaisonSoc() {
        return this.raisonSoc;
    }

    public String getTypePartenaire() {
        return this.typePartenaire;
    }
}

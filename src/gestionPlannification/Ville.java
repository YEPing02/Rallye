package gestionPlannification;

public class Ville {

    private String nomVille;
    private String nomPays;

    //Constructeurs
    public Ville(String nomVille, String nomPays) {
        this.nomVille = nomVille;
        this.nomPays = nomPays;
    }

    //Méthodes
    public String getNomVille() {
        return this.nomVille;
    }

    public String getNomPays() {
        return this.nomPays;
    }
}

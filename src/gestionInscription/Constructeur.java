package gestionInscription;

public class Constructeur {

    private String nomConstructeur;
    private boolean estNomine;
    private EquipeConstructeur equipe;
    private String adrConstructeur;
    private String paysConstructeur;

    //Constructeur principalement utilisé
    public Constructeur(String nomConstructeur, boolean estNomine) {
        this.nomConstructeur = nomConstructeur;
        this.estNomine = estNomine;
    }

    public Constructeur(String nomConstructeur, boolean estNomine, EquipeConstructeur equipe, String adrConstructeur, String paysConstructeur) {
        this.nomConstructeur = nomConstructeur;
        this.estNomine = estNomine;
        this.equipe = equipe;
        this.adrConstructeur = adrConstructeur;
        this.paysConstructeur = paysConstructeur;
    }

    public Constructeur(String nomConstructeur, boolean estNomine, EquipeConstructeur equipe) {
        this.nomConstructeur = nomConstructeur;
        this.estNomine = estNomine;
        this.equipe = equipe;

    }

    public String getNomConstructeur() {
        return nomConstructeur;
    }

    public boolean isEstNomine() {
        return estNomine;
    }

    //hashcode sert au hashmap
    @Override
    public int hashCode() {
        return this.nomConstructeur.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Constructeur) {
            Constructeur c = (Constructeur) o;
            return c.nomConstructeur == this.nomConstructeur;
        }
        return false;
    }

}

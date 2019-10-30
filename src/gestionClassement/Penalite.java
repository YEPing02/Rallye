package gestionClassement;

public class Penalite {

    private String libellePenalite;
    private String typePenalite;

    public Penalite(String libelle, String type) {
        this.libellePenalite = libelle;
        this.typePenalite = type;
    }

    public String getLibellePenalite() {
        return libellePenalite;
    }

    public String getTypePenalite() {
        return typePenalite;
    }

}

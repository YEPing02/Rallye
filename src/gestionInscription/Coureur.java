package gestionInscription;

import java.util.ArrayList;
import java.util.Date;
import gestionDonnees.*;

public class Coureur extends Utilisateur {

    private String nomC;
    private String prenomC;
    private Date dateNsc;
    private String gsC;
    private String rhesusGsC;
    private EquipeConstructeur equipeConstr;

    //Constructeur principalement utilisé
    public Coureur(String nomC, String prenomC, Date dateNsc, String gsC, String rhesusGsC) {
        super();
        this.nomC = nomC;
        this.prenomC = prenomC;
        this.dateNsc = dateNsc;
        this.gsC = gsC;
        this.rhesusGsC = rhesusGsC;
    }

    public Coureur(int identifiant, String mdp) {
        super(identifiant, mdp);
    }

    public Coureur(int identifiant, String mdp, String nomC, String prenomC, Date dateNsc, String gsC, String rhesusGsC) {
        super(identifiant, mdp);
        this.nomC = nomC;
        this.prenomC = prenomC;
        this.dateNsc = dateNsc;
        this.gsC = gsC;
        this.rhesusGsC = rhesusGsC;
    }

    public String getNomC() {
        return nomC;
    }

    public String getPrenomC() {
        return prenomC;
    }

    public Date getDateNsc() {
        return dateNsc;
    }

    public String getGsC() {
        return gsC;
    }

    public String getRhesusGsC() {
        return rhesusGsC;
    }

    public EquipeConstructeur getEquipeConstructeur() {
        return this.equipeConstr;
    }

    //un coureur ajouter dans un équipe
    public void setEquipeConstructeur(EquipeConstructeur e) {
        this.equipeConstr = e;
    }

    public boolean estDansEquipe() {
        return this.equipeConstr != null;
    }

    //boolean à vérifier si coureur dans une équipe
    public void ajouterEquipe(EquipeConstructeur e) {
        this.equipeConstr = e;
    }

    @Override
    public int hashCode() {
        return (this.prenomC + this.nomC).hashCode() + this.getIdentifiant();
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Coureur) {
            Coureur c = (Coureur) o;
            //proble avec nom prenom
            return c.getIdentifiant() == this.getIdentifiant() && c.prenomC == this.prenomC && c.nomC == this.nomC;
            //return c.getIdentifiant()==this.getIdentifiant();
        }
        return false;
    }
}

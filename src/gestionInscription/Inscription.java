package gestionInscription;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import gestionClassement.Disputer;
import gestionClassement.Realiser;
import gestionPlannification.*;

public class Inscription {

    private Date dateInscrip;
    private int numIdInscrip;
    private String etatInscrip;
    protected EtatInscription etatInsc;
    private Coureur coureur;
    private Vehicule vehicule;
    private Edition edition;

    public Inscription(Coureur c, Vehicule v, Edition ed, int numInsc) {
        super();
        this.coureur = c;
        this.vehicule = v;
        this.dateInscrip = new Date();
        this.numIdInscrip = numInsc;
        this.etatInsc = EtatInscription.encours;
        this.edition = ed;
    }

    public Inscription(Date dateInscrip, int numIdInscrip) {
        super();
        this.dateInscrip = dateInscrip;
        this.numIdInscrip = numIdInscrip;
        this.etatInsc = EtatInscription.encours;
    }

    public Date getDateInscrip() {
        return dateInscrip;
    }

    public int getNumIdInscrip() {
        return numIdInscrip;
    }

    public EtatInscription getEtatInscripEnum() {
        return this.etatInsc;
    }

    public Coureur getCoureur() {
        return coureur;
    }

    public Vehicule getVehicule() {
        return vehicule;
    }

    public void modifInscrip(Coureur coureur, Vehicule vehicule) {
        coureur.getNomC();
        coureur.getPrenomC();
        vehicule.getNumId();
    }

    public void modifEtatInscrip(EtatInscription etat) {
        this.etatInsc = etat;
    }

    public String supInscrip() {
        if (etatInsc == etatInsc.encours) {
            this.etatInsc = etatInsc.supprime;
        }
        return this.etatInscrip.toString();
    }

    public void valideInscrip() {
        if (this.etatInsc == etatInsc.encours) {
            this.etatInsc = EtatInscription.depart;
        }
    }

    public void departRallye() {
        if (this.etatInsc == etatInsc.valide) {
            this.etatInsc = EtatInscription.depart;
        }
    }

    public void arretRallye() {
        this.etatInsc = EtatInscription.arret;
    }

    @Override
    public int hashCode() {
        return this.getNumIdInscrip() + (this.getDateInscrip().toString() + this.edition.toString() + this.coureur.toString() + this.vehicule.toString()).hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Inscription) {
            Inscription i = (Inscription) o;
            //return(i.getNumIdInscrip() == this.numIdInscrip  &&  i.edition.getNumEdition() == this.edition.getNumEdition());
            return (i.getNumIdInscrip() == this.numIdInscrip && i.getCoureur().equals(this.coureur) && i.edition.getNumEdition() == this.edition.getNumEdition());
        }
        return false;
    }
}

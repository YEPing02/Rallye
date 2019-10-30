package gestionClassement;

import gestionPlannification.*;
import gestionInscription.*;

public class Realiser {

    private Inscription inscriptionCoureur;
    private Etape etape;
    private float tempsEtape;
    //ajouter dans étape hashmap

    public void accumTempsEtape(float tempsSpeciale) {
        this.tempsEtape += tempsSpeciale;
    }

    public Realiser(Inscription ins, Etape e, float temps) {
        this.inscriptionCoureur = ins;
        this.etape = e;
        this.tempsEtape = temps;
    }

    public Realiser(Inscription ins, Etape e) {
        this.inscriptionCoureur = ins;
        this.etape = e;

    }

    public Inscription getInscription() {
        return this.inscriptionCoureur;
    }

    public float getTempsEtape() {
        return this.tempsEtape;
    }

}

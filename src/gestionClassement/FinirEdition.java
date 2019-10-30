package gestionClassement;

import gestionInscription.Inscription;
import gestionPlannification.Edition;

public class FinirEdition {

    private Inscription inscriptionCoureur;
    private Edition edition;
    private float tempsEdition;

    public FinirEdition(Inscription ins, Edition edi, float temps) {
        this.inscriptionCoureur = ins;
        this.edition = edi;
        this.tempsEdition = temps;
    }

    public float getTempsEdition() {
        return this.tempsEdition;
    }

    public Inscription getInscription() {
        return this.inscriptionCoureur;
    }

    //accumuler le temps pour une étape
    public void accumTempsEtape(float tempsEtape) {
        this.tempsEdition += tempsEtape;
    }
}

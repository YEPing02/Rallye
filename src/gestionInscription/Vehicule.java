package gestionInscription;

import java.util.ArrayList;

public abstract class Vehicule {

    protected int numId;
    protected int nbMoteurUtilise = 0;
    protected Constructeur constructeur;

    public abstract float getCoefficientVehicule();

    public Vehicule(Constructeur constructeur) {
        this.constructeur = constructeur;
    }

    public int getNumId() {
        return numId;
    }

    public int getNbMoteur() {
        return nbMoteurUtilise;
    }

    public Constructeur getConstructeur() {
        return this.constructeur;
    }

    public void setNumId(int numId) {
        this.numId = numId;
    }

    public void setNbMoteur(int nbMoteur) {
        this.nbMoteurUtilise = nbMoteur;
    }

    public void saisirInfo(int numId, int nbMoteurUtilise) {
        this.numId = numId;
        this.nbMoteurUtilise = nbMoteurUtilise;
    }

    public void ModifierVehicule(int id, int nbMot) {
        this.nbMoteurUtilise = nbMot;
        this.numId = id;
    }

    //get type de voiture a partir le nom de classe
    public String getTypeVehicule() {
        return this.getClass().getSimpleName();
    }

}

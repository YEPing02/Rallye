package gestionClassement;

import gestionPlannification.*;
import gestionInscription.*;
import java.util.ArrayList;

public class Disputer {

    private Inscription inscription;
    private Speciale speciale;
    private ArrayList<Penalite> penalites;
    private ArrayList<Float> tempsPenalite;

    private float temps;

    public Disputer(Inscription inscription, Speciale speciale) {
        this.inscription = inscription;
        this.speciale = speciale;

        //ou tableau de 2 dimantion?
        //hashmap pas possible car une pénalité est enregistré 2 fois
        this.penalites = new ArrayList<Penalite>();
        this.tempsPenalite = new ArrayList<Float>();
    }

    public Inscription getInscription() {
        return this.inscription;
    }

    public Speciale getSpeciale() {
        return speciale;
    }

    public float getTemps() {
        return temps;
    }

    public int getNbrPenalites() {
        return this.penalites.size();
    }

    public ArrayList<Penalite> getPenalites() {
        return penalites;
    }

    public Penalite getPenalite(int noPenalite) {
        return this.penalites.get(noPenalite);
    }

    //ajouter le temps pour un spéciale
    public void setTemps(float temps) throws TempsInvalideException {
        if (temps < 0) {
            TempsInvalideException e = new TempsInvalideException(temps);
            throw e;
        }
        this.temps = temps;
    }

    //ajouter le temps pour la pénalité selon son n° ordre
    public void setTempsPenalite(int noPenalite, float tempsPenalite) throws TempsInvalideException {
        if (tempsPenalite < 0) {
            TempsInvalideException e = new TempsInvalideException(tempsPenalite);
            throw e;
        }
        this.tempsPenalite.set(noPenalite, tempsPenalite);
    }

    //ajouter le temps pour la dernière pénalité
    public void setTempsPenalite(float tempsPenalite) throws TempsInvalideException {
        if (tempsPenalite < 0) {
            TempsInvalideException e = new TempsInvalideException(tempsPenalite);
            throw e;
        }
        this.tempsPenalite.add(tempsPenalite);
    }

    //ajouter une pénalité
    public void setPenalite(Penalite p) {
        this.penalites.add(p);
    }

    //gérérer le temps final avec coef et pénlité
    public float getTempsFinal() {
        //float tempsFinal = this.temps;
        float tempsFinal = this.temps * this.inscription.getVehicule().getCoefficientVehicule();
        for (float tp : this.tempsPenalite) {
            tempsFinal -= tp;
        }
        return tempsFinal;
    }

    //boolean pour dire si une disputer a pénalité
    public boolean aucunePenalite() {
        return this.penalites.isEmpty();
    }

    public String stringGetCoureur() {
        return this.getInscription().getCoureur().getNomC() + " " + this.getInscription().getCoureur().getPrenomC();
    }

    public String[] stringGetPena() {
        String[] s = new String[this.getPenalites().size()];
        for (int i = 0; i < this.getPenalites().size(); i++) {
            s[i] = "Pénalité" + " " + (i + 1);
        }
        return s;
    }

    public ArrayList<Float> getTempsPenalite() {
        return tempsPenalite;
    }

}

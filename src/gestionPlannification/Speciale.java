package gestionPlannification;

import java.util.ArrayList;

import gestionClassement.Disputer;
import gestionClassement.NonPenaliteExpextion;
import gestionClassement.Penalite;
import gestionClassement.TempsInvalideException;
import gestionClassement.*;
import gestionInscription.EtatInscription;
import gestionInscription.Inscription;

public class Speciale {

    private int numOrdreS;
    private float chronoLimiteS;
    private boolean estSuper;
    private float distanceS;
    private ArrayList<Disputer> resultatSpeciale;
    private boolean estAbandon;

    public Speciale(int numOrdreS, float chronoLimiteS, boolean estSuper, float distanceS) {
        this.numOrdreS = numOrdreS;
        this.chronoLimiteS = chronoLimiteS;
        this.estSuper = estSuper;
        this.distanceS = distanceS;
        this.resultatSpeciale = new ArrayList<Disputer>();
        this.estAbandon = false;
    }

    //Getter
    public int getNumOrdreS() {
        return numOrdreS;
    }

    public float getChronoLimiteS() {
        return chronoLimiteS;
    }

    public boolean isEstSuper() {
        return estSuper;
    }

    public float getDistanceS() {
        return distanceS;
    }

    public int getNBDisputer() {
        return this.resultatSpeciale.size();
    }

    public ArrayList<Disputer> getlstResultatSpeciale() {
        return resultatSpeciale;
    }
    // récupérer les disputer qui sont puni.

    public ArrayList<Disputer> getlstDisputerCpenalite() {
        ArrayList<Disputer> cp = new ArrayList<Disputer>();
        for (Disputer d : this.getlstResultatSpeciale()) {
            if (!d.getPenalites().isEmpty()) { // si il y a pena pour disputer
                cp.add(d);
            }
        }
        return cp;
    }
    //Setter

    public void setNumOrdreS(int numOrdreS) {
        this.numOrdreS = numOrdreS;
    }

    public void setChronoLimiteS(float chronoLimiteS) {
        this.chronoLimiteS = chronoLimiteS;
    }

    public void setEstSuper(boolean estSuper) {
        this.estSuper = estSuper;
    }

    public void setDistanceS(float distanceS) {
        this.distanceS = distanceS;
    }

    //Méthodes
    //idem constructeur ?
    public void creerSpeciale(int numOrdreS, float chronoLimiteS, boolean estSuper, float distanceS) {
        this.numOrdreS = numOrdreS;
        this.chronoLimiteS = chronoLimiteS;
        this.estSuper = estSuper;
        this.distanceS = distanceS;
    }

    public void modifSpeciale(int numOrdreS, float chronoLimiteS, boolean estSuper, float distanceS) {
        this.setNumOrdreS(numOrdreS);
        this.setChronoLimiteS(chronoLimiteS);
        this.setEstSuper(estSuper);
        this.setDistanceS(distanceS);
    }

    public void modifNumOrdreS(int numOrdreS) {
        this.setNumOrdreS(numOrdreS);
    }

    public void modifChronoLimiteS(float chronoLimiteS) {
        this.setChronoLimiteS(chronoLimiteS);
    }

    public void modifEstSuper(boolean estSuper) {
        this.setEstSuper(estSuper);
    }

    public void modifDistanceS(float distanceS) {
        this.setDistanceS(distanceS);
    }

    //méthode pour trier bulles tous les résulat d'une spéciale
    public ArrayList<Disputer> classementSpeciale() {
        ArrayList<Disputer> resultat = this.resultatSpeciale;
        for (int i = 0; i < resultat.size() - 1; i++) {
            for (int j = i + 1; j < resultat.size(); j++) {
                if (resultat.get(j).getTempsFinal() < resultat.get(i).getTempsFinal()) {
                    Disputer d = resultat.get(i);
                    resultat.set(i, resultat.get(j));
                    resultat.set(j, d);
                }
            }
        }
        return resultat;
    }

    //fonction pour transformer temps en seconde à format hh:mm:ss
    public String timeTransform(float time) {
        //float s=Math.round(time*100)/(float)100;
        int s = ((int) (time)) % 60;
        int a = (int) time / 60;
        int m = (int) a % 60;
        int h = (int) a / 60;

        String strA = "" + s;
        String strB = "" + m;
        String strC = "" + h;
        if (s < 10) {
            strA = "0" + s;
        }
        if (m < 10) {
            strB = "0" + m;
        }
        if (h < 10) {
            strC = "0" + h;
        }
        return (strC + ":" + strB + ":" + strA);
    }

    //méthode pour afficher le classement en String à l'interface
    public String afficheClassementSpeciale() {
        String s = "No \t Prénom \t Nom \t Temps \t Constructeur \t Véhicule";
        int i = 1;
        for (Disputer d : this.classementSpeciale()) {
            s += "\n " + i + " \t" + d.getInscription().getCoureur().getPrenomC() + " \t" + d.getInscription().getCoureur().getNomC() + " \t" + timeTransform(d.getTempsFinal()) + " \t" + d.getInscription().getVehicule().getConstructeur().getNomConstructeur() + "\t" + d.getInscription().getVehicule().getTypeVehicule();
            i++;
        }
        return s;
    }

    //enregistrer le temps d'un coureur
    public void enregistrerTemps(Inscription ins, float temps) throws TempsInvalideException {
        boolean trouve = false;
        int i = 0;

        while (!trouve && i < this.resultatSpeciale.size()) {
            if (resultatSpeciale.get(i).getInscription().equals(ins)) {
                this.resultatSpeciale.get(i).setTemps(temps);
                trouve = true;
            } else {
                i++;
            }
        }
        if (!trouve) {
            Disputer d = new Disputer(ins, this);
            d.setTemps(temps);
            this.resultatSpeciale.add(d);
        }
        if (temps > this.chronoLimiteS) {
            ins.modifEtatInscrip(EtatInscription.disqualife);
        }
    }

    //ajouter d'une pénalité à un coureur
    public void ajouterPenalite(Inscription ins, Penalite p) {
        boolean trouve = false;
        int i = 0;
        while (!trouve && i < this.resultatSpeciale.size()) {
            if (resultatSpeciale.get(i).getInscription().equals(ins)) {
                resultatSpeciale.get(i).setPenalite(p);
                trouve = true;
            } else {
                i++;
            }
            if (!trouve) {
                Disputer d = new Disputer(ins, this);
                d.setPenalite(p);
                this.resultatSpeciale.add(d);
            }
        }
    }

    //ajouter le temps de pénalite selon l'ordre de pénalité
    private void ajouterTempsPenalite(Inscription ins, int noP, float temps) throws NonPenaliteExpextion, TempsInvalideException {
        boolean trouve = false;
        int i = 0;

        while (!trouve && i < this.resultatSpeciale.size()) {
            if (this.resultatSpeciale.get(i).aucunePenalite() || this.resultatSpeciale.get(i).getNbrPenalites() <= noP) {
                NonPenaliteExpextion e = new NonPenaliteExpextion();
                throw e;
            }
            if (resultatSpeciale.get(i).getInscription().equals(ins)) {
                resultatSpeciale.get(i).setTempsPenalite(noP, temps);
                trouve = true;
            } else {
                i++;
            }

            if (!trouve) {

            }
        }
    }

    //aboondonné une spéciale
    public void abandonSpeciale() {
        this.estAbandon = true;
    }
}

package gestionPlannification;

import java.util.ArrayList;
import java.util.HashMap;

import gestionClassement.Disputer;
import gestionClassement.Realiser;
import gestionInscription.Inscription;

public class Etape {

    private float distanceE;
    private int numOrdreE;
    private String dateDebE;
    private String dateFinE;
    private NiveauDiffi niveauDiffi;
    private ArrayList<Speciale> lstSpeciales;

    public Etape(float distanceE, int numOrdreE, String dateDebE, String dateFinE, NiveauDiffi niveauDiffi) {
        super();
        this.distanceE = distanceE;
        this.numOrdreE = numOrdreE;
        this.dateDebE = dateDebE;
        this.dateFinE = dateFinE;
        this.niveauDiffi = niveauDiffi;
        this.lstSpeciales = new ArrayList<Speciale>();
    }

    public float getDistanceE() {
        return distanceE;
    }

    public int getNumOrdreE() {
        return numOrdreE;
    }

    public String getDateDebE() {
        return dateDebE;
    }

    public String getDateFinE() {
        return dateFinE;
    }

    public NiveauDiffi getNiveauDiffi() {
        return niveauDiffi;
    }

    public ArrayList<Speciale> getLstSpeciales() {
        return lstSpeciales;
    }

    public Speciale getSpeciale(int i) {
        return this.getLstSpeciales().get(i);
    }

    public Realiser getClassementEtape(int i) {
        return this.classementEtape().get(i);
    }

    //Setter
    public void setDistanceE(float distanceE) {
        this.distanceE = distanceE;
    }

    public void setNumOrdreE(int numOrdreE) {
        this.numOrdreE = numOrdreE;
    }

    public void setDateDebE(String dateDebE) {
        this.dateDebE = dateDebE;
    }

    public void setDateFinE(String dateFinE) {
        this.dateFinE = dateFinE;
    }

    public void setNiveauDiffi(NiveauDiffi niveauDiffi) {
        this.niveauDiffi = niveauDiffi;
    }

    public void setLstSpeciales(ArrayList<Speciale> lstSpeciales) {
        this.lstSpeciales = lstSpeciales;
    }

    //hashmap à enregistrer le résultat
    private HashMap<Inscription, Realiser> resultatEtape() {
        HashMap<Inscription, Realiser> resultatEtape = new HashMap<Inscription, Realiser>();
        for (Speciale s : this.lstSpeciales) {
            for (Disputer d : s.classementSpeciale()) {
                if (resultatEtape.containsKey(d.getInscription())) {
                    resultatEtape.get(d.getInscription()).accumTempsEtape(d.getTempsFinal());
                } else {
                    resultatEtape.put(d.getInscription(), new Realiser(d.getInscription(), this, d.getTempsFinal()));
                }
            }
        }
        return resultatEtape;
    }

    //classement d'une étape
    public ArrayList<Realiser> classementEtape() {
        ArrayList<Realiser> resultat = new ArrayList<Realiser>(this.resultatEtape().values());
        for (int i = 0; i < resultat.size() - 1; i++) {
            for (int j = i + 1; j < resultat.size(); j++) {
                if (resultat.get(j).getTempsEtape() < resultat.get(i).getTempsEtape()) {
                    Realiser r = resultat.get(i);
                    resultat.set(i, resultat.get(j));
                    resultat.set(j, r);
                }
            }
        }

        return resultat;
    }

    //fonction pour transformer temps en seconde à format hh:mm:ss
    private String timeTransform(float time) {
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
    public String afficheClassementEtape() {
        String s = "No \t Prénom \t Nom \t Temps \t Constructeur \t Véhicule";
        int i = 1;
        for (Realiser d : this.classementEtape()) {
            s += "\n " + i + " \t" + d.getInscription().getCoureur().getPrenomC() + " \t" + d.getInscription().getCoureur().getNomC() + " \t" + timeTransform(d.getTempsEtape()) + " \t" + d.getInscription().getVehicule().getConstructeur().getNomConstructeur() + "\t" + d.getInscription().getVehicule().getTypeVehicule();
            i++;
        }
        return s;
    }

    //calculer coed selon niveau de difficulter
    public float getCoefDiffucult() {
        return (this.niveauDiffi.ordinal() * 0.1f + 1);
    }

    public void ajouterSpeciale(Speciale s) {
        this.lstSpeciales.add(s);
    }

}

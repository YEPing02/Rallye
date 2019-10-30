package gestionPlannification;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

import gestionClassement.ClassementAnnuel;
import gestionClassement.Disputer;
import gestionClassement.FinirEdition;
import gestionClassement.Realiser;
import gestionInscription.*;

public class Edition {

    private int numEdition; // manque dans 
    private ClassementAnnuel anneeR;
    private String dateDebR;
    private String dateFinR;
    private String dateLimiteInscrip;
    private ArrayList<Etape> lstEtapes;
    private ArrayList<Inscription> lstInscrip;

    public Edition(int numEdition, ClassementAnnuel anneeR, String dateDebR, String dateFinR, String dateLimiteInscrip) {
        this.numEdition = numEdition;
        this.anneeR = anneeR;
        this.dateDebR = dateDebR;
        this.dateFinR = dateFinR;
        this.dateLimiteInscrip = dateLimiteInscrip;
        this.lstEtapes = new ArrayList<Etape>();
        this.lstInscrip = new ArrayList<Inscription>();
    }

    public int getNumEdition() {
        return numEdition;
    }

    public int getAnneeR() {
        return this.anneeR.getAnnee();
    }

    public String getDateDebR() {
        return dateDebR;
    }

    public String getDateFinR() {
        return dateFinR;
    }

    public String getDateLimiteInscrip() {
        return dateLimiteInscrip;
    }

    public ArrayList<Etape> getLstEtapes() {
        return this.lstEtapes;
    }

    public ArrayList<Inscription> getLstInscrp() {
        return lstInscrip;
    }

    public Etape getEtape(int i) {
        return this.lstEtapes.get(i);
    }

    public Inscription getInscrp(int i) {
        return this.getInscrp(i);
    }

    public String[] getStringNomLstInscrp() {
        String s[] = new String[this.lstInscrip.size()];
        for (int i = 0; i < this.lstInscrip.size(); i++) {
            s[i] = this.lstInscrip.get(i).getCoureur().getNomC();
        }
        return s;
    }

    public void setNumEdition(int numEdition) {
        this.numEdition = numEdition;
    }

    public void setAnneeR(ClassementAnnuel anneeR) {
        this.anneeR = anneeR;
    }

    public void setDateDebR(String dateDebR) {
        this.dateDebR = dateDebR;
    }

    public void setDateFinR(String dateFinR) {
        this.dateFinR = dateFinR;
    }

    public void setDateLimiteInscrip(String dateLimiteInscrip) {
        this.dateLimiteInscrip = dateLimiteInscrip;
    }

    public void setLitEtapes(ArrayList<Etape> litEtapes) {
        this.lstEtapes = litEtapes;
    }

    //hashmap pour enregistrer le résultat d'une édition
    private HashMap<Inscription, FinirEdition> resultatEditoin() {
        HashMap<Inscription, FinirEdition> resultatEdition = new HashMap<Inscription, FinirEdition>();
        for (Etape e : this.lstEtapes) {
            for (Realiser r : e.classementEtape()) {
                if (resultatEdition.containsKey(r.getInscription())) {
                    resultatEdition.get(r.getInscription()).accumTempsEtape(r.getTempsEtape() * e.getCoefDiffucult());;
                } else {
                    resultatEdition.put(r.getInscription(), new FinirEdition(r.getInscription(), this, r.getTempsEtape() * e.getCoefDiffucult()));
                }
            }
        }
        return resultatEdition;
    }

    //classement d'une édition
    public ArrayList<FinirEdition> classementEditionCoureur() {
        ArrayList<FinirEdition> resultat = new ArrayList<FinirEdition>(this.resultatEditoin().values());
        for (int i = 0; i < resultat.size() - 1; i++) {
            for (int j = i + 1; j < resultat.size(); j++) {
                if (resultat.get(j).getTempsEdition() < resultat.get(i).getTempsEdition()) {
                    FinirEdition fe = resultat.get(i);
                    resultat.set(i, resultat.get(j));
                    resultat.set(j, fe);
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
    public String afficheClassementEdition() {
        String s = "No \t Prénom \t Nom \t Temps \t Constructeur \t Véhicule";
        int i = 1;
        for (FinirEdition d : this.classementEditionCoureur()) {
            s += "\n " + i + " \t" + d.getInscription().getCoureur().getPrenomC() + " \t" + d.getInscription().getCoureur().getNomC() + " \t" + timeTransform(d.getTempsEdition()) + " \t" + d.getInscription().getVehicule().getConstructeur().getNomConstructeur() + "\t" + d.getInscription().getVehicule().getTypeVehicule();
            i++;
        }
        return s;
    }

    private FinirEdition getNoClassementEdition(int index) {
        return this.classementEditionCoureur().get(index);
    }

    //méthode pour la correspondance entre le point selon le classement
    private int corespPoint(int classement) {
        int point;
        switch (classement) {
            case 0:
                point = 10;
                break;
            case 1:
                point = 8;
                break;
            case 2:
                point = 6;
                break;
            case 3:
                point = 5;
                break;
            case 4:
                point = 4;
                break;
            case 5:
                point = 3;
                break;
            case 6:
                point = 2;
                break;
            case 7:
                point = 1;
                break;
            default:
                point = 0;
                break;
        }
        return point;
    }

    //hashmap pour enregistrer le résultat d'une édition
    private HashMap<Coureur, Integer> resulatatEditionPointCoureur() {
        HashMap<Coureur, Integer> resultat = new HashMap<Coureur, Integer>();
        //pour 10 premières coureur, affecter le point
        //tenir compt le cas où nbr coureur infèrieur à8
        int total = this.classementEditionCoureur().size();
        int nbr = Math.min(total, 8);

        for (int i = 0; i < nbr; i++) {
            int point = corespPoint(i);
            resultat.put(this.getNoClassementEdition(i).getInscription().getCoureur(), point);
        }
        return resultat;
    }

    //méthode à transformer le hashmap au arrayliste
    public ArrayList<Entry<Coureur, Integer>> arrayEditionPointCoureur() {
        return new ArrayList<Map.Entry<Coureur, Integer>>(resulatatEditionPointCoureur().entrySet());
    }

    //hashmap pour enregistrer le résultat d'une édition
    private HashMap<EquipeConstructeur, Integer> resulatatEditionPointEquipe() {
        HashMap<EquipeConstructeur, Integer> resultat = new HashMap<EquipeConstructeur, Integer>();
        int cmp = 0; //compter 7 personne avec point
        int i = 0; //index pour parcourir ArrayList classementEdition
        while (cmp <= 7 && i < this.classementEditionCoureur().size()) {
            //si coureur dans l'équipe
            if (this.getNoClassementEdition(i).getInscription().getCoureur().estDansEquipe()) {
                int nouveauPoint;

                EquipeConstructeur eq = this.getNoClassementEdition(i).getInscription().getCoureur().getEquipeConstructeur();
                if (resultat.containsKey(eq)) {
                    nouveauPoint = resultat.get(eq) + corespPoint(cmp);
                } else {
                    nouveauPoint = corespPoint(cmp);
                }
                System.out.println(nouveauPoint);
                resultat.put(eq, nouveauPoint);
                cmp++;
                i++;
            } else {
                //si coureur pas dans l'équipe
                i++;
            }
        }
        return resultat;
    }

    //méthode à transformer le hashmap au arrayliste
    public ArrayList<Entry<EquipeConstructeur, Integer>> arrayEditionPointEquipe() {
        return new ArrayList<Map.Entry<EquipeConstructeur, Integer>>(resulatatEditionPointEquipe().entrySet());
    }

    public ArrayList<Entry<EquipeConstructeur, Integer>> classementEditionEquipe() {
        ArrayList<Entry<EquipeConstructeur, Integer>> lstRes = arrayEditionPointEquipe();
        for (int i = 0; i < lstRes.size() - 1; i++) {
            for (int j = i + 1; j < lstRes.size(); j++) {
                if (lstRes.get(i).getValue() < lstRes.get(j).getValue()) {
                    Entry<EquipeConstructeur, Integer> entry = lstRes.get(i);
                    lstRes.set(i, lstRes.get(j));
                    lstRes.set(j, entry);
                }
            }
        }
        return lstRes;
    }

    //méthode pour afficher le classement en String à l'interface
    public String afficheClassementEditionEquipe() {
        String s = "No \t Equipe \t Points";
        int i = 1;
        for (Entry<EquipeConstructeur, Integer> e : this.classementEditionEquipe()) {
            s += "\n " + i + " \t" + e.getKey().getNomEquipe() + " \t" + e.getValue();
            i++;
        }
        return s;
    }

    //hashmap pour enregistrer le résultat d'une édition
    private HashMap<Constructeur, Integer> resulatatEditionConstructeur() {
        HashMap<Constructeur, Integer> resultat = new HashMap<Constructeur, Integer>();
        int cmp = 0; //compter 7 personne avec point
        int i = 0; //index pour parcourir ArrayList classementEdition
        while (cmp <= 7 && i < this.classementEditionCoureur().size()) {
            //si constructeur est nommé
            if (this.getNoClassementEdition(i).getInscription().getVehicule().getConstructeur().isEstNomine()) {
                int nouveauPoint;
                Constructeur constructeur = this.getNoClassementEdition(i).getInscription().getVehicule().getConstructeur();
                if (resultat.containsKey(constructeur)) {
                    nouveauPoint = resultat.get(constructeur) + corespPoint(cmp);
                } else {
                    nouveauPoint = corespPoint(cmp);
                }
                resultat.put(constructeur, nouveauPoint);
                cmp++;
                i++;
            } else {
                //si coureur pas dans l'équipe
                i++;
            }
        }
        return resultat;
    }

    public ArrayList<Entry<Constructeur, Integer>> arrayEditionPointConstructeur() {
        return new ArrayList<Map.Entry<Constructeur, Integer>>(resulatatEditionConstructeur().entrySet());
    }

    //méthode à transformer le hashmap au arrayliste
    public ArrayList<Entry<Constructeur, Integer>> classementEditionCons() {
        ArrayList<Entry<Constructeur, Integer>> lstRes = this.arrayEditionPointConstructeur();
        for (int i = 0; i < lstRes.size() - 1; i++) {
            for (int j = i + 1; j < lstRes.size(); j++) {
                if (lstRes.get(i).getValue() < lstRes.get(j).getValue()) {
                    Entry<Constructeur, Integer> entry = lstRes.get(i);
                    lstRes.set(i, lstRes.get(j));
                    lstRes.set(j, entry);
                }
            }
        }
        return lstRes;
    }

    //méthode pour afficher le classement en String à l'interface
    public String afficheClassementConstruct() {
        String s = "No \t Constructeur \t Points";
        int i = 1;
        for (Entry<Constructeur, Integer> e : this.classementEditionCons()) {
            s += "\n " + i + " \t" + e.getKey().getNomConstructeur() + " \t" + e.getValue();
            i++;
        }
        return s;
    }

    //coureur s'inscrire à une édition avec le point
    public void inscrireEdition(Coureur c, Vehicule v) {
        int num;

        //générer un n*) inscripr par Random
        if (!this.lstInscrip.isEmpty()) {
            num = new Random().nextInt(2000) + 1;
        } else {
            ArrayList<Integer> arrayNumIns = new ArrayList<Integer>();
            for (Inscription i : this.lstInscrip) {
                arrayNumIns.add(i.getNumIdInscrip());
            }

            do {
                num = new Random().nextInt(2000) + 1;
            } while (arrayNumIns.contains(num));
        }

        Inscription ins = new Inscription(c, v, this, num);
        this.lstInscrip.add(ins);
    }

    //comence d'une édition pour tous les coureur change les état
    public void commencerEdition() {
        for (Inscription i : lstInscrip) {
            if (i.getEtatInscripEnum() == EtatInscription.valide) {
                i.modifEtatInscrip(EtatInscription.depart);
            }
        }
    }

    //méthode trouve si un coureur inscrit à cette édition
    public Inscription trouveInscription(Coureur c) {
        for (Inscription i : this.lstInscrip) {
            if (i.getCoureur().equals(c)) {
                return i;
            }
        }
        return null;
    }

    //méthode d'ajouter une étape à une édition
    public void ajouterEtpae(Etape e) {
        this.lstEtapes.add(e);
    }
}

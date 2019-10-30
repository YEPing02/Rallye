package gestionClassement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import gestionInscription.Constructeur;
import gestionInscription.Coureur;
import gestionInscription.EquipeConstructeur;
import gestionPlannification.Edition;

public class ClassementAnnuel {

    //les hashMap qui sert au classement
    private HashMap<Coureur, Integer> resultatAnnuelCoureur = new HashMap<Coureur, Integer>();
    private HashMap<Constructeur, Integer> resultatAnnuelConstructeur = new HashMap<Constructeur, Integer>();
    private HashMap<EquipeConstructeur, Integer> resultatAnnuelEquipe = new HashMap<EquipeConstructeur, Integer>();

    private ArrayList<Edition> rallyesAnnes = new ArrayList<Edition>();
    private int annee;

    public ClassementAnnuel(int annee) {
        this.annee = annee;
    }

    public int getAnnee() {
        return this.annee;
    }

    //méthode pour ajouter un rallye au liste
    public void setRallyesAnnes(Edition e) {
//		try {
//			Class.forName("gestionPlannification.Edition");
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}       
        this.rallyesAnnes.add(e);

    }

    //méthode générer les résultat annuel du coureur selon les point
    private void setResultatAnnuelCoureur() {
        HashMap<Coureur, Integer> resultat = new HashMap<Coureur, Integer>();
        for (Edition e : this.rallyesAnnes) {
            ArrayList<Entry<Coureur, Integer>> array = e.arrayEditionPointCoureur();
            for (Entry<Coureur, Integer> entry : array) {
                int nouveauPoint;
                if (resultat.containsKey(entry.getKey())) {
                    nouveauPoint = resultat.get(entry.getKey()) + entry.getValue();
                } else {
                    nouveauPoint = entry.getValue();
                }
                resultat.put(entry.getKey(), nouveauPoint);
            }
        }
        this.resultatAnnuelCoureur = resultat;
    }

    //méthode générer le classement annuel du coureur selon les point
    public ArrayList<Entry<Coureur, Integer>> classementAnnuelCoureur() {
        this.setResultatAnnuelCoureur();
        ArrayList<Entry<Coureur, Integer>> lstRes = new ArrayList<Entry<Coureur, Integer>>(this.resultatAnnuelCoureur.entrySet());
        for (int i = 0; i < lstRes.size() - 1; i++) {
            for (int j = i + 1; j < lstRes.size(); j++) {
                if (lstRes.get(i).getValue() < lstRes.get(j).getValue()) {
                    Entry<Coureur, Integer> entry = lstRes.get(i);
                    lstRes.set(i, lstRes.get(j));
                    lstRes.set(j, entry);
                }
            }
        }
        return lstRes;
    }

    //méthode pour afficher le classement en String au console
    public String afficheClassementAnnuelCoureur() {
        String s = "No \t Prénom \t Nom \t Points";
        int i = 1;
        for (Entry<Coureur, Integer> e : this.classementAnnuelCoureur()) {
            s += "\n " + i + " \t" + e.getKey().getPrenomC() + " \t" + e.getKey().getNomC() + " \t" + e.getValue();
            i++;
        }
        return s;
    }

    //méthode générer les résultat annuel du constrcuteur selon les point
    private void setResultatAnnuelConstructeur() {
        HashMap<Constructeur, Integer> resultat = new HashMap<Constructeur, Integer>();
        for (Edition e : this.rallyesAnnes) {
            ArrayList<Entry<Constructeur, Integer>> array = e.arrayEditionPointConstructeur();
            for (Entry<Constructeur, Integer> entry : array) {
                int nouveauPoint;
                if (resultat.containsKey(entry.getKey())) {
                    nouveauPoint = resultat.get(entry.getKey()) + entry.getValue();
                } else {
                    nouveauPoint = entry.getValue();
                }
                resultat.put(entry.getKey(), nouveauPoint);
            }
        }
        this.resultatAnnuelConstructeur = resultat;
    }

    //méthode générer le classement annuel du constructeur
    public ArrayList<Entry<Constructeur, Integer>> classementAnnuelConstructeur() {
        this.setResultatAnnuelConstructeur();
        ArrayList<Entry<Constructeur, Integer>> lstRes = new ArrayList<Entry<Constructeur, Integer>>(this.resultatAnnuelConstructeur.entrySet());
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

    //méthode pour afficher le classement en String au console
    public String afficheClassementAnnuelConstruct() {
        String s = "No \t Constructeur \t Points";
        int i = 1;
        for (Entry<Constructeur, Integer> e : this.classementAnnuelConstructeur()) {
            s += "\n " + i + " \t" + e.getKey().getNomConstructeur() + " \t" + e.getValue();
            i++;
        }
        return s;
    }

    //méthode générer les résultat annuel du équipe selon les point
    private void setResultatAnnuelEquipe() {
        HashMap<EquipeConstructeur, Integer> resultat = new HashMap<EquipeConstructeur, Integer>();
        for (Edition e : this.rallyesAnnes) {
            ArrayList<Entry<EquipeConstructeur, Integer>> array = e.arrayEditionPointEquipe();
            for (Entry<EquipeConstructeur, Integer> entry : array) {
                int nouveauPoint;
                if (resultat.containsKey(entry.getKey())) {
                    nouveauPoint = resultat.get(entry.getKey()) + entry.getValue();
                } else {
                    nouveauPoint = entry.getValue();
                }
                resultat.put(entry.getKey(), nouveauPoint);
            }
        }
        this.resultatAnnuelEquipe = resultat;
    }

    //méthode générer le classement annuel de l'équipe
    public ArrayList<Entry<EquipeConstructeur, Integer>> classementAnnuelEquipe() {
        this.setResultatAnnuelEquipe();
        ArrayList<Entry<EquipeConstructeur, Integer>> lstRes = new ArrayList<Entry<EquipeConstructeur, Integer>>(this.resultatAnnuelEquipe.entrySet());
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

    //méthode pour afficher le classement en String dans console
    public String afficheClassementEditionEquipe() {
        String s = "No \t Equipe \t Points";
        int i = 1;
        for (Entry<EquipeConstructeur, Integer> e : this.classementAnnuelEquipe()) {
            s += "\n " + i + " \t" + e.getKey().getNomEquipe() + " \t" + e.getValue();
            i++;
        }
        return s;
    }

}

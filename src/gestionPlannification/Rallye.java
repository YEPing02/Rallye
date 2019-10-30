package gestionPlannification;

import gestionDonnees.*;
import java.util.ArrayList;

public class Rallye {

    private String nomR;
    private boolean typeR;
    private String typeSurfaceR;
    private Ville villeR;
    private ArrayList<Edition> lstEditions;
    private String etatR = "En-cours";

    //Constructeur
    public Rallye(String nomR, boolean typeR, String typeSuperfaceR, Ville villeR) {
        this.nomR = nomR;
        this.typeR = typeR;
        this.typeSurfaceR = typeSuperfaceR;
        this.villeR = villeR;
        this.lstEditions = new ArrayList<Edition>();
    }

    //Getter
    public String getNomR() {
        return nomR;
    }

    public boolean isTypeR() {
        return typeR;
    }

    public String getTypeSuperfaceR() {
        return typeSurfaceR;
    }

    public Ville getVilleR() {
        return this.villeR;
    }

    public ArrayList<Edition> getlstEditions() {
        return this.lstEditions;
    }

    public String getEtatR() {
        return this.etatR;
    }

    public Edition getEdition(int i) {
        return this.lstEditions.get(i);
    }

    //Setter
    public void setNomR(String nomR) {
        this.nomR = nomR;
    }

    public void setTypeR(boolean typeR) {
        this.typeR = typeR;
    }

    public void setTypeSurfaceR(String typeSurfaceR) {
        this.typeSurfaceR = typeSurfaceR;
    }

    public void setVilleR(Ville villeR) {
        this.villeR = villeR;
    }

    public void setLstEditions(ArrayList<Edition> lstEdition) {
        this.lstEditions = lstEdition;
    }

    public void setEtat(String etatR) {
        this.etatR = etatR;
    }

    //Méthodes
    public String afficherInfoR() {
        //System.out.println("Nom : " + this.nomR);
        String s = new String();
        for (Edition ed : this.lstEditions) {
            s += ed.getNumEdition() + ed.getAnneeR() + "\n";
        }
        //ou dire le nombre d'édition ayant eu lieu
        return s;
    }

    public void ajouterEditionR(Edition ed) {
        lstEditions.add(ed);
    }

    //Modification
    private void modifRallye(String nomR, boolean typeR, String typeSurfaceR, Ville villeR) {
        this.setNomR(nomR);
        this.setTypeR(typeR);
        this.setTypeSurfaceR(typeSurfaceR);
        this.setVilleR(villeR);
        this.setLstEditions(lstEditions);
    }

    public void modifNomRallye(String nomR) {
        this.setNomR(nomR);
    }

    public void modifTypeRallye(boolean typeR) {
        this.setTypeR(typeR);
    }

    public void modifTypeSurfaceRallye(String typeSurfaceR) {
        this.setTypeSurfaceR(typeSurfaceR);
    }

    public void modifVilleRallye(Ville villeR) {
        this.setVilleR(villeR);
    }
    //Archivage
    /*
	public void archiRallye() {
		this.etatR = "Archivé";
	}
     */

}

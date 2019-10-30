package gestionPlannification;

import java.util.ArrayList;

public class Archivage {

    private ArrayList<Rallye> lstRallyeArchive;
    private ArrayList<Edition> lstEditionArchive;
    private ArrayList<Etape> lstEtapeArchive;
    private ArrayList<Speciale> lstSpecialeArchive;
    //Constructeur

    public Archivage() {
        this.lstRallyeArchive = new ArrayList<Rallye>();
        this.lstEditionArchive = new ArrayList<Edition>();
        this.lstEtapeArchive = new ArrayList<Etape>();
        this.lstSpecialeArchive = new ArrayList<Speciale>();
    }

    public void archiverRallye(Rallye r) {
        lstRallyeArchive.add(r);
        r.setEtat("Archivé");
    }

    public void retablirRallye(Rallye r) {
        lstRallyeArchive.remove(lstRallyeArchive.indexOf(r));
        r.setEtat("En-cours");
    }

    public void archiverEdition(Edition ed) {
        lstEditionArchive.add(ed);
    }

    public void archiverEtape(Etape et) {
        lstEtapeArchive.add(et);
    }

    public void archiverSpeciale(Speciale s) {
        lstSpecialeArchive.add(s);
    }
}

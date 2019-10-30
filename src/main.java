
import Interfaces.InterfaceEnregistreTemps;
import Interfaces.InterfaceClassement;
import Interfaces.Menu;
import java.util.Date;

import gestionClassement.*;
import gestionInscription.*;
import gestionPlannification.*;
import java.util.ArrayList;
import model.Donnee;

public class main {

    public static void main(String[] args) {
        ClassementAnnuel a2019 = new ClassementAnnuel(2019);
        ClassementAnnuel a2018 = new ClassementAnnuel(2018);
        ClassementAnnuel a2017 = new ClassementAnnuel(2017);

        Ville paris = new Ville("Paris", "France");
        Ville geneve = new Ville("Genève", "Suisse");

        Rallye r1 = new Rallye("Rallye Paris", false, "asphalte", paris);
        Rallye r2 = new Rallye("Rallye Geneve", false, "terre", geneve);

        Edition e1 = new Edition(1, a2017, "02/08/2017", "09/09/2017", "15/07/2017");
        Edition e2 = new Edition(2, a2018, "02/02/2018", "09/09/2018", "15/07/2018");
        Edition e3 = new Edition(3, a2019, "02/02/2019", "09/09/2019", "15/07/2019");

        Etape et11 = new Etape(3.9f, 1, "02/02/2019", "03/02/2019", NiveauDiffi.SANS_DIFF);
        Etape et12 = new Etape(3.4f, 2, "02/02/2019", "03/02/2019", NiveauDiffi.DIFF_MIN);
        Etape et21 = new Etape(4.9f, 3, "02/02/2019", "03/02/2019", NiveauDiffi.DIFF_MIN);
        Etape et22 = new Etape(3.9f, 4, "02/02/2019", "03/02/2019", NiveauDiffi.SANS_DIFF);

        r1.ajouterEditionR(e1);
        r2.ajouterEditionR(e2);
        r2.ajouterEditionR(e3);

        Speciale s11 = new Speciale(1, 23, false, 111);
        Speciale s12 = new Speciale(2, 23, false, 222);
        Speciale s21 = new Speciale(3, 23, false, 111);
        Speciale s22 = new Speciale(4, 23, false, 222);
        Speciale s31 = new Speciale(5, 23, false, 111);
        Speciale s32 = new Speciale(6, 23, false, 222);
        Speciale s41 = new Speciale(7, 23, false, 111);
        Speciale s42 = new Speciale(8, 23, false, 222);
        Penalite p1 = new Penalite("Sotie de la route", " Code de la route");
        Penalite p2 = new Penalite("Retard au départ", "Règle du rallye");
        e2.ajouterEtpae(et11);
        e2.ajouterEtpae(et12);
        e3.ajouterEtpae(et21);
        e3.ajouterEtpae(et22);

        et11.ajouterSpeciale(s11);
        et11.ajouterSpeciale(s12);
        et12.ajouterSpeciale(s21);
        et12.ajouterSpeciale(s22);
        et21.ajouterSpeciale(s31);
        et21.ajouterSpeciale(s32);
        et22.ajouterSpeciale(s41);
        et22.ajouterSpeciale(s42);

//		et12.ajouterSpeciale(s41);
//		et12.ajouterSpeciale(s42);
        Coureur c1 = new Coureur("Martin", "Jean", new Date(), "AB", "+");
        Coureur c2 = new Coureur("Bernard", "Marie", new Date(), "A", "+");
        Coureur c3 = new Coureur("Thomas", "Pierre", new Date(), "Rh", "-");

        Constructeur con1 = new Constructeur("Toyota", true);
        Constructeur con2 = new Constructeur("BMW", true);
        Constructeur con3 = new Constructeur("Citroen", false);

        try {
            Moto v1 = new Moto(2222, con1, 500);
            Voiture v2 = new Voiture(222, con2, 300);
            Camion v3 = new Camion(333, con3, 2000);
            Moto v4 = new Moto(2222, con3, 468);
            Voiture v5 = new Voiture(222, con1, 325);
            Camion v6 = new Camion(333, con2, 1600);

            EquipeConstructeur eq = new EquipeConstructeur("GP Amérique");
            c2.ajouterEquipe(eq);

            e2.inscrireEdition(c1, v1);
            e2.inscrireEdition(c2, v2);
            e2.inscrireEdition(c3, v3);

            e3.inscrireEdition(c1, v5);
            e3.inscrireEdition(c2, v6);
            e3.inscrireEdition(c3, v4);

            Inscription i1 = e2.trouveInscription(c1);
            Inscription i2 = e2.trouveInscription(c2);
            Inscription i3 = e2.trouveInscription(c3);

            Inscription i4 = e3.trouveInscription(c1);
            Inscription i5 = e3.trouveInscription(c2);
            Inscription i6 = e3.trouveInscription(c3);

            s11.enregistrerTemps(i1, 20);
            s11.enregistrerTemps(i2, 368);
            s11.enregistrerTemps(i3, 219);
            s12.enregistrerTemps(i1, 2138);
            s12.enregistrerTemps(i2, 1231);
            s12.enregistrerTemps(i3, 1239);
            s21.enregistrerTemps(i1, 993);
            s21.enregistrerTemps(i2, 2301);
            s21.enregistrerTemps(i3, 2130);
            s22.enregistrerTemps(i1, 2314);
            s22.enregistrerTemps(i2, 3901);
            s22.enregistrerTemps(i3, 2134);

            s31.enregistrerTemps(i4, 2310);
            s31.enregistrerTemps(i5, 1239);
            s31.enregistrerTemps(i6, 993);
            s32.enregistrerTemps(i4, 2301);
            s32.enregistrerTemps(i5, 2130);
            s32.enregistrerTemps(i6, 1241);
            s41.enregistrerTemps(i4, 519);
            s41.enregistrerTemps(i5, 2138);
            s41.enregistrerTemps(i6, 1231);
            s42.enregistrerTemps(i4, 1239);
            s42.enregistrerTemps(i5, 993);
            s42.enregistrerTemps(i6, 2301);

            s11.getlstResultatSpeciale().get(0).setPenalite(p1);
            s11.getlstResultatSpeciale().get(0).setPenalite(p2);
            s11.getlstResultatSpeciale().get(1).setPenalite(p2);

            ClassementAnnuel clA1 = new ClassementAnnuel(2017);
            ClassementAnnuel clA2 = new ClassementAnnuel(2018);
            ClassementAnnuel clA3 = new ClassementAnnuel(2019);
            clA1.setRallyesAnnes(e1);
            clA2.setRallyesAnnes(e2);
            clA3.setRallyesAnnes(e3);

            ArrayList<Rallye> r = new ArrayList<Rallye>();
            r.add(r1);
            r.add(r2);
            ArrayList<ClassementAnnuel> annee = new ArrayList<ClassementAnnuel>();
            annee.add(clA1);
            annee.add(clA2);
            annee.add(clA3);
            ArrayList<Edition> e = new ArrayList<Edition>();
            e.add(e1);
            e.add(e2);
            e.add(e3);
            ArrayList<Coureur> c = new ArrayList<Coureur>();
            c.add(c1);
            c.add(c2);
            c.add(c3);
            Donnee d = new Donnee();
            d.setLstClassementAnnuel(annee);
            d.setLstEdition(e);
            d.setLstRallye(r);
            d.setLstCoureur(c);

            Menu m = new Menu(d);
            m.setVisible(true);

            InterfaceEnregistreTemps erg = new InterfaceEnregistreTemps(d);
            erg.setVisible(false);

            InterfaceClassement gc = new InterfaceClassement(d);
            gc.setVisible(false);

        } catch (Exception e) {
            System.err.print(e.getMessage());
        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import gestionClassement.*;
import gestionPlannification.*;
import java.util.ArrayList;
import gestionInscription.*;
import java.util.Vector;

/**
 *
 * @author yepin
 */
public class Donnee {

    private ArrayList<Rallye> lstRallye;
    private ArrayList<Edition> lstEdition;
    private ArrayList<Etape> lstEtape;
    private ArrayList<ClassementAnnuel> lstClassementAnnuel;
    private ArrayList<Coureur> lstCoureur;

    public Donnee() {
        lstRallye = new ArrayList<Rallye>();
        lstEdition = new ArrayList<Edition>();
        lstEtape = new ArrayList<Etape>();
        lstCoureur = new ArrayList<Coureur>();
        lstClassementAnnuel = new ArrayList<ClassementAnnuel>();
    }

    public Vector toVector(ArrayList a) {
        Vector v = new Vector(a);
        return v;
    }

    // setters
    public void setLstRallye(ArrayList<Rallye> lstRallye) {
        this.lstRallye = lstRallye;
    }

    public void setLstEdition(ArrayList<Edition> lstEdition) {
        this.lstEdition = lstEdition;
    }

    public void setLstEtape(ArrayList<Etape> lstEtape) {
        this.lstEtape = lstEtape;
    }

    public void setLstClassementAnnuel(ArrayList<ClassementAnnuel> lstClassementAnnuel) {
        this.lstClassementAnnuel = lstClassementAnnuel;
    }

    public void setLstCoureur(ArrayList<Coureur> lstCoureur) {
        this.lstCoureur = lstCoureur;
    }

    // getters
    public ArrayList<ClassementAnnuel> getLstClassementAnnuel() {
        return lstClassementAnnuel;
    }

    public ArrayList<Edition> getLstEdition() {
        return lstEdition;
    }

    public ArrayList<Etape> getLstEtape() {
        return lstEtape;
    }

    public ArrayList<Rallye> getLstRallye() {
        return lstRallye;
    }

    // 
    public Rallye getRallye(int i) {
        return this.lstRallye.get(i);
    }

    public Edition getEdition(int i) {
        return this.lstEdition.get(i);
    }

    public Etape getEtape(int i) {
        return this.lstEtape.get(i);
    }

    public ClassementAnnuel getClassementAnnuel(int i) {
        return this.lstClassementAnnuel.get(i);
    }

    public ArrayList<Coureur> getLstCoureur() {
        return lstCoureur;
    }

    public Coureur getCoureur(int i) {
        return this.lstCoureur.get(i);
    }

    public void ajoutRallye(Rallye r) {
        this.lstRallye.add(r);
    }

    public void ajoutEdition(Edition edi) {
        this.lstEdition.add(edi);
    }
}

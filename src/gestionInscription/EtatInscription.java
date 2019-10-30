package gestionInscription;

public enum EtatInscription {
    encours,
    valide,
    supprime,
    depart,
    arret,
    disqualife;

    //boolean 
    public boolean estArret() {
        return this.equals(arret) || this.equals(disqualife);
    }

}

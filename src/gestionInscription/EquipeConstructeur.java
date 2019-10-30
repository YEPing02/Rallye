package gestionInscription;

import java.util.ArrayList;

public class EquipeConstructeur {

    private String nomEquipe;

    public EquipeConstructeur(String nomEquipe) {
        this.nomEquipe = nomEquipe;
    }

    public String getNomEquipe() {
        return this.nomEquipe;
    }

    @Override
    public int hashCode() {
        return this.nomEquipe.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof EquipeConstructeur) {
            EquipeConstructeur e = (EquipeConstructeur) o;
            return e.nomEquipe.equals(this.nomEquipe);
        }
        return false;
    }
}

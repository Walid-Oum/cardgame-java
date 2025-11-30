package be.ehb.DeckOfCards;

import java.util.Objects;

public class Kaart {
    private Kleur kleur;
    private Waarde waarde;

    public Kaart(Kleur kleur, Waarde waarde) {
        this.kleur = kleur;
        this.waarde = waarde;
    }

    public Kleur getKleur() {
        return kleur;
    }

    public void setKleur(Kleur kleur) {
        this.kleur = kleur;
    }

    public Waarde getWaarde() {
        return waarde;
    }

    public void setWaarde(Waarde waarde) {
        this.waarde = waarde;
    }

    @Override
    public String toString() {
        return waarde + "" + kleur;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Kaart kaart = (Kaart) o;
        return kleur == kaart.kleur && waarde == kaart.waarde;
    }


}

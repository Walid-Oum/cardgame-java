package be.ehb.DeckOfCards;

public enum Kleur {
    HARTEN("\u2665"),
    RUITEN("\u2666"),
    SCHOPPEN("\u2660"),
    KLAVEREN("\u2663");

    private final String kleur;

    Kleur(String kleur) {
        this.kleur = kleur;
    }


    @Override
    public String toString() {
        return kleur;

    }
}



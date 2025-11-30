package be.ehb.DeckOfCards;

public enum Waarde {
    AAS("A"),
    TWEE("2"),
    DRIE("3"),
    VIER("4"),
    VIJF("5"),
    ZES("6"),
    ZEVEN("7"),
    ACHT("8"),
    NEGEN("9"),
    TIEN("10"),
    BOER("J"),
    DAME("Q"),
    HEER("K");


    private final String waarde;


    Waarde(String waarde) {
        this.waarde = waarde;
    }


    @Override
    public String toString() {
        return waarde;
    }
}

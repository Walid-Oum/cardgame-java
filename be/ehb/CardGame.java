package be.ehb;

import be.ehb.DeckOfCards.Kaart;
import be.ehb.DeckOfCards.Kleur;
import be.ehb.DeckOfCards.Waarde;
import java.util.Random;
import java.util.Scanner;

public class CardGame {

    //eerst een random kaart pakken

    public static void main(String[] args) {
        start();
    }


    public static void start() {


        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        int kleurIndex = random.nextInt(Kleur.values().length);
        int waardeIndex = random.nextInt(Waarde.values().length);

        Kleur randomKleur = Kleur.values()[kleurIndex];
        Waarde randomWaarde = Waarde.values()[waardeIndex];
        Kaart huidigeKaart = new Kaart(randomKleur, randomWaarde);



        boolean spelen = true;
        while (spelen) {

            char guess;
            do {
                System.out.println("Huidige kaart: " + huidigeKaart);


                System.out.println("Denk je dat de volgende kaart hoger of lager zal zijn? (Hoger = h | Lager = l) ");
                guess = scanner.nextLine().charAt(0);
                if (guess != 'l' && guess != 'h') {
                    System.out.println("foutieve invoer, kies l of h");
                }
            } while (guess != 'l' && guess != 'h');


            //nieuwe kaart => moet verschillend zijn van ons huidige kaart
            Kaart nieuweKaart;
            do {
                int nieuweKleurIndex = random.nextInt(Kleur.values().length);
                int nieuweWaardeIndex = random.nextInt(Waarde.values().length);

                Kleur nieuweRandomKleur = Kleur.values()[nieuweKleurIndex];
                Waarde nieuweRandomWaarde = Waarde.values()[nieuweWaardeIndex];
                nieuweKaart = new Kaart(nieuweRandomKleur, nieuweRandomWaarde);
            } while (nieuweKaart.getWaarde().ordinal() == huidigeKaart.getWaarde().ordinal());


            char antwoord = (nieuweKaart.getWaarde().ordinal() > huidigeKaart.getWaarde().ordinal()) ? 'h' : 'l';
            boolean isCorrect = (guess == antwoord);
            if (isCorrect) {
                System.out.println("Correct! De nieuwe kaart was: " + nieuweKaart);
                System.out.println("Wil je verder spelen? (j/n)");


                char verderspelen;
                do {
                    verderspelen = scanner.nextLine().charAt(0);
                    if (verderspelen == 'j') {
                        huidigeKaart = nieuweKaart;
                    } else if (verderspelen == 'n') {
                        System.out.println("Tot de volgende keer! ^^");
                        spelen = false;
                    }
                    else{
                        System.out.println("Kies 'j' om verder te spelen of 'n' om te stoppen");
                    }
                }while(verderspelen != 'j' && verderspelen != 'n');

            } else {
                System.out.println("Incorrect! De nieuwe kaart was: " + nieuweKaart);
                spelen = false;
            }



        }
        scanner.close();

    }
}

package anki;

import java.util.ArrayList;

public class Decks {

    private ArrayList<Cards> deck;
    private String deckName;
    private int count = 0;

    public Decks() {
        deck = new ArrayList<Cards>();
    }

    public Decks(String name) {
        this.deck = new ArrayList<Cards>();
        this.deckName = name;
    }
    /**
    * Metodi asettaa pakan nimeksi annetun nimen
    *
    * @return Tyhjä
    */
    
    public void setDeckName(String name) {
        this.deckName = name;
    }

    /**
    * Metodi palauttaa pakan nimen
    *
    * @return String
    */
    
    public String getDeckName() {
        return this.deckName;
    }
    
    /**
    * Metodi lisää kortin pakkaan
    *
    * @return String
    */

    public void add(Cards card) {
        deck.add(card);
        ++count;
    }
}
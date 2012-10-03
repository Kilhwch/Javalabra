package anki;

import java.util.ArrayList;


/**
* Hoitaa korttipakkojen toiminnallisuudet.
*/

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
    * Asettaa pakan nimeksi annetun nimen.
    */
    
    public void setDeckName(String name) {
        this.deckName = name;
    }
    

    /**
    * Palauttaa pakan nimen.
    *
    * @return String
    */
    
    public String getDeckName() {
        return this.deckName;
    }
    
    /**
    * Palauttaa korttien lukumäärän.
    * 
    * @return Integer
    */
    public int getCount() {
        return this.count;
    }
    
    /**
    * Lisää kortin pakkaan.
    */

    public void add(Cards card) {
        deck.add(card);
        ++count;
    }
}
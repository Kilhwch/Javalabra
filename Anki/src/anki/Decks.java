package anki;


import java.util.ArrayList;
import java.util.HashMap;

public class Decks {

    private HashMap<String, ArrayList<Cards>> deckList = new HashMap<String, ArrayList<Cards>>();
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

    /***********SETTERS & GETTERS***********/
    
    public void setDeckName(String deckName) {
        this.deckName = deckName;
    }

    public String getDeckName() {
        return this.deckName;
    }

    public String getNextWord(int index) {
        return this.deck.get(index).getWord();

    }

    public String getNextTranslation(int index) {
        return this.deck.get(index).getTranslation();
    }
    
    public int getCount() {
        return this.count;
    }
    
    /*************DECK HANDLING*************/

    public void addDecktoDeckList() {
        deckList.put(deckName, this.deck);
    }

    public void add(Cards card) {
        deck.add(card);
        ++count;
    }

    public void delete(Cards card) {
        deck.remove(card);
        --count;
    }

    /*****************OTHER*****************/

    public boolean allWordsReviewed(int index) { // test
        if (index == this.count) {
            return true;
        } else {
            return false;
        }
    }
}

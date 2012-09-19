package anki;

import java.util.ArrayList;
import java.util.HashMap;

public class Decks {

    private HashMap<String, ArrayList<Cards>> deckList = new HashMap<String, ArrayList<Cards>>();
    private ArrayList<Cards> deck;
    private String deckName;
    private int count = 0;
    //    private HashMap<String, String> list; // väliaikanen lista korteille

    public Decks() {
        deck = new ArrayList<Cards>();

    }

    public Decks(String name) {
        deck = new ArrayList<Cards>();
        this.deckName = name;
    }

    public void setDeckName(String deckName) {
        this.deckName = deckName;

    }

    public String getDeckName() {
        return this.deckName;
    }

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

    public int getCount() {
        return this.count;
    }

    public String getNextWord(int index) {
        return deck.get(index).getWord();

    }

    public String getNextTranslation(int index) {
        return deck.get(index).getTranslation();
    }

    public boolean allWordsReviewed(int index) { // test
        if (index == this.count) {
            return true;
        } else {
            return false;
        }
    }

    /*********************************************************/
    public boolean deckExists(String name) {
        for (int i = 0; i < deckList.size(); i++) {
            if (deckList.containsKey(name)) {
                openADeckByName(name);
                return true;
            }
        }
        return false;
    }

    public ArrayList<Cards> openADeckByName(String name) {
        return deckList.get(name); // PALAUTTAAKO OIKEAN LISTAN???                           
    }
}

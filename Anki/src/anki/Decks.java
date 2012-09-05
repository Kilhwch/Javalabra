
package anki;
import java.util.ArrayList;
import java.util.HashMap;

/*****************************************/
/*Author: Kasper*************************/
/*Anki/Decks****************************/
/*Date: 18/08/2012*********************/
/*************************************/
public class Decks {

    private HashMap<String, String> list;
    private ArrayList<Cards> deck;
    private int count;

    public Decks() {
        deck = new ArrayList<Cards>();

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
    

    public HashMap<String, String> returnAllWords() {
        list = new HashMap<String, String>();
        
        for (int i = 0; i < deck.size(); i++) {
            String temporaryWord = deck.get(i).getWord();
            String temporaryTranslation = deck.get(i).getTranslation();
            
            list.put(temporaryWord, temporaryTranslation);
        }
        return list;
    }
    
//    @Override
//    public String toString() {
//        return ""+deck.toString();
//    }
}



package anki;
public class Main {

    public static void main(String[] args) {
        Decks deck = new Decks("Pakka");
        Cards card = new Cards("Moi", "Hello");
        
        deck.add(card);
        deck.addDecktoDeckList();
        
        System.out.println(deck.getDeckName());
        System.out.println(deck.deckExists("Pakka")); // true
        
        System.out.println(deck.openADeckByName("Pakka").get(0).getWord());
        System.out.println(deck.openADeckByName("Pakka").get(0).getTranslation());
        
        
        
        System.out.println(deck.hashCode());
    }
}


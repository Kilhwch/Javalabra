/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kasper
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cards card1 = new Cards("kakka", "shit");
        Cards card2 = new Cards("vittu", "fuck");
        Cards card3 = new Cards("homo", "gay");
        Cards card4 = new Cards("lesbo", "lesbo");


        Decks deck1 = new Decks();
        deck1.add(card1);
        deck1.add(card2);

        System.out.println(deck1.getCount());
        
        System.out.println(deck1.returnAllWords());

        // deck1:sessä pitäisi olla 2 oliokorttia (kakka ja vittu)

        Decks deck2 = new Decks();
        deck2.add(card3);
        deck2.add(card4);

        System.out.println(deck2.getCount());
        
        
        System.out.println(deck2.returnAllWords());
        
        

    }
}

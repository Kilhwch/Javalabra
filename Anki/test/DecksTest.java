/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import anki.Cards;
import anki.Decks;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kasper
 */
public class DecksTest {
    
    Decks deck;
    double vertailuTarkkuus = 0.0001;
    
    @Before
    public void setUp() {
    deck = new Decks();
    }
  
    
    
    @Test
    public void getDeckNamePalauttaaNimen() {
        deck.setDeckName("pakka");
        assertEquals("pakka", deck.getDeckName());
    }
    
    @Test
    public void addToimii() {
        Cards testcard = new Cards("Eka", "One");
        deck.add(testcard);
        assertEquals(1, deck.getCount(), vertailuTarkkuus);
    }
}

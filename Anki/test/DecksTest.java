/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import anki.Cards;
import anki.Decks;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
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
        deck = new Decks("pakka");
        deck.addDecktoDeckList();
        
    }
    
    
    
    @Test
    public void deckStartsEmpty() {
        assertEquals(0, deck.getCount(), vertailuTarkkuus);
    }
    
    @Test
    public void deckCountsProperly() {
        Cards testCard1 = new Cards("Moi", "Hey");
        deck.add(testCard1);
        
        assertEquals(1, deck.getCount(), vertailuTarkkuus);
    }
    
    @Test
    public void deckRemovesCardsCorrectly() {
        Cards testCard1 = new Cards("Moi", "Hey");
        deck.add(testCard1);
        deck.delete(testCard1);
        
        assertEquals(0, deck.getCount(), vertailuTarkkuus);
    }
    
    @Test
    public void booleanTest() {
        assertFalse(deck.allWordsReviewed(-1));

    }
    
    @Test
    public void deckNamesCorrect() {
        assertEquals("pakka", deck.getDeckName());
    }
    
    @Test
    public void deckIsInTheList() {
        Assert.assertTrue(deck.deckExists("pakka"));
    }

    @Test
    public void ReturnsGetNextWordCorrectly() {
        Cards testCard1 = new Cards("Moi", "Hello");
        Cards testCard2 = new Cards("Toka", "Second");
        deck.add(testCard1);
        deck.add(testCard2);
        assertEquals("Toka", deck.getNextWord(1));
    }
    
    

}

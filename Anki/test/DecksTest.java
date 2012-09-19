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
    public void pakkaOnTyhja() {
        assertEquals(0, deck.getCount(), vertailuTarkkuus);
    }
    
    @Test
    public void deckCountLaskeeOikein() {
        Cards testCard1 = new Cards("Moi", "Hey");
        deck.add(testCard1);
        
        assertEquals(1, deck.getCount(), vertailuTarkkuus);
    }
    
    @Test
    public void deletePoistaaPakan() {
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
    public void getDeckNamePalauttaaNimen() {
        assertEquals("pakka", deck.getDeckName());
    }
    
//    @Test
//    public void pakanLisaysListaan() {
//        Assert.assertTrue(deck.deckExists("pakka"));
//    }

    @Test
    public void ReturnsGetNextWordPalauttaaOikean() {
        Cards testCard1 = new Cards("Moi", "Hello");
        Cards testCard2 = new Cards("Toka", "Second");
        deck.add(testCard1);
        deck.add(testCard2);
        assertEquals("Toka", deck.getNextWord(1));
    }
}

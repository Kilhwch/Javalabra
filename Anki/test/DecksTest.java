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
    
    }
  
    
    
    @Test
    public void getDeckNamePalauttaaNimen() {
        assertEquals("pakka", deck.getDeckName());
    }


}

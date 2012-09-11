/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import anki.Cards;
import anki.Decks;
import anki.Stats;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kasper
 */
public class StatsTest {
    
    Stats stats;
    Decks decks;
    Cards testCard = new Cards("Moi", "Hello");
    double vertailuTarkkuus = 0.0001;
    
    @Before
    public void setUp() {
        stats = new Stats();
        decks = new Decks();
        
    }
    
    
    @Test
    public void countPercentWorks() {
        stats.countToCorrectAnswers();
        stats.countToIncorrectAnswers();
        stats.countToIncorrectAnswers();
        
        assertEquals(33.33, stats.countPercents(), vertailuTarkkuus);
    }
    
    
}

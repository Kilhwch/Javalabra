/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import anki.HandleFiles;
import java.io.FileNotFoundException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kkivikat
 */
public class HandleFilesTest {

    HandleFiles test;

    @Before
    public void setUp() {

        test = new HandleFiles();
    }

    @Test
    public void createFileLuoTiedoston () {
        test.createFile("testi");
        assertNotNull(test.getFile());
    }

    @Test
    public void createFileLuoHalutunNimisenTiedoston () {
        test.createFile("testi");
        assertEquals("testi", test.getFileName());

    }
    
    @Test
    public void writeFileKirjoittaaHalutunTekstin1() throws FileNotFoundException {
        test.createFile("testi");
        test.writeToFile("sana1:sana2:");
        assertEquals("testi=sana1:sana2:", test.readFile("testi"));
    }
    
    @Test 
    public void writeFileKirjoittaaHalutunTekstin2() throws FileNotFoundException {
        test.createFile("testix");
        test.writeToFile("sana1:sana2:");
        test.writeToFile("sana3:sana4:");
        assertEquals("testix=sana1:sana2:sana3:sana4:", test.readFile("testix"));
    }
}
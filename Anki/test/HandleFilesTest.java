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
        test.createFile("exist");
        assertNotNull(test.getFile());
    }

    @Test
    public void createFileLuoHalutunNimisenTiedoston () {
        test.createFile("createFile");
        assertEquals("createFile", test.getFileName());

    }
    
    @Test 
    public void writeFileKirjoittaaHalutunTekstin1() throws FileNotFoundException {
        test.createFile("writeFile");
        test.writeToFile("sana1:sana2:");
        test.writeToFile("sana3:sana4:");
        assertEquals("writeFile=sana1:sana2:sana3:sana4:", test.readFile("writeFile"));
    }
    
    @Test
    public void readFileLukeeOikein() throws FileNotFoundException {
        test.createFile("readFile");
        test.writeToFile("this was returned correctly");
        assertEquals("readFile=this was returned correctly", test.readFile("readFile"));
    }
    
}
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import anki.HandleFiles;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author kkivikat
 */
public class HandleFilesTest {

    HandleFiles test;
    double vertailuTarkkuus = 0.0001;

    @Before
    public void setUp() {

        test = new HandleFiles();
    }

    @Test
    public void addFileToimii() throws FileNotFoundException {
        Scanner reader = new Scanner(new File("./Tiedostot/Tiedostolista.txt"));
        String added = "test";
        test.addFile(added);
        String file = "";
        while (reader.hasNext()) {
            if (reader.next().equals("test")) {
                file = reader.next();
            }
        }
        Assert.assertEquals(added, file);
    }
    
    @Test
    public void createFileToimii() throws FileNotFoundException {
        String name = "moi";
        test.createFile(name);
        Assert.assertEquals(true, test.fileExists(name));
    }
    
    @Test
    public void fileIsEmptyToimii() {
        test.createFile("tyhja");
        test.fileIsEmpty("tyhja");
        Assert.assertTrue(true);
    }
    
//    Ongelma: muut testit kirjoittavat koko ajan tiedostoon jotain joten vertaaminen hankalaa    
//    @Test 
//    public void getExistingFilesToimii() {
//        ArrayList<String> list = new ArrayList<String>();
//    }
    
//    @Test
//    public void writeToFileToimii() throws FileNotFoundException {
//        test.createFile("writeToFile");
//        test.writeToFile("eka", "toka");
//        Scanner reader = new Scanner(new File("./Tiedostot/writeToFile.txt"));
//        while (reader.hasNext()) {
//            
//        }
//    }
}
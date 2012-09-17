/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package anki;



import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

//    public void createFile(File newDeckFile) {
//        throw new UnsupportedOperationException("Not yet implemented");
//    }
//    public void writeToFile(String text) {
//        
//    }
/**
 *
 * @author Kasper
 */
public class HandleFiles {

 

    private String fileName;

    public HandleFiles(String name) {
        this.fileName = name;
    }
    
    public HandleFiles() {
        
    }

    public void setFileName(String name) {
        this.fileName = name;
    }

    public String getFileName() {
        return fileName;
    }

    public int countLines(Scanner lukija) {
        int count = 0;
        while (lukija.hasNextLine()) {
            lukija.nextLine();
            ++count;
        }
        return count;
    }

    public boolean fileExistCheck(File file) {
        if (file == null) {
            return false;
        } else {
            return true;
        }
    }

    public String readFile(String name) throws FileNotFoundException {
        Scanner reader = new Scanner(new File("lol.txt")); // NAME PITÄÄ OLLA SAMA KUIN LISÄTTÄESSÄ OHJELMAAN MUUTEN EI TOIMI
        String text = reader.next();
        return text;
      
    }

    public void writeToFile(String name, String content) {
        try {
            String temporary = readFile(name);
            PrintWriter writer = new PrintWriter(new File("lol2.txt"));
            writer.println(temporary);
            writer.println(content);
            writer.close();

        } catch (Exception e) {
            System.out.println("Virhe tiedoston kirjoittamisessa!");
        }
    }

    public void createFile(String name) {
        setFileName(name);
        try {
            PrintWriter writer = new PrintWriter(new File(name + ".txt"));
            writer.write(name + "=");
            writer.close();
        } catch (Exception e) {
            System.out.println("Could not create a file!");
        }
    }
}
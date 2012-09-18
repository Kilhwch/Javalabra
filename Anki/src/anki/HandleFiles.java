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
    private File file;

    public HandleFiles(File fileName, String name) {
        this.file = fileName;
        this.fileName = name;

    }

    public HandleFiles() {
    }

    public void setFileName(String name) {
        this.fileName = name;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public File getFile() {
        return this.file;
    }

    public String getFileName() {
        return fileName;
    }

//    public boolean isFileEmpty(File file) {
//        if (file.getTotalSpace() == 0) {
//            return true;
//        } else {
//            return false;
//        }
//    }
    public void writeToFile(String content) {
        try {
            String temporary = readFile(this.fileName);
            PrintWriter writer = new PrintWriter(new File(this.fileName));
            writer.print(temporary);
            writer.print(content);
            writer.close();


        } catch (Exception e) {
            System.out.println("An error occurred when writing / copying the file");
        }
    }

    public String readFile(String name) throws FileNotFoundException {
        Scanner reader = new Scanner(new File(name));
        String text = reader.nextLine();
        return text;

    }
    
    /*********************************************************/

    public void createFile(String name) {
        setFileName(name);
        setFile(new File(name));
        try {
            PrintWriter writer = new PrintWriter(this.file);
            writer.write(name + "=");
            writer.close();
        } catch (Exception e) {
            System.out.println("Could not create a file!");
        }
    }
}
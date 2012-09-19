/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package anki;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Handler;

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
    
    private HashMap<String, File> fileList = new HashMap<String, File>();
    private ArrayList<String> fileArrayList;
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

    /**
     * ******************************************************
     */
    public void addFileToFileList() {
        this.fileList.put(fileName, file);
    }

    public void addOpenedFileToFileList(String name, File file) {
        this.fileList.put(name, file);
    }

    /**
     * ******************************************************
     */
    public File getFileFromFileList(String name) {
        return fileList.get(name);
    }

    public boolean fileExistsInFileList(String name) {
        if (fileList.containsKey(name)) {
            return true;
        } else {
            return false;
        }
    }

    public int getFileListSize() {
        return fileList.size();
    }
    
    public ArrayList<String> getFilesArray() {
        fileArrayList = new ArrayList<String>();
        for (String added : fileList.keySet()) {
            fileArrayList.add(added);
        }
        return fileArrayList;
    }
    
    

    public void deleteFileFromFileList(String name) {
        fileList.remove(name);
    }

    /**
     * ******************************************************
     */
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

    public void createFile(String name) {
        setFileName(name);
        setFile(new File(name));
        try {
            PrintWriter writer = new PrintWriter(this.file);
            writer.write(name + "=");
            writer.close();
            addFileToFileList();
        } catch (Exception e) {
            System.out.println("Could not create a file!");
        }
    }
}
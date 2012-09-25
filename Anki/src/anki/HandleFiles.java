package anki;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class HandleFiles {

    private HashMap<String, File> fileList = new HashMap<String, File>();
    private String fileName;
    private File file;

    public HandleFiles(File fileName, String name) {
        this.file = fileName;
        this.fileName = name;
    }

    public HandleFiles() {
    }

    /***********SETTERS & GETTERS***********/
    
    public void setFile(File file) {
        this.file = file;
    }

    public void setFileName(String name) {
        this.fileName = name;
    }

    public File getFile() {
        return this.file;
    }

    public String getFileName() {
        return fileName;
    }

    public File getFileFromFileList(String name) {
        return fileList.get(name);
    }

    /***************HASH/ARRAY**************/
    
    public void addFileToFileList() {
        this.fileList.put(fileName, file);
    }

    public void deleteFileFromFileList(String name) {
        this.fileList.remove(name);
    }

    public void addOpenedFileToFileList(String name, File file) {
        this.fileList.put(name, file);
    }

    /**************FILE HANDLING************/
    
    public ArrayList<String> getFilesFromTextFile() throws FileNotFoundException, IOException {
        ArrayList<String> list = new ArrayList<String>();
        Scanner reader = new Scanner(new File("./Tiedostot/Tiedostolista"));

        while (reader.hasNext()) {
            list.add(reader.next());
        }
        reader.close();
        return list;
    }

    private void setFileToTextFile(String newFileName) { // copy pastea
        try {
            ArrayList<String> temporary = getFilesFromTextFile();
            PrintWriter writer = new PrintWriter(new File("./Tiedostot/Tiedostolista"));

            for (int i = 0; i < temporary.size(); i++) {
                writer.println(temporary.get(i));
            }
            writer.print(newFileName);
            writer.close();
        } catch (Exception e) {
            System.out.println("setFiletoTextFile = ERROR");
        }
    }

    public void writeToFile(String content) {
        try {
            String temporary = readFile(this.fileName);
            PrintWriter writer = new PrintWriter(new File("./Tiedostot/" + this.fileName));
            writer.print(temporary);
            writer.print(content);
            writer.close();
        } catch (Exception e) {
            System.out.println("writeToFile = ERROR");
        }
    }

    public String readFile(String name) throws FileNotFoundException {
        Scanner reader = new Scanner(new File("./Tiedostot/" + name));
        String text = reader.nextLine();
        return text;
    }

    public void createFile(String name) {
        setFileName(name);
        setFile(new File("./Tiedostot/" + name));
        setFileToTextFile(name);
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
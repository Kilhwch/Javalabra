package anki;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class HandleFiles {

    private HashMap<String, File> fileList;
    private String fileName;
    private File file;

    public HandleFiles(File fileName, String name) {
        this.fileList = new HashMap<String, File>();
        this.file = fileName;
        this.fileName = name;
    }

    public HandleFiles() {
    }

    /**
     * Metodi asettaa tiedoston
     *
     * @return Tyhjä
     */
    public void setFile(File file) {
        this.file = file;
    }

    /**
     * Metodi asettaa tiedoston nimeksi annetun nimen
     *
     * @return Tyhjä
     */
    public void setFileName(String name) {
        this.fileName = name;
    }

    /**
     * Metodi lisää tiedoston listaan
     *
     * @return Tyhjä
     */
    public void addFileToFileList() {
        this.fileList.put(fileName, file);
    }

    /**
     * Metodi lisää hakemistosta tiedoston listaan
     *
     * @return Tyhjä
     */
    public void addOpenedFileToFileList(String name, File file) {
        this.fileList.put(name, file);
    }

    /**
     * Metodi lisää uuden tiedoston listaan
     *
     * @return Tyhjä
     */
    public String addFile(String name) {
        try {
            ArrayList<String> temporary = getExistingFiles();
            PrintWriter writer = new PrintWriter(new File("./Tiedostot/Tiedostolista.txt"));

            for (int i = 0; i < temporary.size(); i++) {
                writer.println(temporary.get(i));
            }
            writer.print(name);
            writer.close();
        } catch (Exception e) {
            System.out.println("setFiletoTextFile = ERROR");
        }
        return name;
    }

    /**
     * Metodi luo uuden tiedoston annetulla nimellä
     * 
     * @return Tyhjä
     */
    public Boolean createFile(String name) {
        if (fileExists(name) == false) {
        setFileName(name);
        setFile(new File("./Tiedostot/" + name+".txt"));
        addFile(name);
        try {
            PrintWriter writer = new PrintWriter(this.file);
            addFileToFileList();
            writer.close();
            
        } catch (Exception e) {
            System.out.println("Could not create a file!");
            return false;
        }
        }
        return true;
    }

    /**
     * Metodi poistaa tiedoston annetulla nimellä
     * 
     * @return Tyhjä
     */
    public void deleteFile(String name) {
        try {
            ArrayList<String> temporary = getExistingFiles();
            PrintWriter writer = new PrintWriter(new File("./Tiedostot/Tiedostolista.txt"));

            for (int i = 0; i < temporary.size(); i++) {
                if (!temporary.get(i).equals(name)) {
                    writer.println(temporary.get(i));
                }
            }
            writer.close();
            File textfile = new File("./Tiedostot/" + name+".txt");
            textfile.setWritable(true);
            textfile.delete();
        } catch (Exception e) {
            System.out.println("deleteFileFromTextFile = ERROR");
        }
    }

    /**
     * Metodi tarkastaa onko tiedoston sisältö tyhjä
     * 
     * @return Boolean
     */
    public boolean fileIsEmpty(String name) {
        Scanner reader = new Scanner("./Tiedostot/" + name+".txt");
        if (reader.nextLine().isEmpty()) {
            reader.close();
            return true;
        } else {
            reader.close();
            return false;
        }
    }
    
    public boolean fileExists(String name) {
        File test = new File("./Tiedostot/" + name+".txt");
        if (test.exists())
            return true;
        else
            return false;
    }
    

    /**
     * Metodi hakee kaikkien olemassa olevien tiedostojen nimet 
     * 
     * @return ArrayList<String>
     */
    public ArrayList<String> getExistingFiles() throws FileNotFoundException, IOException {
        ArrayList<String> list = new ArrayList<String>();
        Scanner reader = new Scanner(new File("./Tiedostot/Tiedostolista.txt"));

        while (reader.hasNext()) {
            list.add(reader.next());
        }
        reader.close();
        return list;
    }

    
    /**
     * Metodi lataa halutun tiedoston annetulla nimellä
     * 
     * @return ArrayList<String>
     */
    public ArrayList<String> loadFile(String name) throws FileNotFoundException {
        ArrayList<String> list = new ArrayList<String>();
        Scanner reader = new Scanner(new File("./Tiedostot/" + name+".txt"));

        while (reader.hasNext()) {
            list.add(reader.nextLine());
        }
        reader.close();
        return list;
    }

    /**
     * Metodi kirjoittaa sanan tiedostoon mikäli tiedosto on tyhjä.
     * Mikäli tiedosto ei ole tyhjä, kirjoitetaan uusi sana vanhan 
     * sisällönlisäksi.
     * 
     * @return Tyhjä
     */
    public void writeToFile(String word, String translation) throws FileNotFoundException {
        if (fileIsEmpty(this.fileName+".txt") == false) {
            ArrayList<String> temp = new ArrayList<String>();
            Scanner reader = new Scanner(new File("./Tiedostot/" + this.fileName+".txt"));
            while (reader.hasNext()) {
                String text = reader.nextLine();
                temp.add(text);
            }
            PrintWriter writer = new PrintWriter(new File("./Tiedostot/" + this.fileName+".txt"));
            for (int i = 0; i < temp.size(); i++) {
                writer.println(temp.get(i));
            }
            writer.println(word);
            writer.println(translation);
            writer.close();
            reader.close();
        } else {
            PrintWriter writer = new PrintWriter(new File("./Tiedostot/" + this.fileName+".txt"));
            writer.println(word);
            writer.println(translation);
            writer.close();
        }
    }
}
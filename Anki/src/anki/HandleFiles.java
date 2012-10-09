package anki;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Käsittelee tiedostoja.
 */
public class HandleFiles {

    private File file;
    private String fileName;

    public HandleFiles(File file, String name) {
        this.file = file;
        this.fileName = name;
    }

    public HandleFiles() {
    }

    /**
     * Alustaa tiedoston.
     */
    public void setFile(File file) {
        this.file = file;
    }

    /**
     * Asettaa tiedoston nimeksi annetun nimen.
     */
    public void setFileName(String name) {
        this.fileName = name;
    }

    /**
     * Lisää uuden tiedoston listaan.
     */
    public void addFile(String name) throws IOException {
        FileWriter writer = new FileWriter("./Tiedostot/Tiedostolista.txt", true);
        writer.append(name + "\n");
        writer.close();
    }

    /**
     * Luo uuden tiedoston annetulla nimellä.
     */
    public void createFile(String name) throws IOException {
        setFileName(name);
        setFile(new File("./Tiedostot/" + name + ".txt"));
        addFile(name);

    }

    /**
     * Poistaa tiedoston annetulla nimellä.
     */
    public void deleteFile(String name) {
        try {
            ArrayList<String> temporary = getWords("Tiedostolista");
            PrintWriter writer = new PrintWriter(new File("./Tiedostot/Tiedostolista.txt"));
            for (int i = 0; i < temporary.size(); i++) {
                if (!temporary.get(i).equals(name)) {
                    writer.println(temporary.get(i));
                }
            }
            writer.close();
            File textfile = new File("./Tiedostot/" + name + ".txt");
            textfile.delete();
        } catch (Exception e) {
            System.out.println("deleteFileFromTextFile = ERROR");
        }
    }

    /**
     * Poistaa sanan ja käännöksen annetulla tiedoston nimellä.
     */
    public void deleteWord(String file, String word, String translation) throws FileNotFoundException {
        ArrayList<String> list = getWords(file);
        PrintWriter writer = new PrintWriter(new File("./Tiedostot/" + file + ".txt"));
        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).equals(word)) {
                if (!list.get(i).equals(translation)) {
                    writer.println(list.get(i));
                }
            }
        }
        writer.close();
    }

    /**
     * Tarkastaa onko tiedoston sisältö tyhjä.
     * 
     * @return Boolean
     */
    public boolean fileIsEmpty(String name) {
        File temp = new File("./Tiedostot/" + name + ".txt");
        boolean empty = temp.length() == 0;
        return empty;
    }

    /**
     * Hakee kaikkien olemassa olevat sanat tiedostosta.
     * 
     * @return ArrayList<String>
     */
    public ArrayList<String> getWords(String name) throws FileNotFoundException {
        ArrayList<String> list = new ArrayList<String>();
        Scanner reader = new Scanner(new File("./Tiedostot/" + name + ".txt"));
        while (reader.hasNext()) {
            list.add(reader.next());
        }
        reader.close();
        return list;
    }

    /**
     * Kirjoittaa annetun sanan ja käännöksen tiedostoon vanhan sisällön
     * lisäksi jos löytyy.
     */
    public void writeToFile(String name, String word, String translation) throws IOException {
        FileWriter writer = new FileWriter("./Tiedostot/" + name + ".txt", true);
        if (fileIsEmpty(name) == false) {
            writer.append(word + "\n" + translation + "\n");
            writer.close();
        } else {
            writer.write(word + "\n" + translation + "\n");
            writer.close();
        }
    }
}
package anki;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Käsittelee tiedostoja.
 */
public class HandleFiles {


    private String fileName;
    private File file;

    public HandleFiles(File file, String name) {
        //        this.fileList = new HashMap<String, File>();
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
    public void addFile(String name) {
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
    }

    /**
     * Luo uuden tiedoston annetulla nimellä.
     */
    public void createFile(String name) {
        if (fileExists(name) == false) {
            setFileName(name);
            setFile(new File("./Tiedostot/" + name + ".txt"));
            addFile(name);
            try {
                PrintWriter writer = new PrintWriter(this.file);
                writer.close();

            } catch (Exception e) {
                System.out.println("Could not create a file!");
            }
        }
    }

    /**
     * Poistaa tiedoston annetulla nimellä.
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
        ArrayList<String> list = getExistingWords(file);
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
        Scanner reader = new Scanner("./Tiedostot/" + name + ".txt");
        if (reader.nextLine().isEmpty()) {
            reader.close();
            return true;
        } else {
            reader.close();
            return false;
        }
    }

    /**
     * Tarkastaa onko tiedosto olemassa.
     * 
     * @return Boolean
     */
    public boolean fileExists(String name) {
        File test = new File("./Tiedostot/" + name + ".txt");
        if (test.exists()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Hakee kaikkien olemassa olevien tiedostojen nimet.
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
     * Hakee kaikkien olemassa olevat sanat tiedostosta.
     * 
     * @return ArrayList<String>
     */
    public ArrayList<String> getExistingWords(String name) throws FileNotFoundException {
        ArrayList<String> list = new ArrayList<String>();
        Scanner reader = new Scanner(new File("./Tiedostot/"+name+".txt"));
        
        while (reader.hasNext()) {
            list.add(reader.next());
        }
        reader.close();
        return list;
    }

    /**
     * Lataa halutun tiedoston annetulla nimellä.
     * 
     * @return ArrayList<String>
     */
    public ArrayList<String> loadFile(String name) throws FileNotFoundException {
        ArrayList<String> list = new ArrayList<String>();
        Scanner reader = new Scanner(new File("./Tiedostot/" + name + ".txt"));

        while (reader.hasNext()) {
            list.add(reader.nextLine());
        }
        reader.close();
        return list;
    }

    /**
     * Lataa halutun tiedoston sanat annetulla nimellä.
     * 
     * @return ArrayList<Cards>
     */
    
    public ArrayList<Cards> loadWords(String name) throws FileNotFoundException {
        ArrayList<Cards> list = new ArrayList<Cards>();
        Scanner reader = new Scanner(new File("./Tiedostot/" + name + ".txt"));

        while (reader.hasNext()) {
            Cards card = new Cards(reader.nextLine(), reader.nextLine());
            list.add(card);
        }
        reader.close();
        return list;
    }
    
    /**
     * Kirjoittaa annetun sanan ja käännöksen tiedostoon vanhan sisällön
     * lisäksi jos löytyy.
     */
    public void writeToFile(String name, String word, String translation) throws FileNotFoundException {
        if (fileIsEmpty(name + ".txt") == false) {
            ArrayList<String> temp = new ArrayList<String>();
            Scanner reader = new Scanner(new File("./Tiedostot/" + name + ".txt"));
            while (reader.hasNext()) {
                String text = reader.nextLine();
                temp.add(text);
            }
            PrintWriter writer = new PrintWriter(new File("./Tiedostot/" + name + ".txt"));
            for (int i = 0; i < temp.size(); i++) {
                writer.println(temp.get(i));
            }
            writer.println(word);
            writer.println(translation);
            writer.close();
            reader.close();
        } else {
            PrintWriter writer = new PrintWriter(new File("./Tiedostot/" + name + ".txt"));
            writer.println(word);
            writer.println(translation);
            writer.close();
        }
    }
}
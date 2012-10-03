package anki;

/**
* Hoitaa korttien toiminnallisuudet.
*/

public class Cards {

    private String word;
    private String translation;
    
    public Cards(String word, String translation) {
        this.word = word;
        this.translation = translation;
    }
    
    /**
    * Palauttaa sanan.
    *
    * @return String
    */
    
    public String getWord() {
        return this.word;
    }
    
    /**
    * Palauttaa käännöksen.
    *
    * @return String
    */

    public String getTranslation() {
        return this.translation;
    }
}

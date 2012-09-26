package anki;


public class Cards {

    private String word;
    private String translation;

    public Cards(String word, String translation) {
        this.word = word;
        this.translation = translation;
    }
    
    /**
    * Metodi palauttaa sanan
    *
    * @return String
    */
    
    public String getWord() {
        return this.word;
    }
    
    /**
    * Metodi palauttaa käännöksen
    *
    * @return String
    */

    public String getTranslation() {
        return this.translation;
    }
}

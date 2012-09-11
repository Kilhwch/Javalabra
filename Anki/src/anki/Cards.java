
package anki;
public class Cards {

    private String word;
    private String translation;
    

    public Cards(String word, String translation) {
        this.word = word;
        this.translation = translation;
    }
    
    public String getWord() {
        return this.word;
    }
    
    public String getTranslation() {
        return this.translation;
    }
}

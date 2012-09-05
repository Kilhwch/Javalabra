
/*****************************************/
/*Author: Kasper*************************/
/*Anki/Cards****************************/
/*Date: 18/08/2012*********************/
/*************************************/

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
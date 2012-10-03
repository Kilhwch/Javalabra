package anki;


/**
* Laskee tilastoja.
*/

public class Stats {

    private int correctAnswers;
    private int incorrectAnswers;
    
    public Stats() {
    }

    /**
     * Palauttaa kaikkien vastauksien kokonaismäärän.
     * 
     * @return Integer
     */
    public int getTotalAnswers() {
        return correctAnswers + incorrectAnswers;
    }

    /**
     * Palauttaa oikeiden vastauksien määrän
     * ja prosentuaalisen arvon.
     * 
     * @return String
     */
    public String getTotalCorrectStats() {
        return "Corrects answers: ["
                + correctAnswers + "]" + " (" + countPercents() * 1 + "%)";
    }

    /**
     * Palauttaa väärien vastauksien määrän.
     * ja prosentuaalisen arvon.
     * 
     * @return String
     */
    public String getTotalIncorrectStats() {
        return "Incorrects answers: ["
                + incorrectAnswers + "]" + " (" + (100.0 - (countPercents() * 1)) + "%)";
    }
    
     /**
     * Nollaa oikeiden sekä väärien vastauksien arvot.
     */
    public void reset() {
        correctAnswers = 0;
        incorrectAnswers = 0;
    }

    /**
     * Kasvattaa oikeiden vastauksien määrää.
     */
    public void countToCorrectAnswers() {
        ++correctAnswers;
    }

    /**
     * Kasvattaa väärien vastauksien määrää.
     */
    public void countToIncorrectAnswers() {
        ++incorrectAnswers;
    }

    /**
     * Laskee oikeiden vastauksien määrän prosentteina.
     * 
     * @return Double
     */
    public double countPercents() {
        double percent = ((correctAnswers / (double) getTotalAnswers()) * 100);
        percent = Math.round(percent * 100.0) / 100.0;
        return percent;
    }
}
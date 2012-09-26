package anki;

public class Stats {

    private int correctAnswers;
    private int incorrectAnswers;

    public Stats() {
    }

    /**
     * Metodi palauttaa kaikkien vastauksien kokonaismäärän
     * 
     * @return Integer
     */
    public int getTotalAnswers() {
        return correctAnswers + incorrectAnswers;
    }

    /**
     * Metodi palauttaa oikeiden vastauksien määrän
     * ja prosentuaalisen arvon
     * 
     * @return String
     */
    public String getTotalCorrectStats() {
        return "Corrects answers: ["
                + correctAnswers + "]" + " (" + countPercents() * 1 + "%)";
    }

    /**
     * Metodi palauttaa väärien vastauksien määrän
     * ja prosentuaalisen arvon
     * 
     * @return String
     */
    public String getTotalIncorrectStats() {
        return "Incorrects answers: ["
                + incorrectAnswers + "]" + " (" + (100.0 - (countPercents() * 1)) + "%)";
    }
    
    public void reset() {
        correctAnswers = 0;
        incorrectAnswers = 0;
    }

    /**
     * Metodi kasvattaa oikeiden vastauksien määrää
     * 
     * @return Tyhjä
     */
    public void countToCorrectAnswers() {
        ++correctAnswers;
    }

    /**
     * Metodi kasvattaa väärien vastauksien määrää
     * 
     * @return Tyhjä
     */
    public void countToIncorrectAnswers() {
        ++incorrectAnswers;
    }

    /**
     * Metodi laskee oikeiden vastauksien määrän prosentteina
     * 
     * @return Double
     */
    public double countPercents() {
        double percent = ((correctAnswers / (double) getTotalAnswers()) * 100);
        percent = Math.round(percent * 100.0) / 100.0;
        return percent;
    }
}
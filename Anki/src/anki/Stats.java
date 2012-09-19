/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package anki;

/**
 *
 * @author Kasper
 */
public class Stats {

    private int correctAnswers;
    private int incorrectAnswers;

    public Stats() {
    }

    public void countToCorrectAnswers() {
        ++correctAnswers;
    }

    public void countToIncorrectAnswers() {
        ++incorrectAnswers;
    }

    public int getCorrectAnswers() {
        return correctAnswers;
    }

    public int getIncorrectAnswers() {
        return incorrectAnswers;
    }

    public int getTotalAnswers() {
        return correctAnswers + incorrectAnswers;

    }

    /*********************************************************/
    public double countPercents() {
        double percent = ((correctAnswers / (double) getTotalAnswers()) * 100);
        percent = Math.round(percent * 100.0) / 100.0;
        return percent;
    }

    public String getTotalCorrectStats() {
        return "Corrects answers: [" + correctAnswers + "] (" + (countPercents() * 1) + "% )";

    }

    public String getTotalIncorrectStats() {
        return "Incorrects answers: [" + incorrectAnswers + "] (" + (100.0 - (countPercents() * 1)) + "% )";

    }
}

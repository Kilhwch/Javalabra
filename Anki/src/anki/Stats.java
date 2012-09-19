package anki;


public class Stats {
    private int correctAnswers;
    private int incorrectAnswers;

    public Stats() {
    }

    /***********SETTERS & GETTERS***********/
    
    
    public int getCorrectAnswers() {
        return correctAnswers;
    }

    public int getIncorrectAnswers() {
        return incorrectAnswers;
    }

    public int getTotalAnswers() {
        return correctAnswers + incorrectAnswers;
    }
    
    public String getTotalCorrectStats() {
        return "Corrects answers: [" + 
                correctAnswers + "]" + "(" + countPercents() * 1 + "% )";
    }

    public String getTotalIncorrectStats() {
        return "Incorrects answers: [" + 
                incorrectAnswers + "]" + "(" + (100.0 - (countPercents() * 1)) + "% )";
    }
    
    /*************COUNT ANSWERS*************/
    
    public void countToCorrectAnswers() {
        ++correctAnswers;
    }

    public void countToIncorrectAnswers() {
        ++incorrectAnswers;
    }

    /******************MATH*****************/
    
    public double countPercents() {
        double percent = ((correctAnswers / (double) getTotalAnswers()) * 100);
        percent = Math.round(percent * 100.0) / 100.0;
        return percent;
    }
}
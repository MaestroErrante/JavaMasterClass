public class Main {

    public static void main(String[] args) {
       
       int highScore = calculateScore(true, 800,5,100);
        System.out.println("Your final score was " + highScore);

        boolean gameOver = true;
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was "+ highScore);

        // Create a method called displayHighScorePosition
        // It should've a players name as a parameter, and a 2nd parameter as a position in the high score table
        // You should display the players name along with a message like "managed to get into position" and the
        // position they got adn a further message "on the high score table"
        //
        // Create a 2nd method called calculateHighScorePosition
        // it should be sent one argument only, the player score
        // it should return an int
        // the return data should be
        // 1 if the score is > 1000
        // 2 if the score is >500 and <1000
        // 3 if the score is >100 and >500
        // 4 in all other cases
        // call both mehtods and display the results of the following
        // a score of 1500, 900, 400, and 50

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return - 1;
    }
}

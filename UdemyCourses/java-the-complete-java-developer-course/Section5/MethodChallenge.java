public class MethodChallenge {

    public static void displayHighScorePosition(String name, int position){
        System.out.println(
            String.format("%s managed to get into position %d on the high score list.", name, position)
        );
    }

    public static int calculateHighScorePosition(int score) {
        if(score >= 1_000) {
            return 1;
        } else if( score >= 500) {
            return 2;
        } else if(score >= 100) {
            return 3;
        } else {
            return 4;
        }
    }

    public static void main(String... args) {

        displayHighScorePosition("Tim", calculateHighScorePosition(1500));
        displayHighScorePosition("Bob", calculateHighScorePosition(1000));
        displayHighScorePosition("Dave", calculateHighScorePosition(500));
        displayHighScorePosition("Roger", calculateHighScorePosition(100));
        displayHighScorePosition("Derek", calculateHighScorePosition(25));

    }
}
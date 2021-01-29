import java.util.Random;

public class Randomizer {
    public static void main(String[] args) {
    String word = RandomWord();
    }

    public static String RandomWord() {
        String[] words = {"Nagel","betyg","debut","fakta"};
        Random R = new Random();
        int randomNumber = R.nextInt(words.length);
        return words[randomNumber];
    }
}

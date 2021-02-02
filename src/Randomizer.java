import java.util.Random;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class Randomizer {
    public static void main(String[] args) {
    String word = RandomWord();
    }

    public static String RandomWord() {
        String[] words = {"nagel","betyg","debut","fakta"};
        Random R = new Random();
        int randomNumber = R.nextInt(words.length);
        return words[randomNumber];
    }
}

class LetterGuess {
    public static String Guess() {
        Scanner ReadGuess = new Scanner(System.in);
        System.out.println("Gissa på en bokstav");
        String Guess = ReadGuess.nextLine();
        System.out.println("Du gissade på " + toUpperCase(Guess) + ".");
        return Guess;
    }
}
import java.util.Scanner;

import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class LetterGuess {
    public static void main(String[] args) {
        Scanner ReadGuess = new Scanner(System.in);
        System.out.println("Gissa på en bokstav");
        String Guess = ReadGuess.nextLine();
        System.out.println("Du gissade på " + toUpperCase(Guess) + ".");
    }
}

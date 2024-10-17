package word_games;
import java.util.Scanner;
public class WordGamesTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask for a word
        System.out.println("Enter a word: ");
        String userWord = input.nextLine();

        // Create a WordsGames instance to play with userWord
        WordsGames newGames = new WordsGames(userWord); 
        // Scramble it
        String scrambled = newGames.scramble();

        // Print out scrambled word
        System.out.println("Scrambled word: " + scrambled);

        // Ask for an index
        System.out.println("Enter an integer (index to insert at): ");
        int idx = input.nextInt();
        input.nextLine();  // Skip over the newline
        System.out.println("Enter another word to insert: ");
        String word = input.nextLine();

        // Add random word at index
        // Use the bananaSplit method to insert word at index
        String modifiedWord = newGames.bananaSplit(idx, word);

        // Print out the modified word
        System.out.println("Modified word after insertion at index: " + modifiedWord);

        // Ask for a character (store as a String)
        System.out.println("Enter a character to insert after: ");
        String charToInsertAfter = input.nextLine();
        System.out.println("Enter another word to insert: ");
        String wordToInsert = input.nextLine();

        // Add random word at the first occurrence of the character
        // Use the bananaSplit method that accepts a character to insert after
        String finalModifiedWord = newGames.bananaSplit(charToInsertAfter, wordToInsert);

        // Print out the final modified word
        System.out.println("Final modified word after inserting at character: " + finalModifiedWord);

        // Close the scanner
        input.close();
    }
}

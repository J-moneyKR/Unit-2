
package word_games;

/**
 * Name:  (Jack Fryer)
 * Date: 10-10-24 (Tuesday, October)
 * Description: This is a collection of methods for a word game that
 * people can play
 */
public class WordsGames 
{
    private String word;

    public WordsGames(String text) 
    {
        word = text;
    }

    /**
     * Scrambles a word by switching the first and second half of the word.
     * @return the scrambled word
     */
    public String scramble()
    {
        // switch first half and second half
        int numChars = word.length();
        int halfPoint = numChars / 2;
        String firstHalf = word.substring(0, halfPoint);
        String secondHalf = word.substring(halfPoint);

        return secondHalf + firstHalf;
    }

    /**
     * Modifies a given string by inserting text at the specified index
     * @param insertIdx int index where the text will be inserted
     * @param insertText String text to be inserted
     * @return modified text
     */
    public String bananaSplit(int insertIdx, String insertText)
    {
        // Check if insertIdx is out of bounds
        if (insertIdx < 0 || insertIdx > word.length()) {
            throw new IllegalArgumentException("Index out of bounds");
        }

        // Split the word into two parts: before and after the index
        String beforeInsert = word.substring(0, insertIdx);
        String afterInsert = word.substring(insertIdx);

        // Concatenate the parts with insertText in the middle
        return beforeInsert + insertText + afterInsert;
    }

    /**
     * Modifies a given string by inserting text at the first occurrence of the
     * specified character
     * @param insertChar char character you want
     * @param insertText String
     * @return the modified text
     */
    public String bananaSplit(String insertChar, String insertText)
    {
        // Insert insertText after the first occurrence of the insertChar
        int indexOfChar = word.indexOf(insertChar);

        if (indexOfChar == -1) {
            return word; // Character not found, return the original word
        }

        // Call the other bananaSplit method to handle insertion
        return bananaSplit(indexOfChar + 1, insertText);
    }

    @Override
    public String toString()
    {
        // Games[word]
        return "Games[" + word + "]";
    }
}

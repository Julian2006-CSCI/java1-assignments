import java.util.Scanner;

public class LabProgram {

    /* Define your method here */
    public static int getWordFrequency(String[] wordsList, int listSize, String currWord) {
        int count = 0;

        for (int i = 0; i <listSize; i++) {
            if (wordsList[i].equalsIgnoreCase(currWord)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int numWords = scnr.nextInt();
        String[] wordsList = new String[numWords];

        // Read words into array
        for (int i = 0; i < numWords; i++) {
            wordsList[i] = scnr.next();
        }

        // Output each word with its frequency
        for (int i = 0; i < numWords; i++) {
            int frequency = getWordFrequency(wordsList, numWords, wordsList[i]);
            System.out.println(wordsList[i] + " " + frequency);
        }
    }
}
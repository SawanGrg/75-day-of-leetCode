package org.example.day1;

public class MergeStringsAlternatively {

    public String mergeStrings(String word1, String word2) {

        if (word1.isEmpty() || word2.isEmpty()) {
            return "is empty";
        }

        // Conversion of strings into character arrays
        char[] firstWord = word1.toCharArray();
        char[] secondWord = word2.toCharArray();

        // Define a new character array for the merged string
        char[] mergedWord = new char[firstWord.length + secondWord.length];

        int index = 0; // Initialize an index to keep track of the position in the merged array

        // Loop through both input strings, adding characters alternately
        int i = 0, j = 0;
        while (i < firstWord.length || j < secondWord.length) {

            if (i < firstWord.length) {
                mergedWord[index] = firstWord[i];
                i++;
                index++;
            }
            if (j < secondWord.length) {
                mergedWord[index] = secondWord[j];
                j++;
                index++;
            }
        }

        // Convert the merged character array back to a string
        String mergedString = new String(mergedWord);

        return mergedString;
    }
}

package org.example;

import org.example.day1.MergeStringsAlternatively;

public class Main {
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";
        MergeStringsAlternatively mergeObj = new MergeStringsAlternatively();

        System.out.println(mergeObj.mergeStrings(word1, word2));

    }
}
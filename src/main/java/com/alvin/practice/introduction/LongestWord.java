package com.alvin.practice.introduction;

/*
Write a method, longestWord, that takes in a sentence string as an argument.
The method should return the longest word in the sentence.
If there is a tie, return the word that occurs later in the sentence.

longestWord("what a wonderful world"); // -> "wonderful"

 */
public class LongestWord {

    public static String longestWord(String sentence) {
        String[] words = sentence.split(" ");
        String longestWord = "";
        for (String word : words) {
            if (word.length() >= longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }

    static void main() {
        System.out.println(longestWord("what a wonderful world"));
    }
}

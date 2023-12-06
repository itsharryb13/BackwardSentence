
package backwardsentence;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

/**
 *
 * Authors:
 * - Harpreet Singh
 * - Ryan Serrano
 * - Luisa Valencia
 */



public class BackwardSentence {

    public static void main(String[] args) throws IOException {
        // Specify the file path containing Chuck Norris jokes
        String fileName = "/Users/ryanserrano/Documents/chuck_norris_jokes.txt";
        
        // Retrieve jokes from the text file
        String[] jokes = getJokes(fileName);
        
        // Iterate through each joke, reverse the words, and print the result
        for (String joke : jokes) {
            char[] letters = joke.toCharArray();
            reverseWords(letters);
            String reversedSentence = reverseSentences(new String(letters));
            System.out.println(reversedSentence);
        }
    }

    // Function to reverse individual letters in each word
    public static void reverseWords(char[] letters) {
        Stack<Character> stack = new Stack<>(); // Create a new stack
        for (int i = 0; i < letters.length; i++) {
            stack.push(letters[i]); // Push each character into the stack
        }
        int j = 0;
        while (!stack.empty()) {
            letters[j++] = stack.pop(); // Pop characters from the stack to reverse the order
        }
        // The result is reversed individual letters in each word
    }

    // Function to reverse the order of words in a sentence
    public static String reverseSentences(String sentence) {
        String[] words = sentence.split("\\s+"); // Split the sentence into individual words
        Stack<String> stack = new Stack<>(); // Create a new stack
        for (String word : words) {
            stack.push(word); // Push each word into the stack
        }
        int j = 0;
        StringBuilder reversedSentence = new StringBuilder(); // Create a new StringBuilder for the reversed sentence
        while (!stack.isEmpty()) {
            // Pop words from the stack and append them to the StringBuilder with space
            reversedSentence.append(stack.pop()).append(" ");
        }
        return reversedSentence.toString().trim(); // Trim excess space and return the reversed sentence
    }

    // Function to read jokes from a text file
    private static String[] getJokes(String fileName) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            // Read lines from the text file and convert them into an array of strings
            return br.lines().toArray(String[]::new);
        }
    }
}


This Java program reads Chuck Norris jokes from a text file, reverses the order of the letters in each word, and then reverses the order of the words in each sentence. Let's break down the code:



**`reverseWords` Method:**
    - This method takes an array of characters and reverses the order of the letters in each word.
    - It uses a `Stack<Character>` to push each character onto the stack and then pops them off to reverse the order.

**`reverseSentences` Method:**
    - This method takes a sentence as a string, splits it into individual words using whitespace as a delimiter, and then reverses the order of the words.
    - It uses a `Stack<String>` to push each word onto the stack and then pops them off to reverse the order.
    - The reversed words are appended to a `StringBuilder` with spaces in between, and the final reversed sentence is returned.

**`getJokes` Method:**
    - This private method takes a file name as input and reads jokes from the specified file.
    - It uses a try-with-resources statement to automatically close the `BufferedReader` when done.
    - It reads lines from the file and converts them into an array of strings.

 **File Path:**
    - The file path of the Chuck Norris jokes file is hardcoded as "/Users/ryanserrano/Documents/chuck_norris_jokes.txt". You may need to modify this path based on your system and the location of the file.
the program reads Chuck Norris jokes from a file, reverses the letters in each word, and then reverses the order of words in each sentence before printing the modified sentences.

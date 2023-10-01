/**
 * @author Ben Albright
 * Program to take words and their definitions from a file.
 * Converts the words to hashmap keys to find the definition.
 */

import java.io.FileNotFoundException;
public class DictionaryApplication {

	public static void main(String[] args) throws FileNotFoundException
	{
		/**
		 * Declares a new variable for the Dictionary class.
		 * Calls the method to import the words and definitions from a file.
		 * It then prints all the hashmap keys and definitions.
		 */
		Dictionary dictionary = new Dictionary();
		dictionary.importDictionary();
		dictionary.printDictionary();
		
		/**
		 * Printing a blank line for readability.
		 */
		System.out.println();
		
		/**
		 * Calls the searchKey method with specific words
		 * to find them in the dictionary and print
		 * the word, the definition and hashkey.
		 */
		System.out.println(dictionary.searchKey("ye"));
		System.out.println(dictionary.searchKey("glim"));
		System.out.println(dictionary.searchKey("soak"));
		System.out.println(dictionary.searchKey("taiga"));
		System.out.println(dictionary.searchKey("levy"));
		System.out.println(dictionary.searchKey("laud"));
		
		/**
		 * Calls the searchKey method to test for
		 * how the method handles searching for a 
		 * word not in the dictionary.
		 */
		System.out.println(dictionary.searchKey("bandana"));
		System.out.println(dictionary.searchKey("television"));
	}//end main
}//end class
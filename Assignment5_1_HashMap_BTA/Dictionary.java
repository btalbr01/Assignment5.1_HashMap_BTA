/**
 * @author Ben Albright
 * Class to import words and definitions from a file,
 * print the contents of the dictionary, or look
 * for specific words and return the definitions and hashkey.
 */
import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Dictionary 
{
	private HashMap<Integer, String> dictionary;
	
	/**
	 * instantiates the HashMap. The integer is the key, 
	 * the string is the word's definition.
	 */
	public Dictionary()
	{
		dictionary = new HashMap<Integer, String>();
	}//end default constructor
	
	/**
	 * Reads in each line of the given file. Each word is 
	 * converted to a hashkey, and each definition is stored
	 * in the dictionary
	 * @throws FileNotFoundException
	 */
	public void importDictionary() throws FileNotFoundException
	{
		File file = new File("DictionaryWordValuePairs.csv");
		Scanner scanner = new Scanner(file);
		
		while(scanner.hasNextLine())
		{
			String scannedIn[] = scanner.nextLine().split(",");
			dictionary.put(scannedIn[0].hashCode(), scannedIn[1]);	
		}//end while
		scanner.close();
	}//end importDictionary
	
	/**
	 * Searches the library for a given defintion by
	 * converting the word into a hashkey.
	 * @param key
	 * @return "word" not found if the hashkey location is null. 
	 * Otherwise returns the word, its definition and the hashkey.
	 */
	public String searchKey(String key)
	{
		if(dictionary.get(key.hashCode()) == null)
			return key + " not found";
		else	
			return  key + ": " + dictionary.get(key.hashCode()) + ".\thashkey: " + key.hashCode();	
	}//end searchKey
	
	/**
	 * Iterates through the dictionary, 
	 * printing every definition and hashkey.
	 * @return all definitions and hashkeys.
	 */
	public void printDictionary()
	{
		dictionary.entrySet().forEach(entry->
		{
		    System.out.println(entry.getValue() + "\t hashkey: " + entry.getKey());  
		});//end forEach loop
	}//end printDictionary
}//end class

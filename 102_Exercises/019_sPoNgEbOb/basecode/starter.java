/*
	Author:
	Date:
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a word or phrase:");
		String phrase = sc.nextLine();
		
		String newPhrase = "";
		
		int space;
		String word;
		
		while (true) {
			space = phrase.indexOf(" ");
			if (space == -1) {
				word = phrase.substring(0);
				newPhrase = newPhrase + " " + spongeCaseWord(word);
				break;
			}
			word = phrase.substring(0, space);
			
			if (newPhrase.length() != 0) {
				newPhrase = newPhrase + " " + spongeCaseWord(word);
			} else {
				newPhrase = spongeCaseWord(word);
			}
			
			phrase = phrase.substring(space+1);
		}
		
		System.out.println("Your word/phrase as sPoNgE cAsE:");
		System.out.println(newPhrase);
	}
	
	public static String spongeCaseWord(String word) {
		String newWord = "";
		for (int i = 0; i < word.length(); i++) {
			if (i % 2 == 0) {
				newWord = newWord + word.substring(i, i+1).toLowerCase();
			} else {
				newWord = newWord + word.substring(i, i+1).toUpperCase();
			}
		}
		return newWord;
	}
}

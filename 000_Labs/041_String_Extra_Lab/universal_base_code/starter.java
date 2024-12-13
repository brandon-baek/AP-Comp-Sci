/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

public class starter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a phrase: ");
        String originalPhrase = scanner.nextLine();
        
        System.out.println("Original phrase: " + originalPhrase);
        String reversedPhrase = reverseWords(originalPhrase);
        System.out.println("Reversed phrase: " + reversedPhrase);
    }
    
    public static String reverseWords(String phrase) {
        if (phrase.length() == 0) {
            return "";
        }
        
        String reversed = "";
        while (phrase.length() > 0) {
            int spaceIndex = phrase.indexOf(" ");
            
            if (spaceIndex == -1) {
                reversed = phrase + " " + reversed;
                break;
            }
            
            String word = phrase.substring(0, spaceIndex);
            reversed = word + " " + reversed;
            phrase = phrase.substring(spaceIndex + 1);
        }
        
        return reversed;
    }
}

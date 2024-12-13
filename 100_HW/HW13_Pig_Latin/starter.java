/*
   * Author:
   * Date:
   * Collaborator(s):
*/
import java.util.*;
class starter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");
        StringBuilder newSentence = new StringBuilder();
        
        for (int i = 0; i < words.length; i++) {
            if (i > 0) {
                newSentence.append(" ");
            }
            newSentence.append(translate(words[i]));
        }
        
        System.out.println("\nTranslated Message:");
        System.out.println(newSentence.toString());
    }
    
    public static String translate(String word) {
        String vowels = "aeiou";
        
        String lowerWord = word.toLowerCase();
        
        if (word.length() == 2) {
            if (vowels.contains(lowerWord.substring(0, 1))) {
                return word + "-way";
            }
            
            if (vowels.contains(lowerWord.substring(1, 2))) {
                return word.substring(1) + "-" + word.substring(0, 1) + "ay";
            }
            
            return word + "-ay";
        }
        
        if (vowels.contains(lowerWord.substring(0, 1))) {
            return word + "-way";
        }
        
        for (int i = 1; i < word.length(); i++) {
            if (vowels.contains(lowerWord.substring(i, i+1))) {
                return word.substring(i) + "-" + word.substring(0, i) + "ay";
            }
        }
        
        return word + "-way";
    }
}
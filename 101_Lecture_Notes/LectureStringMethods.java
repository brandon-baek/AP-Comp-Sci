/* 
    Lecture note example - String Methods!
    length() - Returns the number of characters in a String
    substring(int) - Starts from the given int and returns to the end of the String
    substring(int, int) - Starts from the first int and returns until the last int (NOT including last int index)
    indexOf(String) - Returns the index of the first instance of a given String
    indexOf(String, int) - Returns the index of the first instance of a given String STARTING at the int index given
*/

import java.util.*;

class LectureStringMethods{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a sentence:");
        String sentence = sc.nextLine();
        
        while (true) {
            if (sentence.indexOf(" ") == -1) {
                System.out.println(sentence);
                break;
            }
            int space = sentence.indexOf(" ");
            String word = sentence.substring(0, space);
            sentence = sentence.substring(space+1);
            
            System.out.println(word);
        }
	}
}
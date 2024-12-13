import java.util.*;
import java.io.*;

class starter {
	public static void main(String args[]) throws Exception {
		//Creating File instance to reference text file in Java
        File text = new File("./passwords.txt");			// This file must be in the same folder as your java/class files.
     
        //Creating Scanner instance to read File in Java
        Scanner numLines = new Scanner(text);			// Scanner for counting number of lines
        Scanner sc = new Scanner(text);					// New Scanner for taking in the lines.
     
	 	// Count number of lines in text file.
		int count = 0; 
        while(numLines.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
			numLines.nextLine();
            count++;
        }  
		
		String [] passwords = new String[count];		// This is the array you will be using.

        //Reading each line of the file using Scanner class
		int i = 0;
        while(sc.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
            String line = sc.nextLine();
            passwords[i] = line;
			i++;
        }  

		/* ----------------------------------------------------------------------------------------- */
		// Start here, use the array passwords
		
		int level0Count = 0;
		int level1Count = 0;
		int level2Count = 0;
		int level3Count = 0;
		
		for (int idx = 0; idx < passwords.length; idx++) {
		    int strength = strengthCheck(passwords[idx]);
		    if (strength == 0) {
		        level0Count++;
		    } else if (strength == 1) {
		        level1Count++;
		    } else if (strength == 2) {
		        level2Count++;
		    } else {
		        level3Count++;
		    }
		}
		
		System.out.println("Level 0s: " + level0Count);
		System.out.println("Level 1s: " + level1Count);
		System.out.println("Level 2s: " + level2Count);
		System.out.println("Level 3s: " + level3Count);
	}
	
	public static int strengthCheck(String password) {
	    String symbols[] = {"!", "@", "#", "$", "%", "^", "&", "*"};
	    
	    Boolean flag2 = false;
	    for (int i = 0; i < symbols.length; i++) {
	        if (password.contains(symbols[i])) {
	            flag2 = true;
	            break;
	        }
	    }
	    
	    Boolean flag1 = false;
	    if (password.length() >= 8) {
	        flag1 = true;
	    }
	    
	    int level;
	    if (flag1 && flag2) {
	        level = 3;
	    } else if (flag2) {
	        level = 2;
	    } else if (flag1) {
	        level = 1;
	    } else {
	        level = 0;
	    }
	    
	    return level;
	}
}

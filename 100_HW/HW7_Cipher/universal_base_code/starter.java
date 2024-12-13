/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Cipher cipher = new Cipher();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What message would you like to encode:");
		System.out.println("Encoded Message: " + cipher.encode(sc.nextLine()));
	}
}

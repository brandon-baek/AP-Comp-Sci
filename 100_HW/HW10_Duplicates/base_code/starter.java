/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		Random rand = new Random();
		
		int [] array = new int[20];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(1, 11);
		}
		
		System.out.print("Array: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		int target = rand.nextInt(1, 11);
		
		System.out.print("\nDuplicate Target: " + target);
		
		int duplicateTotal = 0;

		System.out.print("\nDuplicate Indexes: ");
		for (int i = 0; i < array.length; i++) {
			if (array[i] == target) {
				System.out.print(i + " ");
				duplicateTotal++;
			}
		}
		
		System.out.println("\nDuplicate Total: " + duplicateTotal);
		
		
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] == array[i + 1]) {
				System.out.println("Consecutive number: " + array[i]);
				System.out.println("Consecutive numbers indexes: " + i + ", " + (i+1));
			}
		}
	}
}

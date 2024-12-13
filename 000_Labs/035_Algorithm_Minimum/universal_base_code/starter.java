/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Random rand = new Random();
		
		int [] array = new int[rand.nextInt(51, 201)];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(1, 101);
		}
		
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		
		int max = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		
		int avg = 0;
		for (int i = 0; i < array.length; i++) {
			avg = avg + array[i];
		}
		avg = avg / array.length;
		
		
		System.out.println("- Array Info -");
		System.out.println("Length: " + array.length);
		System.out.println("Minimum: " + min);
		System.out.println("Maximum: " + max);
		System.out.println("Average: " + avg);
  	}
}

/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		 int arr1 [] = new int[1001];
		 int arr2 [] = new int[1001];
		 
		 int idx;
		 int valueIdx;
		 
		 idx = 0;
		 valueIdx = 3;
		 while (idx < 1001) {
		 	arr1[idx] = valueIdx;
		 	idx++;
		 	valueIdx = valueIdx + 3;
		 }
		 
		 
		 idx = 0;
		 valueIdx = 1000;
		 while (idx < 1001) {
		 	arr2[idx] = valueIdx;
		 	idx++;
		 	valueIdx = valueIdx - 1;
		 }
		 
		 
		 
		 System.out.println("\n--- Array 1 ---");
		 idx = 0;
		 while (idx < arr1.length) {
		 	System.out.print(arr1[idx] + ", ");
		 	idx++;
		 }
		 
		 System.out.println("\n--- Array 2 ---");
		 idx = 0;
		 while (idx < arr2.length) {
		 	System.out.print(arr2[idx] + ", ");
		 	idx++;
		 }
	}
}

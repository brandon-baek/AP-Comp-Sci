import java.util.Scanner;
import java.util.Random;

class lab10 {
	public static void main(String args[]) {
	   Scanner sc = new Scanner(System.in);
	   Random rand = new Random();
	   
	   int ans = rand.nextInt(1, 1000);
	   System.out.println("Guess a number between 1 and 1000");
	   int userInp = sc.nextInt();
	   
	   if (userInp == ans) {
	       System.out.println("You got it right!");
	   }
	   
	   else if (userInp > ans) {
	       System.out.println("Your input is greater than the answer.");
	   }
	   
	   else if (userInp < ans) {
	       System.out.println("Your input is less than the answer.");
	   }
	}
}
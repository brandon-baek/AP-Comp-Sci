import java.util.Scanner;
import java.util.Random;

class lab14 {
	public static void main(String args[]) {
	   Scanner sc = new Scanner(System.in);
	   Random rand = new Random();
	   
	   int answer = rand.nextInt(1, 1000);
	   int guess;
	   
	   while (true) {
	   	System.out.println("Guess the number:");
	   	guess = sc.nextInt();
	   	
	   	if (guess == answer) {
	   		System.out.println("You got it!");
	   		break;
	   	} else if (guess > answer) {
	   		System.out.println("Lower");
	   	} else {
	   		System.out.println("Higher");
	   	}
	   }
	}
}
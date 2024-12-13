import java.util.Scanner;
import java.util.Random;

class lab9 {
	public static void main(String args[]) {
	   Scanner sc = new Scanner(System.in);
	   Random rand = new Random();
	   
	   // Part One
	   System.out.println("Is it raining?");
	   String isRaining = sc.nextLine();
	   
	   if(isRaining.equals("yes"))
	   {
	       System.out.println("Bring an Umbrella");
	   }
	   
	   if(isRaining.equals("no"))
	   {
	       System.out.println("Bring Sunscreen");
	   }
	   
	   
	   // Part Two
	   int ans = rand.nextInt(1, 1000);
	   System.out.println("Guess a number between 1 and 1000");
	   int userInp = sc.nextInt();
	   
	   if(userInp == ans)
	   {
	       System.out.println("You got it right!");
	   }
	   else
	   {
	       System.out.println("You got it wrong.");
	   }
	}
}
import java.util.Scanner;

class lab12 {
	public static void main(String args[]) {
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("What is your name?");
	   String name = sc.nextLine();
	   
	   System.out.println("What is your Character Title?");
	   String characterTitle = sc.nextLine();
	   
	   System.out.println("Would you like to be a Wizard, Warrior, or Medic?");
	   String role = sc.nextLine();
	   
	   int points = 25;
	   
	   int strength;
	   int speed;
	   int intelligence;
	   int charisma;
	   int constitution;
	   
	   int userInput;
	   
	   System.out.println("\nYou have 25 points to spend on skillsets.");
	   
	   System.out.println("How much would you like to upgrade Strength? (Max 10)");
	   userInput = sc.nextInt();
	   if (userInput > 10 || userInput > points) {
	   	System.out.println("Error. Try again:");
	   	userInput = sc.nextInt();
	   }
	   strength = userInput;
	   points = points - userInput;
	   
	   System.out.println("You have " + points + " points left");
	   
	   
	   System.out.println("How much would you like to upgrade Speed? (Max 10)");
	   userInput = sc.nextInt();
	   if (userInput > 10 || userInput > points) {
	   	System.out.println("Error. Try again:");
	   	userInput = sc.nextInt();
	   }
	   speed = userInput;
	   points = points - userInput;
	   
	   System.out.println("You have " + points + " points left");
	   
	   
	   System.out.println("How much would you like to upgrade Intelligence? (Max 10)");
	   userInput = sc.nextInt();
	   if (userInput > 10 || userInput > points) {
	   	System.out.println("Error. Try again:");
	   	userInput = sc.nextInt();
	   }
	   intelligence = userInput;
	   points = points - userInput;
	   
	   System.out.println("You have " + points + " points left");
	   
	   
	   System.out.println("How much would you like to upgrade Charisma? (Max 10)");
	   userInput = sc.nextInt();
	   if (userInput > 10 || userInput > points) {
	   	System.out.println("Error. Try again:");
	   	userInput = sc.nextInt();
	   }
	   charisma = userInput;
	   points = points - userInput;
	   
	   System.out.println("You have " + points + " points left");
	   
	   
	   System.out.println("How much would you like to upgrade Constitution? (Max 10)");
	   userInput = sc.nextInt();
	   if (userInput > 10 || userInput > points) {
	   	System.out.println("Error. Try again:");
	   	userInput = sc.nextInt();
	   }
	   constitution = userInput;
	   points = points - userInput;
	   
	   
	   System.out.println("\n---- Profile ----\n");
	   System.out.println("Name: " + name);
	   System.out.println("Title: " + characterTitle);
	   System.out.println("Role: " + role);
	   System.out.println("Strength: " + strength);
	   System.out.println("Speed: " + speed);
	   System.out.println("Intelligence: " + intelligence);
	   System.out.println("Charisma: " + charisma);
	   System.out.println("Constitution: " + constitution);
	   
	   if (points > 0) {
		System.out.println("\nYou had " + points + " left.");
	   }
	}
}
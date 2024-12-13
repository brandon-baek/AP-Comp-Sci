import java.util.Scanner;

class lab11 {
	public static void main(String args[]) {
	   Scanner sc = new Scanner(System.in);
	   
	   String username = "brandonbaek";
	   String password = "12345";
	   
	   System.out.println("Enter your username:");
	   String userInputName = sc.nextLine();
	   
	   System.out.println("Enter your password:");
	   String userInputPass = sc.nextLine();
	   
	   if (username.equals(userInputName) && password.equals(userInputPass)) {
	   	System.out.println("Correct Username and Password");
	   } else {
	   	System.out.println("Incorrect Username or Password");
	   }
	}
}
import java.util.Scanner;

class lab13 {
	public static void main(String args[]) {
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("What is your name?");
	   String name = sc.nextLine();
	   
	   System.out.println("How many times would you like this name to output to the screen?");
	   int repeat = sc.nextInt();
	   
	   while (repeat != 0) {
	   	System.out.println(name);
	   	repeat = repeat - 1;
	   }
	}
}
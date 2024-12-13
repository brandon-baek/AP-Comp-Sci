import java.util.Scanner;

class lab4 {
	public static void main(String args[]) {
	   Scanner sc = new Scanner(System.in);
	   
	   String firstName = sc.nextLine();
	   int age = sc.nextInt();
	   int birthMonth = sc.nextInt();
	   int birthDay = sc.nextInt();
	   int birthYear = sc.nextInt();
	   double buckFifty = sc.nextInt();
	   
	   System.out.println(firstName + "'s age is " + age + ". Their birthday is " + birthDay + "/" + birthMonth + "/" + birthYear + " and a buck fifty is $" + buckFifty);
	}
}
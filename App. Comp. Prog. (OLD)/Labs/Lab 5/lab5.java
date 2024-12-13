import java.util.Scanner;

class lab5 {
	public static void main(String args[]) {
	   System.out.println(Math.max(13 - 6 * 11, 30 % 7 * (-2)));
	   System.out.println(Math.sqrt(3 * 8 + 31 % 7));
	   System.out.println(Math.pow(37 / 3, 35 % 21));
	   System.out.println(Math.max(Math.pow(2, 14 % 3), Math.sqrt(2 * 6)));
	   
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("Enter a Double Value:");
	   double x = sc.nextDouble();
	   System.out.println("Enter another Double Value:");
	   double y = sc.nextDouble();
	   
	   System.out.println(Math.max(x, y));
	   System.out.println(Math.sqrt(y));
	   System.out.println(Math.pow(x, y));
	}
}
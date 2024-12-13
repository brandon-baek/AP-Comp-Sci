import java.util.Scanner;

class lab8 {
	public static void main(String args[]) {
	   Scanner sc = new Scanner(System.in);
	   
	   
	   // Part One
	   
	   int int1;
	   int int2;
	   int int3;
	   
	   System.out.println("Enter an Integer Value:");
	   int1 = sc.nextInt();
	   System.out.println("Enter another Integer Value:");
	   int2 = sc.nextInt();
	   
	   if(int1 == int2)
	   {
	       System.out.println("These two integers are the same.");
	   }
	   if(int1 != int2)
	   {
	       System.out.println("These two integers are different.");
	   }
	   
	   
	   // Part Two
	   
	   System.out.println("Enter an Integer Value:");
	   int1 = sc.nextInt();
	   System.out.println("Enter another Integer Value:");
	   int2 = sc.nextInt();
	   System.out.println("Enter another Integer Value:");
	   int3 = sc.nextInt();
	   
	   
	   int largestInteger = 0;
	   int smallestInteger = 0;
	   
	   
	   if(int1 > int2 && int1 > int3)
	   {
	       largestInteger = int1;
	   }
	   
	   if(int2 > int1 && int2 > int3)
	   {
	       largestInteger = int2;
	   }
	   
	   if(int3 > int1 && int3 > int2)
	   {
	       largestInteger = int3;
	   }
	   
	   
	   if(int1 < int2 && int1 < int3)
	   {
	       smallestInteger = int1;
	   }
	   
	   if(int2 < int1 && int2 < int3)
	   {
	       smallestInteger = int2;
	   }
	   
	   if(int3 < int1 && int3 < int2)
	   {
	       smallestInteger = int3;
	   }
	   
	   System.out.println("Largest Integer: " + largestInteger);
	   System.out.println("Smallest Integer: " + smallestInteger);
	}
}
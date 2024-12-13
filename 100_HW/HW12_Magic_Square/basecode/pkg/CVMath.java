package pkg;

public class CVMath {		
	public static int findMid(int one, int two, int three)
	{
		return (one + two + three - Math.min(one,Math.min(two,three)) - Math.max(one,Math.max(two,three)));
	}
	
	public static boolean isPerfectSquare(int n) {
		return (int) Math.sqrt(n) == Math.sqrt(n); 
	}
	
	public static int sumOfConsecutiveIntegers(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++){
			sum += i;
		}
		return sum;
	}
	
	public static void specialSquare(int n) {
		int idx = 1;
		int count = 0;
		int sum;
		while (count < n) {
			sum = sumOfConsecutiveIntegers(idx);
			if (isPerfectSquare(sum)) {
				System.out.println(sum);
				count++;
			}
			idx++;
		}
	}
}

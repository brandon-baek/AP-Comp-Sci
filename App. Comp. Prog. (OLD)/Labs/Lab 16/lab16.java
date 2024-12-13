class lab16 {
	public static int pow(int int1, int int2) {
		int counter = int2 - 1;
		int product = int1;
		
		while (counter != 0) {
			product = product * int1;
			counter = counter - 1;
		}
		
		return product;
	}
	
	public static void main(String args[]) {
		System.out.println(pow(10, 2));
	}
}
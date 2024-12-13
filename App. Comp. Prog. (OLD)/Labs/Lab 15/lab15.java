class lab15 {
	public static void toString(String str, Boolean startNewLine) {
		if (startNewLine) {
			System.out.println(str);
		} else {
			System.out.print(str);
		}
	}
	
	public static void toStringCombined(String str1, String str2, Boolean startNewLine) {
		if (startNewLine) {
			System.out.println(str1 + " " + str2);
		} else {
			System.out.print(str1 + " " + str2);
		}
	}
	
	public static void main(String args[]) {
	   toString("Hello", true);
	   toStringCombined("Hello", "World", false);
	}
}
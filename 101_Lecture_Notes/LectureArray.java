/* 
    Lecture note example - Arrays
*/

class LectureArray{
    public static void main(String args[]) {
        int [] arr = {5, 7, 10, 2, 8, 3, 8, 1};
        
        for (int i = 1; i < arr.length - 1; i += 2) {
            System.out.print(arr[i] + arr[i+1]);
        }
        
        
        int dupeCheck = 8;
        for (int i = 0; i < arr.length; i++) {
            if (dupeCheck == arr[i]) {
                System.out.println(i);
            }
        }
        
        
        for (int i = 0; i < arr.length - 1; i++) {
            if (Math.abs(arr[i] - arr[i+1]) == 3) {
                System.out.println(i);
            }
        }
	}
}
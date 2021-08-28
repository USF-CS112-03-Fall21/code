public class MathExamples {
	
	public static int func1(int[] arr) {
		int x = arr[0];
		for (int i = 1; i < arr.length; i++) {
             if (arr[i] > x) {
	        	  x  = arr[i];
             }		  

        }
		return x;
  	}

 	public static boolean func2(int[] arr, int elem) {

		for (int i = 0; i < arr.length; i++) {
        	     if (arr[i] > elem) {
	        		  return false;
	        	}
         }		  

		return true;
	}


 public static void main(String[] args) {
     int [] b = {8, 5, 1, 9, 12, 3};
     System.out.println(func1(b));

     System.out.println(func2(b, 9));
 }



}
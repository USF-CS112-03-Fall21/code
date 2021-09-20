import java.util.Arrays;

public class ArrayMethods {


	public static void addNumber(int[] arr, int num) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] + num; 
		}
	}


	public static int computeSum(int[] arr) {
		int sum = 0;

		for (int index = 0; index < arr.length; index++) {
			sum  = sum + arr[index];
		}

		/*for (int element: arr) {
			sum  = sum + element;
		} */
		return sum;
	}

	public static double computeAverage(int[] arr) {

		double average = computeSum(arr) / ((double)arr.length);
		
		return average;
	}
	
	public static int[] addArrays(int[] arr1, int[] arr2) {
		// FILL IN CODE
		// Assume arrays have the same size

		return null;
	}

	public static void main(String[] args) {
		int[] arrInMain = {1, 2, 3, 4, 5};
		/*int sumOfValues = computeSum(arr);
		System.out.println(sumOfValues);

		double average = computeAverage(arr);
		System.out.println(average); */

		addNumber(arrInMain, 10);
		System.out.println(Arrays.toString(arrInMain));

	}





}
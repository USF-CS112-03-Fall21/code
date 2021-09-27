public class NestedLoops {
	
	public static void runNestedLoops() {
		
		for (int i = 1; i <= 4; ++i) {
 		
			System.out.println("i = " + i);
  		
  			// inner loop
  			for(int j = 1; j <=2; ++j) {
   				System.out.println("  j = " + j);
  			}

		}
	}

	public static void main(String[] args) {
		runNestedLoops();
	}

}
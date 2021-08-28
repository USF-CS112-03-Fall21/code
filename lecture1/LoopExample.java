public class LoopExample {
	
  public static void printNumbers() {
     for (int k = 0; k < 10; k++) {
     	if (k % 2 == 0) {
        	System.out.println(k);
        }
     }

  }

  public static void main(String[] args) {
     printNumbers();
  }

}
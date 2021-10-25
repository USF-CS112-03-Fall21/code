import java.util.Iterator;

public class ToyBox implements Iterable<String> {
	private String[] toys;
	private int size;
	
	public ToyBox() {
		this.toys = new String[10];
		this.size = 0;
	}
	public ToyBox(String[] newToys) {
	        this.toys = newToys;
	        this.size = toys.length;
	    }
	public void add(String toy) {
		toys[size] = toy;
		size++;
		
	}
	
	public ToyIterator iterator() {
		ToyIterator it = new ToyIterator();
	    return it;
	}
	
	class ToyIterator implements Iterator<String> {
		private int currentIndex = 0;

	     public boolean hasNext() {
	         boolean b = currentIndex < size && (toys[currentIndex] != null);
	       	//System.out.println(currentIndex + " " + b);
	         return b;
	     }
	     public String next() {
	         String nextElem = toys[currentIndex];
	         currentIndex++;
	         return nextElem;
	     }

	 }// inner class MyIterator
	    
   public static void main(String[] args) {
	    	ToyBox box = new ToyBox();
	    	box.add("bear");
	    	box.add("car");
	    	box.add("lego");
	    	box.add("puzzle");
	    	
	    	// Iterate over the toys using iterator explicitly
	    	Iterator<String> it = box.iterator();
	    	while (it.hasNext()) {
	    		String s = it.next();
	    		System.out.println(s);
	    	}
	    	System.out.println("");
	    	// another way to iterate over the toys:
	    	// Uses iterator implicitly
	    	for (String toy: box) {
	    		System.out.println(toy);
	    	}
	    	
	    	
	    }
	}
	

public class AlienY implements Moveable {
 	private double x, y; 

	public AlienY() {
   		this.x = 0;
   		this.y = 0;
   	}

	public void move() {
		y -= 10;
   }

   public String toString() {
   		return x + " " + y;
   }
}




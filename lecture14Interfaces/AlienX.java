public class AlienX implements Moveable {
   private double x, y; //current position

   public AlienX() {
   		this.x = 0;
   		this.y = 0;
   }

   public void move() {
		x  += 2;
   }

   public String toString() {
   		return x + " " + y;
   }
}

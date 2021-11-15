
public class Square {

	private double side;
	
	public Square() {
		
	} //end empty-argument constructor
	
	public Square( double s) {
		side = s;
	} //end preferred constructor
	
	public double getSide() {
		return side;
	} //end getSide

	public void setSide(double side) {
		this.side = side;
	} //end setSide

	public double getArea () {
		return side*side;
	} //end getArea

	@Override
	public String toString() {
		return "Square [side=" + side + ", Area=" + getArea() + "]";
	} //end toString
	
} //end class

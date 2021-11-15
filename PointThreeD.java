
public class PointThreeD {

	private double xPoint;
	private double yPoint;
	private double zPoint;
	
	public PointThreeD() {
		
	} //end empty-argument constructor
	
	public PointThreeD(double x, double y, double z) {
		xPoint = x;
		yPoint = y;
		zPoint = z;
	} //end preferred constructor

	public double getXPoint() {
		return xPoint;
	} //end getXPoint

	public void setXPoint(double xPoint) {
		this.xPoint = xPoint;
	} //end setXPoint

	public double getYPoint() {
		return yPoint;
	} //end getYPoint

	public void setYPoint(double yPoint) {
		this.yPoint = yPoint;
	} //end setYPoint

	public double getZPoint() {
		return zPoint;
	} //end getZPoint

	public void setZPoint(double zPoint) {
		this.zPoint = zPoint;
	} //end setZPoint

	@Override
	public String toString() {
		return "PointThreeD [xPoint=" + xPoint + ", yPoint=" + yPoint + ", zPoint=" + zPoint + "]";
	} //end toString
	
	
} //end class


import arrayList.*;

public class ListApp {

	public static void main(String[] args) {
	
		//creation & test of String array
		ArrayList<String> stringList = new ArrayList<String>(5);
		stringList.addItem("Dog");
		stringList.addItem("Cat");
		stringList.addItem("Elephant");
		stringList.addItem("Rocks");
		stringList.addItem("Trees");
		
		
		System.out.println("StringList contains: ");
		System.out.println(stringList.toString());
		
		
		//creation & test of square array
		ArrayList<Square> squareList = new ArrayList<Square> (4);
		Square sq1 = new Square (12);
		Square sq2 = new Square (10);
		Square sq3 = new Square (9);
		Square sq4 = new Square (15);
		squareList.addItem(sq1);
		squareList.addItem(sq2);
		squareList.addItem(sq3);
		squareList.addItem(sq4);
		
		System.out.println("SquareList contains: ");
		System.out.println(squareList.toString());
		System.out.println(sq1.toString());
		
		//creation & test of point array
		ArrayList<PointThreeD> pointList = new ArrayList<PointThreeD> (6);
		PointThreeD pd1 = new PointThreeD (2.5, 3.1, 1.2);
		PointThreeD pd2 = new PointThreeD (2.7, 4.1, 5.2);
		PointThreeD pd3 = new PointThreeD (2.4, 7.1, 3.2);
		PointThreeD pd4 = new PointThreeD (8.0, 5.1, 3.2);
		PointThreeD pd5 = new PointThreeD (0.5, 8.1, 1.4);
		PointThreeD pd6 = new PointThreeD (1.5, 6.1, 1.0);
		pointList.addItem(pd1);
		pointList.addItem(pd2);
		pointList.addItem(pd3);
		pointList.addItem(pd4);
		pointList.addItem(pd5);
		pointList.addItem(pd6);
		
		System.out.println("PointList contains: ");
		System.out.println(pointList.toString());
		System.out.println(pd4.toString());
		
	} //end main

} //end class

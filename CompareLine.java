/**
 * *********************************************************
 * Purpose: Ability to work with java Programming Construct.
 * @author Ganesh Gavhad
 * @version 1.0
 ***********************************************************
 */

package linecomparison;

/**
 * CompareLine is main Class Of Program
 */
public class CompareLine {
	private double x1;
	private double y1;
	private double x2;
	private double y2;
	private double a1;
	private double b1;
	private double a2;
	private double b2;

	/**
	 * Constructor of class
	 * @param x1 Coordinates of line 1
	 * @param y1 Coordinates of line 1
	 * @param x2 Coordinates of line 1
	 * @param y2 Coordinates of line 1
	 * @param a1 Coordinates of line 2
	 * @param b1 Coordinates of line 2
	 * @param a2 Coordinates of line 2
	 * @param b2 Coordinates of line 2
	 */

	public CompareLine(double x1, double y1, double x2, double y2, double a1, double b1, double a2, double b2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.a1 = a1;
		this.b1 = b1;
		this.a2 = a2;
		this.b2 = b2;
	}

	/**
	 * @return lengthOfLine1
	 * @lengthForLine1 is a method for line 2 coordinates And calculating length of
	 *                 line 2
	 */
	public double lengthForLine1() {
		double lengthOfLine1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		return lengthOfLine1;

	}

	/**
	 * @return Length of line 2
	 * @lengthForLine2 is a method for line 2 coordinates And calculating length of
	 *                 line 2
	 */

	public double lengthForLine2() {

		double lengthOfLine2 = Math.sqrt(Math.pow((a2 - a1), 2) + Math.pow((b2 - b1), 2));
		return lengthOfLine2;
	}

	/**
	 * @equalityOfLength is a method for checking equality of two length using java
	 *                   equal method
	 */

	public void equalityOfLength() {
		double line1 = lengthForLine1();
		String s1 = Double.toString(line1);
		double line2 = lengthForLine2();
		String s2 = Double.toString(line2);
		if (s1.equals(s2))
			System.out.println("Both lines are same in length");
		else
			System.out.println("Both the lines are different in length");
	}

	/**
	 * @compareLength this is a method for comparing length of two line as string
	 *                using compareTo method of java.
	 */

	public void compareLength() {
		double line1 = lengthForLine1();
		String s1 = Double.toString(line1);
		double line2 = lengthForLine2();
		String s2 = Double.toString(line2);
		if (s1.compareTo(s2) < 0) {
			System.out.println("Length of Line 1 : " + s1 + " is less than length of line 2 : " + s2);
			System.out.println();
			System.out.println("length of Line 1 String is less");
		} else {
			System.out.println("Length of Line 2 : " + s1 + " is greater than length of line 1 : " + s2);
			System.out.println();
			System.out.println("Length of Line 2 string is greater");
		}
	}

	/**
	 * @Main is a main method of class
	 */

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program");
		System.out.println();
		CompareLine line1 = new CompareLine(5, 1, 8, 8, 3, 5, 2, 1);
		line1.lengthForLine1();
		line1.lengthForLine2();
		line1.equalityOfLength();
		System.out.println();
		line1.compareLength();

	}

}

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
	
/**
 * @coordinatesForLine1 is a method for line 1 coordinates And calculating length of line 2.
 */
public void coordinatesForLine1() {
	double x1= 12d;
	double y1= 10d;
	double x2= 8d;
	double y2= 5d;
	double lengthOfLine1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
	System.out.println("Length of line 1 : "+lengthOfLine1);

}
/**
 * @coordinatesForLine1 is a method for line 2 coordinates And calculating length of line 1.
 */
public void coordinatesForLine2() {
	double x1= 11d;
	double y1= 13d;
	double x2= 7d;
	double y2= 9d;
	double lengthOfLine2 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
	System.out.println("Length of line 2 : "+lengthOfLine2);
}

/**
 * Main Method Of  Class
 */

public static void main(String[] args) {
	System.out.println("Welcome to Line Comparison Computation Program");
	CompareLine length = new CompareLine();
	length.coordinatesForLine1();	
	length.coordinatesForLine2();
	}
}

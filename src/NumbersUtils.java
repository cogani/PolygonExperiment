
public class NumbersUtils {
	
	private final static double TOLERANCE = 1.0e-5;
	
	public static boolean areEqual(double x, double y) {
		return Math.abs(x - y) < TOLERANCE;
	}
}

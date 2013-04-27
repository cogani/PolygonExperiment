import static org.junit.Assert.*;

import org.junit.Test;


public class SquareTest {

	@Test(expected=NotEnoughVerticesException.class)
	public void aSquareShouldHaveFourDifferentVertices() {
		Square square = new Square(new Vertex(1.0, 0.0), new Vertex(0.1, 5.0), 
									new Vertex(0.0, 0.0), new Vertex(0.0, 0.0));
	}
	
	@Test(expected=NotSquareException.class)
	public void whenAllSidesAreNotEqualIsNotASquare() {
		Square square = new Square(new Vertex(0.0, 0.0), new Vertex(0.0, 1.0), 
									new Vertex(1.0, 1.0), new Vertex(2.0, 0.0));
	}
	
	@Test
	public void whenItIsActuallyASquareNoExceptionIsThrown() {
		try {
			Square square = new Square(new Vertex(0.0, 0.0), new Vertex(0.0, 1.0), 
									new Vertex(1.0, 1.0), new Vertex(1.0, 0.0));
		} catch (NotEnoughVerticesException e) {
			fail("it was a square..");
		} catch (NotSquareException e) {
			fail("it was a square..");
		}
	}
}

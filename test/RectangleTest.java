import static org.junit.Assert.*;

import org.junit.Test;


public class RectangleTest {

	@Test(expected=NotEnoughVerticesException.class)
	public void aRectangleShouldHaveFourDifferentVertices() {
		Rectangle rentangle = new Rectangle(new Vertex(1.0, 0.0), new Vertex(0.1, 5.0), 
									new Vertex(0.0, 0.0), new Vertex(0.0, 0.0));
	}

	@Test(expected=NotRectangleException.class)
	public void whenOppositeSidesAreNotEqualIsNotARectangle() {
		Rectangle rentangle = new Rectangle(new Vertex(0.0, 0.0), new Vertex(0.0, 1.0), 
									new Vertex(1.0, 1.0), new Vertex(2.0, 0.0));
	}
	
	@Test(expected=NotRectangleException.class)
	public void aSquareIsNotARectangle() {
		Rectangle rentangle = new Rectangle(new Vertex(0.0, 0.0), new Vertex(0.0, 1.0), 
										new Vertex(1.0, 1.0), new Vertex(1.0, 0.0));
	}
	
	@Test
	public void whenItIsActuallyARectangleNoExceptionIsThrown() {
		try {
			Rectangle rentangle = new Rectangle(new Vertex(0.0, 0.0), new Vertex(0.0, 2.0), 
												new Vertex(1.0, 2.0), new Vertex(1.0, 0.0));
		} catch (NotEnoughVerticesException e) {
			fail("it was a rectangle..");
		} catch (NotRectangleException e) {
			fail("it was a rectangle..");
		}
	}
}

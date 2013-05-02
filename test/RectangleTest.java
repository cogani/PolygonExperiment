import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RectangleTest {

	Vertex vertexA, vertexB, vertexC, vertexD;

	@Before
	public void setup() {
		vertexA = new Vertex(0.0, 0.0);
		vertexB = new Vertex(0.0, 2.0);
		vertexC = new Vertex(1.0, 2.0);
		vertexD = new Vertex(1.0, 0.0);
	}

	@Test(expected = NotEnoughVerticesException.class)
	public void aRectangleShouldHaveFourDifferentVertices() {

		Rectangle rentangle = new Rectangle(vertexA, vertexB, vertexC, vertexC);
	}

	@Test(expected = NotRectangleException.class)
	public void whenOppositeSidesAreNotEqualIsNotARectangle() {
		Vertex vertexOppositeSideA = new Vertex(2.0, 0.0);

		Rectangle rentangle = new Rectangle(vertexA, vertexB, vertexC,
				vertexOppositeSideA);
	}

	@Test(expected = NotRectangleException.class)
	public void aSquareIsNotARectangle() {
		Vertex vertexBAlternative = new Vertex(0.0, 2.0);
		Vertex vertexCAlternative = new Vertex(2.0, 2.0);
		
		Rectangle rentangle = new Rectangle(vertexA, vertexBAlternative, vertexCAlternative, vertexD);
	}

	@Test
	public void whenItIsActuallyARectangleNoExceptionIsThrown() {
		try {
			Vertex vertexBAlternative = new Vertex(0.0, 2.0);
			Vertex vertexCAlternative = new Vertex(1.0, 2.0);
			Vertex vertexDAlternative = new Vertex(0.0, 2.0);

			Rectangle rentangle = new Rectangle(vertexA, vertexB,
					vertexC, vertexD);
		} catch (NotEnoughVerticesException e) {
			fail("it was a rectangle..");
		} catch (NotRectangleException e) {
			fail("it was a rectangle..");
		}
	}
}

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SquareTest {
	Vertex vertexA, vertexB, vertexC, vertexD;

	@Before
	public void setup() {
		vertexA = new Vertex(0.0, 0.0);
		vertexB = new Vertex(0.0, 1.0);
		vertexC = new Vertex(1.0, 1.0);
		vertexD = new Vertex(1.0, 0.0);
	}

	@Test(expected = NotEnoughVerticesException.class)
	public void aSquareShouldHaveFourDifferentVertices() {
		// Como deberia llamar a este vertice para dar mayor semantica? 
		Vertex vertexE = new Vertex(0.1, 5.0);
		
		Square square = new Square(vertexA, vertexA, vertexD, vertexE);
	}

	@Test(expected = NotSquareException.class)
	public void whenAllSidesAreNotEqualIsNotASquare() {
		// Como deberia llamar a este vertice para dar mayor semantica?
		Vertex vertexF = new Vertex(2.0, 0.0);

		Square square = new Square(vertexA, vertexB, vertexC, vertexF);
	}

	@Test
	public void whenItIsActuallyASquareNoExceptionIsThrown() {
		try {
			Square square = new Square(vertexA, vertexB, vertexC, vertexD);
		} catch (NotEnoughVerticesException e) {
			fail("it was a square..");
		} catch (NotSquareException e) {
			fail("it was a square..");
		}
	}
}

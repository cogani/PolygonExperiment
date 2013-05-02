import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;


public class TriangleTest {
	
	Vertex vertexA, vertexB, vertexC;
	
	@Before
	public void setup() {
		vertexA = new Vertex(0.0, 0.0);
		vertexB = new Vertex(0.0, 2.0);
		vertexC = new Vertex(1.0, 0.0);
	}

	@Test(expected=NotEnoughVerticesException.class)
	public void polygonsShouldHaveAtLeastThreeDifferentVertices() {
		Triangle triangle = new Triangle(vertexA, vertexA, vertexC);
	}
	
	@Test
	public void trianglesWithThreeDifferentVerticesShouldNotThrowNotEnoughVerticesException() {
		try {
			Triangle polygon = new Triangle(vertexA, vertexB, vertexC);
		} catch(NotEnoughVerticesException e) {
			fail("triangles Have Three Different Vertices");
		}
	}
}

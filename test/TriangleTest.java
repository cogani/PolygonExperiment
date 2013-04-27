import static org.junit.Assert.fail;

import org.junit.Test;


public class TriangleTest {

	@Test(expected=NotEnoughVerticesException.class)
	public void polygonsShouldHaveAtLeastThreeDifferentVertices() {
		Triangle triangle = new Triangle(new Vertex(1.0, 0.0), new Vertex(0.0, 0.0), new Vertex(0.0, 0.0));
	}
	
	@Test
	public void trianglesWithThreeDifferentVerticesShouldNotThrowNotEnoughVerticesException() {
		try {
			Triangle polygon = new Triangle(new Vertex(1.0, 0.0), new Vertex(0.0, 0.0), new Vertex(0.0, 2.0));
		} catch(NotEnoughVerticesException e) {
			fail("triangles Have Three Different Vertices");
		}
	}
}

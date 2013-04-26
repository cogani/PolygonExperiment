import java.util.ArrayList;

import org.junit.Test;


public class TriangleTest {

	@Test(expected=NotEnoughVerticesException.class)
	public void polygonsShouldHaveAtLeastThreeVertices() {
		
		ArrayList<Vertex> vertices = new ArrayList<Vertex>();
		vertices.add(new Vertex(0.0, 0.0));
		vertices.add(new Vertex(1.0, 0.0));

		Polygon2D polygon = new Triangle(vertices);
	}
}

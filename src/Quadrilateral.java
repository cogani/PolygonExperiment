
public class Quadrilateral extends Polygon2D {
	public Quadrilateral(Vertex vertex1, Vertex vertex2, Vertex vertex3, Vertex vertex4) {
		super(vertex1, vertex2, vertex3, vertex4);
		
		if(differentVertices != 4)
			throw new NotEnoughVerticesException();
	}
}

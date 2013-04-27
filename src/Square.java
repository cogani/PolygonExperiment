
public class Square extends Polygon2D {

	public Square(Vertex vertex1, Vertex vertex2, Vertex vertex3, Vertex vertex4) {
		super(vertex1, vertex2, vertex3, vertex4);
		
		if(differentVertices != 4)
			throw new NotEnoughVerticesException();
		
		if(! isRegular())
			throw new NotSquareException();
	}
}

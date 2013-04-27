
public class Square extends Quadrilateral {

	public Square(Vertex vertex1, Vertex vertex2, Vertex vertex3, Vertex vertex4) {
		super(vertex1, vertex2, vertex3, vertex4);
		
		if(! isRegular())
			throw new NotSquareException();
	}
}


public class Square extends Polygon2D {

	public Square(Vertex vertex1, Vertex vertex2, Vertex vertex3, Vertex vertex4) {
		super(vertex1, vertex2, vertex3, vertex4);
		
		if(differentVertices != 4)
			throw new NotEnoughVerticesException();
		
		if(! allSidesEqual())
			throw new NotSquareException();
	}

	boolean allSidesEqual() {
		Side firstSide = sides.get(0);
		for(int i = 1; i<sides.size(); ++i) {
			Side side = sides.get(i);
			if(! firstSide.hasSameLength(side))
				return false;
		}
		
		return true;
	}
}

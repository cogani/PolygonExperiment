public class Rectangle extends Polygon2D {
	public Rectangle(Vertex vertex1, Vertex vertex2, Vertex vertex3,
			Vertex vertex4) {
		super(vertex1, vertex2, vertex3, vertex4);

		if (differentVertices != 4)
			throw new NotEnoughVerticesException();

		if (!oppositeSidesAreEqual())
			throw new NotRectangleException();
		
		if(isRegular())
			throw new NotRectangleException();
		
		if (!oppositeSidesAreEqual())
			throw new NotRectangleException();
	}

	private boolean oppositeSidesAreEqual() {
		if (!sides.get(0).hasSameLength(sides.get(2)))
			return false;
		if (!sides.get(1).hasSameLength(sides.get(3)))
			return false;
		return true;
	}
}

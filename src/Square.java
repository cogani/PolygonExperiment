
public class Square extends Polygon2D {

	public Square(Vertex vertex1, Vertex vertex2, Vertex vertex3, Vertex vertex4) {
		super(vertex1, vertex2, vertex3, vertex4);
		
		if(differentVertices != 4)
			throw new NotEnoughVerticesException();
		
		if(! allSidesEqual())
			throw new NotSquareException();
	}

	boolean allSidesEqual() {
		
		Vertex [] verticesArray =  (Vertex[]) vertices.toArray(new Vertex[0]);
		
		double side1 = verticesArray[0].distance(verticesArray[1]);
		System.out.println(side1);
		double side2 = verticesArray[1].distance(verticesArray[2]);
		System.out.println(side2);
		double side3 = verticesArray[2].distance(verticesArray[3]);
		System.out.println(side2);
		double side4 = verticesArray[3].distance(verticesArray[0]);
		System.out.println(side4);
		
		if(Math.abs(side1 - side2) > 1.0e-5)
			return false;
		
		if(Math.abs(side1 - side3) > 1.0e-5)
			return false;
		
		if(Math.abs(side1 - side4) > 1.0e-5)
			return false;
		
		return true;
	}
}

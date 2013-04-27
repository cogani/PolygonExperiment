
public class Side {
	private Vertex vertex1,vertex2;
	private double length;

	public Side(Vertex vertex1, Vertex vertex2) {
		this.vertex1 = vertex1;
		this.vertex2 = vertex2;
		this.length = vertex1.distance(vertex2);
	}
	
	public boolean hasSameLength(Side other){
		return NumbersUtils.areEqual(length, other.length);
	}

	
	

	
	

}


public class Vertex {

	private final double TOLERANCE = 1.0e-5;
	
	private double x = 0.0;
	private double y = 0.0;

	public Vertex(double x, double y) {
		this.x = x;
		this.y = y;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(x);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(y);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		if (getClass() != obj.getClass())
			return false;
		
		Vertex other = (Vertex) obj;
		
		if (Math.abs(x - other.x) > TOLERANCE)
			return false;
		
		if (Math.abs(y - other.y) > TOLERANCE)
			return false;
		
		return true;
	}
}

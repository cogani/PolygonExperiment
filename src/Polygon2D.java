import java.util.ArrayList;


public class Polygon2D {

	public Polygon2D(ArrayList<Vertex> vertices) {
		if(vertices.size() < 3)
			throw new NotEnoughVerticesException();
	}

}

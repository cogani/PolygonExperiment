import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public abstract class Polygon2D {

	protected int differentVertices;
	protected List<Side> sides;

	public Polygon2D(Vertex... vertices) {
		Set<Vertex> verticesSet = obtainDifferentVertices(vertices);

		differentVertices = verticesSet.size();

		if (differentVertices < 3)
			throw new NotEnoughVerticesException();

		createSides(verticesSet);
	}
	
	public boolean isRegular() {
		Side firstSide = sides.get(0);
		for(int i = 1; i<sides.size(); ++i) {
			Side side = sides.get(i);
			if(! firstSide.hasSameLength(side))
				return false;
		}
		
		return true;
	}

	private Set<Vertex> obtainDifferentVertices(Vertex... vertices) {
		Set<Vertex> verticesSet = new LinkedHashSet<Vertex>();
		this.sides = new ArrayList<Side>();

		for (Vertex vertex : vertices)
			verticesSet.add(vertex);

		return verticesSet;
	}

	private void createSides(Set<Vertex> verticesSet) {
		Vertex[] verticesArray = (Vertex[]) verticesSet.toArray(new Vertex[0]);

		for (int i = 1; i < verticesArray.length; ++i) {
			this.sides.add(new Side(verticesArray[i - 1], verticesArray[i]));
		}

		this.sides.add(new Side(verticesArray[verticesArray.length - 1],
				verticesArray[0]));
	}
}

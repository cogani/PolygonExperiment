import java.util.LinkedHashSet;
import java.util.Set;


public abstract class Polygon2D {
	
	protected int differentVertices;
	protected Set<Vertex> vertices;
	
	public Polygon2D(Vertex ... vertices) {
       this.vertices = new LinkedHashSet<Vertex>();

       for (Vertex vertex : vertices)
           this.vertices.add(vertex);
       
       differentVertices = this.vertices.size();
       
       if(differentVertices < 3)
    	   throw new NotEnoughVerticesException();
	}
}

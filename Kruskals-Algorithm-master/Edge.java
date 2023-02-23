import java.awt.Point;
import java.util.ArrayList;

public class Edge implements Comparable
{
    Vertex v1; 
    Vertex v2; 
    boolean hovered; 
    double weight; 

    public Edge(Vertex x, Vertex y) { 
        // constructor when given two vertices
        v1 = x;
        v2 = y;
        hovered = false;
        weight = 1.0; // default edge weight is 1
    }

    public int compareTo(Object o) {
        // overriding
       return  (this.weight < ((Edge) o).weight ? -1 : (this.weight == ((Edge) o).weight ? 0 : 1));
   }

    public Point midPoint() {
        // find the midpoint of an edge to add the weight label
        return new Point((int)(0.5 * (this.v1.p.x + this.v2.p.x)),
        		(int)(0.5 * (this.v1.p.y + this.v2.p.y)));
    }
} 

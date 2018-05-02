import java.awt.Shape;

public interface ViewStrategy 
{
	public Shape createShape();
	public Shape createShape(double x, double y, double w, double h);
}

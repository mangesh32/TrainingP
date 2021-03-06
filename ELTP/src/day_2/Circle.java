package day_2;

public class Circle extends TwoDimentionalShape {
	private double radius;

	public Circle(double radius) {
		super("Circle");
		this.radius=radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public void calculateArea() {
		setArea(Math.PI*radius*radius);
		
	}

	@Override
	public void calculatePerimeter() {
		setPerimeter(2*Math.PI*radius);
		
	}

	

}

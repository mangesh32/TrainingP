package day_2;

public abstract class TwoDimentionalShape extends Shape {
	
	private double area,perimeter;


	public TwoDimentionalShape(String name) {
		super(name);
	}

	public double getArea() {
		return area;
	}

	protected void setArea(double area) {
		this.area = area;
	}

	public double getPerimeter() {
		return perimeter;
	}

	protected void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}
	
	
	abstract public void calculateArea();
	abstract public void calculatePerimeter();
	
}

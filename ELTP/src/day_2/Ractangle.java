package day_2;

public class Ractangle extends TwoDimentionalShape {
	private double hight,width;
	public Ractangle(double height,double width) {
		super("Ractangle");
		this.hight=height;
		this.width=width;
	}
	public double getHight() {
		return hight;
	}
	public void setHight(double hight) {
		this.hight = hight;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	@Override
	public void calculateArea() {
		setArea(hight*width);
	}
	@Override
	public void calculatePerimeter() {
		setPerimeter(2*(hight+width));
		
	}
	
	
	

}

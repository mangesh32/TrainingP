package day_2;

public class Sphere extends ThreeDimentionalShape {
	private double radius;

	public Sphere( double radius) {
		super("Sphere");
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public void calculateVolume() {
		setVolume((4/3)*Math.PI*Math.pow(radius, 3));
	}

	@Override
	public void calculateSurfaceArea() {
		setSurfaceArea(4*Math.PI*Math.pow(radius, 2));

	}

}

package day_2;

public class Cube extends ThreeDimentionalShape {
	private double a;	

	public Cube(double a) {
		super("Cube");
		this.a = a;
	}


	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}
	
	@Override
	public void calculateVolume() {
		setVolume(Math.pow(a, 3));

	}

	@Override
	public void calculateSurfaceArea() {
		setSurfaceArea(6*Math.pow(a, 2));

	}


}

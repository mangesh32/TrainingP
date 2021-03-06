package day_2;

public abstract class ThreeDimentionalShape extends Shape {
	
	private double volume,surfaceArea;
	
	public ThreeDimentionalShape(String name) {
		super(name);
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public double getSurfaceArea() {
		return surfaceArea;
	}

	public void setSurfaceArea(double surfaceArea) {
		this.surfaceArea = surfaceArea;
	}

	abstract public void calculateVolume();
	abstract public void calculateSurfaceArea();

}

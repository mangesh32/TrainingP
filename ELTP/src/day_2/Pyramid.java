package day_2;

public class Pyramid extends ThreeDimentionalShape {
	private double l,w,h;

	public Pyramid(double l, double w, double h) {
		super("Pyramid");
		this.l = l;
		this.w = w;
		this.h = h;
	}

	@Override
	public void calculateVolume() {
		setVolume((1.00/3.00)*l*w*h);

	}

	@Override
	public void calculateSurfaceArea() {
		setSurfaceArea(l*w+l*(Math.sqrt(Math.pow(w/2, 2))+h*h)+w*(Math.sqrt(Math.pow(l/2, 2)*h*h)));

	}

	public double getL() {
		return l;
	}

	public void setL(double l) {
		this.l = l;
	}

	public double getW() {
		return w;
	}

	public void setW(double w) {
		this.w = w;
	}

	public double getH() {
		return h;
	}

	public void setH(double h) {
		this.h = h;
	}


	

}

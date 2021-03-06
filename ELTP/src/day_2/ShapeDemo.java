package day_2;

public class ShapeDemo {
	public static void main(String[] args) {
		
		Circle circle=new Circle(5);
		Ractangle ractangle=new Ractangle(4, 5);
		Triangle triangle=new Triangle(4, 4, 5);
		Sphere sphere=new Sphere(5);
		Pyramid pyramid=new Pyramid(4,4,5);
		Cube cube=new Cube(3);
		
		shapeManager(circle);
		shapeManager(ractangle);
		shapeManager(triangle);
		shapeManager(sphere);
		shapeManager(cube);
		shapeManager(pyramid);
		
	}
	
	public static void shapeManager(Shape s){
		
		if(s instanceof TwoDimentionalShape){
			((TwoDimentionalShape) s).calculateArea();
			((TwoDimentionalShape) s).calculatePerimeter();
			System.out.println(String.format("\n|%20s","NAME    |")+String.format("%15s",s.getName())+" |");
			System.out.println(String.format("|%20s","PERIMETER    |")+String.format("%15s",String.format("%.2f", ((TwoDimentionalShape) s).getPerimeter()))+" |");
			System.out.println(String.format("|%20s","AREA    |")+String.format("%15s",String.format("%.2f", ((TwoDimentionalShape) s).getArea()))+" |");
		}
		if(s instanceof ThreeDimentionalShape){
			((ThreeDimentionalShape) s).calculateSurfaceArea();
			((ThreeDimentionalShape) s).calculateVolume();
			System.out.println(String.format("\n|%20s","NAME    |")+String.format("%15s",s.getName())+" |");
			System.out.println(String.format("|%20s","SURFACE AREA    |")+String.format("%15s",String.format("%.2f", ((ThreeDimentionalShape) s).getSurfaceArea()))+" |");
			System.out.println(String.format("|%20s","VOLUME    |")+String.format("%15s",String.format("%.2f", ((ThreeDimentionalShape) s).getVolume()))+" |");
		}
		
	}
	
	
}

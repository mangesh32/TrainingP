package day_2;

public abstract class Shape {
	private String name;
	

	public Shape(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

		
	
}

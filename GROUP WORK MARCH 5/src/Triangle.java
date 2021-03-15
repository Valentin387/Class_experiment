
public class Triangle extends Figure {

	//A
	private float base;
	private float height;
		
	public Triangle(float a , float b) {
		base = a;
		height = b; 
	}
	
	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public void area () {
		
		float r = base * height/2;
		System.out.println(r);
	}
	
}

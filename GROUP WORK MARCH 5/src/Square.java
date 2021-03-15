
public class Square extends Figure{
	
	//A
	private float base_1;
	private float base_2;
	
	
	public Square(float a , float b) {
		base_1 = a;
		base_2 = b; 
	}
	
	public float getBase_1() {
		return base_1;
	}


	public void setBase_1(float base_1) {
		this.base_1 = base_1; 
	}


	public float getBase_2() {
		return base_2;
	}


	public void setBase_2(float base_2) {
		this.base_2 = base_2;
	}


	public void area () {
		
		float r = base_1 * base_2;
		System.out.println(r);
	}

}

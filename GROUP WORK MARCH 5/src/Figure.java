
public class Figure {
	
	//Attributes
	private int number_1;
	private int number_2;
	
	//Behavior
	
	public int getNumber_1() {
		return number_1;
	}

	public void setNumber_1(int number_1) {
		this.number_1 = number_1;
	}

	public int getNumber_2() {
		return number_2;
	}

	public void setNumber_2(int number_2) {
		this.number_2 = number_2;
	}

	public void area () {
		
		int r = number_1 + number_2;
		System.out.println(r);
	}
	
	public void delete() {
		System.out.println("Figure deleted");
	}
	
	public void draw(float x, float y) {
System.out.println("Drawing in ("+x+" ; "+y+")\n");
	}
	
	public void to_move(float x, float y) {
		delete();
		draw(x,y);
	}
}

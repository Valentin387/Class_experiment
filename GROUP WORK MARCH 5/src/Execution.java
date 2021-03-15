
public class Execution {
	
	
	public void action() {

		int size = 2; 
		
		Figure vec[] = new Figure[size];
		vec[0] = new Square(5,3);
		vec[1] = new Triangle(5,3);
	
		vec[0].area();
		vec[1].area();
		vec[0].to_move(3.4f, 7.44f);
		
	}

}

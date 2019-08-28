package cars;

public class Sport extends Cars implements Comfort, Loud {
	public static int number = 0;

	public Sport(String type, String color, boolean newCar) {
		super(type, color, newCar);
		number++;
	}

	public void Extras() {
		// TODO Auto-generated method stub
		
	}

	public Sport(String type, String color) {
		super(type, color);
		// TODO Auto-generated constructor stub
	}

	public Sport() {
		super("Sport");
		// TODO Auto-generated constructor stub
	}

	public Sport(String type) {
		super(type, "Yellow");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fast() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void slow() {
		// TODO Auto-generated method stub
		
	}



}

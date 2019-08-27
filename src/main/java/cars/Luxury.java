package cars;

public class Luxury extends Cars implements Comfort {
	public static int number =0;
	public Luxury(String type, String color, boolean newCar) {
		super(type, color, newCar);
	}

	public Luxury() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Luxury(String type, String color) {
		super(type, color);
		// TODO Auto-generated constructor stub
	}

	public Luxury(String type) {
		super(type);
		// TODO Auto-generated constructor stub
	}

	public void Extras() {
		// TODO Auto-generated method stub
		
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

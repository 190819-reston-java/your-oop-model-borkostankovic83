package cars;

import java.io.Serializable;

public class Luxury extends Cars implements Serializable, Comfort {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static int numberOfCars =0;
	
	public Luxury(String type, String color, boolean newCar, int mpg) {
		super(type, color, newCar, mpg);
		numberOfCars++;
	}
	public Luxury(String type, String color, boolean newCar) {
		super(type, color, newCar);
	}


	public Luxury(String type, String color) {
		super(type, color);
		// TODO Auto-generated constructor stub
	}

	public Luxury(String type) {
		super(type);
		// TODO Auto-generated constructor stub
	}
	public Luxury() {
		super("Luxury");
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

package cars;

import java.io.Serializable;

public class Sport extends Cars implements Serializable,Comfort, Loud {
	
	
	public static int numberOfCars = 0;
	
	public Sport(String type, String color, boolean newCar, int mpg) {
		super(type, color, newCar, mpg);
		numberOfCars++;
	}
	
	public Sport(String type, String color, boolean newCar) {
		this(type, color, newCar, 28);
		
	}


	public Sport(String type, String color) {
		this(type, color,true);
		// TODO Auto-generated constructor stub
	}
	public Sport(String type) {
		this(type, "White");
		// TODO Auto-generated constructor stub
	}

	public Sport() {
		this("Sport");
		// TODO Auto-generated constructor stub
	}


	

	public void Extras() {
		// TODO Auto-generated method stub
		
	}
	public void printNumberOfCars() {
		if (numberOfCars == 0) {
			System.out.println("There's no cars");
		} else {
			System.out.println("There are: " + numberOfCars + " cars");
		}
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

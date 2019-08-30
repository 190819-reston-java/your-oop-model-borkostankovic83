package cars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.revature.car.Car;



public class CarsDriver {
	
	public static void main(String[] args) {
		
		
	
			System.out.println("Defult color for Sport cars: " + new Sport().getColor());	
			System.out.println("Defult color for Luxury cars: " + new Luxury().getColor());
	    	System.out.println(" ");
			System.out.println(new Sport());
			System.out.println(new Luxury());
			
			
			System.out.println(new Sport().getType());		
			System.out.println(new Luxury().getType());
			System.out.println(" ");
						
			Luxury b = new Luxury("BMW");
			
			b.setColor("Black");
			// Getting a color System.out.println(b.getColor());
			System.out.println("The "+b.getType()+" is " +b.getColor()+" color");
			b.letherSeats();
			System.out.println(" ");
		
			try {
			Sport c = new Sport("MUSTANG");
			
			
			c.setMpg(-20);
			System.out.println(c.getMpg());
			c.setColor("Yellow");
			// getting color for sport car System.out.println(c.getColor());
			System.out.println("The "+c.getType()+" is " +c.getColor()+" color");
			c.SportSeats(); //
			c.printNumberOfCars();
			System.out.println(" ");
			}catch(NegativeMpgException e) {
				System.out.println("Sorry, cant set negative speed");
				System.out.println("received: " + e.getMessage());
			
				
				
		}
		
		



		
	}

}

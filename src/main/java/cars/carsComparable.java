package cars;

import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class carsComparable {

public static void main(String[] args) {
				
		sortCars();
}

private static void sortCars() {
	List<Sport> sportList = new ArrayList<Sport>();
	sportList.add(new Sport("Ford", "black", true, 21));
	sportList.add(new Sport("Mustang", "red", true, 20));
	sportList.add(new Sport("Porche", "red", true, 23));
	sportList.add(new Sport("Bmw", "silver", true, 25));
	
	System.out.println("Unsorted ArrayList: "+sportList);
	
	List<Cars> carsList = new ArrayList<Cars>();
	Cars a = new Luxury("Bmw", "silver", true, 25);
	Cars b = new Luxury("Porche", "red", true, 23);
	Cars d = new Luxury("Mazdaa", "blue", true, 26);
	
	
	b.setColor("Black");
	carsList.add(a);
	carsList.add(b);
	carsList.add(d);
	carsList.add(b);
	System.out.println(carsList);
	//Collections.sort(carsList);
	Collections.reverse(sportList);
	//Queue<Sport> sportCarQueue = new LinkedList<Sport>(sportList);
	System.out.println(carsList);
	//System.out.println("Unsorted Queue: "+sportCarQueue);
	//;
}

public carsComparable() {
	super();
	// TODO Auto-generated constructor stub
}
}

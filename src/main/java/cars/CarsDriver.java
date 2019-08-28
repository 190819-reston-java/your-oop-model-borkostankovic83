package cars;


public class CarsDriver {

	public static void main(String[] args) {
		
		System.out.println(new Sport().getColor());	
		System.out.println(new Luxury().getColor());
		System.out.println(" ");

		System.out.println(new Sport().getType());		
		System.out.println(new Luxury().getType());
		System.out.println(" ");
		
		System.out.println(new Sport().isNewCar());
		System.out.println(" ");
		
		Luxury b = new Luxury("BMW");
		b.setColor("Black");
		System.out.println(b.getColor());
		b.letherSeats();
		System.out.println(" ");
		
		
		Sport c = new Sport("MUSTANG");
		c.setColor("Yellow");
		System.out.println(c.getColor());
		c.SportSeats(); //
		System.out.println(" ");



		
	}

}

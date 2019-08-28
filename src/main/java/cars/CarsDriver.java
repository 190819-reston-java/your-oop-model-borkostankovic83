package cars;


public class CarsDriver {

	public static void main(String[] args) {
		
		System.out.println(new Sport().getColor());
		
		System.out.println(new Luxury().getColor());		
		System.out.println(new Sport().getType());		
		System.out.println(new Luxury().getType());
		
		Luxury b = new Luxury("BMW");
		b.letherSeats();
		b.setColor("Black");
		System.out.println(b.getColor());
		
		
		Sport c = new Sport("MUSTANG");
		c.setColor("yellow");
		System.out.println(c.getColor());
		c.SportSeats(); // 
		
	}

}

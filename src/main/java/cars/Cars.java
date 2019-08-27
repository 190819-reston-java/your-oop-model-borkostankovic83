package cars;

public  abstract class Cars {
	private String type;
	private String color;
	private boolean newCar;
	
	public Cars(String type,String color, boolean newCar) {
		super();
		this.type = type;
		this.color = color;
		
	}
	public Cars(String type,String color) {
		this(type, color, true);
		
	}
	public Cars(String type) {
		this(type, "White");
		
		
	}
	public Cars() {
		this("Sport");
		
	}
	public void letherSeats() {
		System.out.println(this.type + " has lether seats!");
	}
	
	public void SportSeats() {
		System.out.println(this.type + " has Sport seats!");
	}
	
	public abstract void fast();
	
	public abstract void slow();
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * @return the newCar
	 */
	public boolean isNewCar() {
		return newCar;
	}
	/**
	 * @param newCar the newCar to set
	 */
	public void setNewCar(boolean newCar) {
		this.newCar = newCar;
	}
}

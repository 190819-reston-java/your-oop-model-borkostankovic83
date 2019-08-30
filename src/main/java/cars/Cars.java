package cars;


public abstract class Cars {
	
	private String type;
	private String color;
	private boolean newCar;
	private int mpg;
	
	public Cars(String type,String color, boolean newCar, int mpg) {
		super();
		this.type = type;
		this.color = color;
		this.newCar = newCar;	
		this.mpg = mpg;
	}
	public Cars(String type,String color, boolean newCar) {
		this(type, color, true, 25);	
	}
	
	/**
	 * @return the speed
	 */
	public int getMpg() {
		return mpg;
	}
	/**
	 * @param speed the speed to set
	 */
	public void setMpg(int mpg) {
		if(mpg < 0) {
			throw new NegativeMpgException();
		}
		this.mpg = mpg;
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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + (newCar ? 1231 : 1237);
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cars other = (Cars) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (newCar != other.newCar)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	public void SportSeats() {
		System.out.println(this.type + " has Sport seats!");
	}
	
	public abstract void fast();
	
	public abstract void slow();
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isNewCar() {
		return newCar;
	}
	
	public void setNewCar(boolean newCar) {
		this.newCar = newCar;
	}
	@Override
	public String toString() {
		return "Cars [type=" + type + ", color=" + color + ", newCar="
	+ newCar + ", Average MPG="+mpg+"]";
	}

}

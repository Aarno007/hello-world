package  files;

public class day08_6{
	public static void main(String []args){
		Vehicle [] v = {
			new Car("jiefang","baise",5),
			new Truck("gongfeng","heise",9)
		};
		((Car)v[0]).show();
		((Truck)v[1]).show();
	}
}

class Vehicle{
	private String brand;
	private String color;
	public void setBrand(String brand){
		this.brand = brand;
	}
	public String getBrand(){
		return brand;
	}
	public void setColor(String color){
		this.color = color;
	}
	public String getColor(){
		return color;
	}
	public Vehicle(){}
	public Vehicle(String brand,String color){
		this.brand = brand;
		this.color = color;
	}
	public void run(){
		System.out.println("runing.........");
	}
	public void show(){
		System.out.println(getBrand()+getColor());
	}
}

class Car extends Vehicle{
	private int seats;
	public void setSeats(int seats){
		this.seats = seats;
	}
	public int getSeats(){
		return seats;
	}
	public Car(){}
	public Car(String brand,String color,int seats){
		super(brand,color);
		this.seats = seats;
	}
	public void show(){
		System.out.println(getBrand()+getColor()+getSeats());
	}
}

class Truck extends Vehicle{
	private int load;
	public void setLoad(){
		this.load = load;
	}
	public int getLoad(){
		return load;
	}
	public Truck(){}
	public Truck(String brand,String color,int load){
		super(brand,color);
		this.load = load;
	}
	public void show(){
		System.out.println(getBrand()+getColor()+getLoad());
	}
}
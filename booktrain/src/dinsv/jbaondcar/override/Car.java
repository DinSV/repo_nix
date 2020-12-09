package dinsv.jbaondcar.override;

public class Car {

	String model;
	String color;
	double capa;
	int waight;
	int speed;
	
	public void start() {
		System.out.println("Vrruumm... Vrumm... VrrRRUUUUMMM...");
	}
	public void stop() {
		System.out.println("phphphph pupf pupf");
		}
	public int drive(int howlong) {
		int distance = speed * howlong;
		return distance;
	}
}

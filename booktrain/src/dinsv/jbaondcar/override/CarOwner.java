package dinsv.jbaondcar.override;

public class CarOwner {

	public static void main(String[] args) {
		Car usCar = new Car();
		usCar.model = "Toyota";
		usCar.color = "Blue";
		usCar.capa = 1.7;
		usCar.waight = 1900;
		usCar.speed = 90;
		usCar.start();
		System.out.println(usCar.drive(6));
		usCar.stop();
		System.out.println(" ");
		
		Car jCar = new BondCar();
		jCar.model = "Mesedes";
		jCar.color = "Blac";
		jCar.capa = 3.7;
		jCar.waight = 2500;
		jCar.speed = 190;
		jCar.start();
		System.out.println(jCar.drive(6));
		jCar.stop();
		
	}

}

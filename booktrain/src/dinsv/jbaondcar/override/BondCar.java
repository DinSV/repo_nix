package dinsv.jbaondcar.override;

public class BondCar extends Car{
	@Override							// pereopredelenie mitoth drive 
	public int drive(int howlong) {
		int bonddistance = 250 * howlong;
		return bonddistance;
	}
}

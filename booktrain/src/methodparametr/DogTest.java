class DogTest {
	public static void main(String[] args) {
		Dog one = new Dog();
		one.size = 70;
		Dog two = new Dog();
		two.size = 5;
		Dog three = new Dog();
		three.size = 45;

		one.bark(3);
		two.bark(5);
		three.bark(2);
	}
}
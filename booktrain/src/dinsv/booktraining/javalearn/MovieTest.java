public class MovieTest {
	public static void main(String[] args) {
		Movie one = new Movie();
		one.title = "How to lose on the stock exchange";
		one.genre = "Tragedy";
		one.rating = -3;

		Movie two = new Movie();
		two.title = "Lost on Office";
		two.genre = "Comedy";
		two.rating = 5;

		Movie three = new Movie();
		three.title = "Byte club";
		three.genre = "Funny tragedy";
		three.rating = 127;
		System.out.println(one.title + " " + one.genre + " " + one.rating);
		System.out.println(two.title + " " + two.genre + " " + two.rating);
		System.out.println(three.title + " " + three.genre + " " + three.rating);
	}
}
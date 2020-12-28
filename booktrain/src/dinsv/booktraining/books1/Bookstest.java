package dinsv.booktraining.books1;

public class Bookstest {
	public static void main(String[] args) {
		Books1[] myBooks = new Books1[3];
		myBooks[0] = new Books1();
		myBooks[1] = new Books1();
		myBooks[2] = new Books1();
		int x = 0;
		myBooks[0].title = "Product Java";
		myBooks[1].title = "Java Getsbi";
		myBooks[2].title = "Collection of recipeces Java";
		
		myBooks[0].autor = "Bob";
		myBooks[1].autor = "Sju";
		myBooks[2].autor = "Jan";
		
		while(x < 3) {
			System.out.print(myBooks[x].title);
			System.out.print(", автор ");
			System.out.println(myBooks[x].autor);
			x++;
		}
	}
}

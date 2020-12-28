package dinsv.booktraining.magnets;

public class TestArrays {

	public static void main(String[] args) {
		int y = 0;
		
		int[] index = new int[4];
		index[0] = 1;
		index[1] = 3;
		index[2] = 0;
		index[3] = 2;
		
		String[] islands = new String[4];
		islands[0] = "Bermuds";
		islands[1] = "Fidje";
		islands[2] = "Azore";
		islands[3] = "Kosumel";		
		int ref;
		
		while(y < 4) {
			ref = index[y];
			System.out.print("islands = ");
			System.out.println(islands[ref]);
			y++;
		}
	}

}

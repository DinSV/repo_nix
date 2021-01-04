class Dog {
	int size;
	String name;
	int numOfBarks;

	void bark(int numOfBarks) {
		while(numOfBarks > 0) {
			if(size > 60) {
				System.out.println("Wvow Wvow!");
			} else if(size > 15) {
				System.out.println("RRrrr Af Af Rrrr!");
			} else {
				System.out.println("tjafk tjafk tjafk tjafk");
			}
			numOfBarks--;
		}
	}
}
package dinsv.booktraining.phrasematic;

public class PraseOMatic {

	public static void main(String[] args) {
		// создаю три набора слов для выбора
		String[] wordListOne = {"round the clock", "three-link", "30000 feet", "matual", "win-win",
				"frontend", "web-based", "penetrating", "smart", "six sigma", "critical path metod",
				"dynamic"};
		String[] wordListTwo = {"authorized", "difficult", "pure prodct", "oriented", "central",
				"distributed", "clastered", "branded", "non-standard mind", "positioned", "network",
				"focused", "profitable used", "aligned", " aimed at", "general", "joint", "accelerated"};
		String[]wordListThree = {"process", "unloading point", "way out", "structure type", "talant",
				"an approach", "level of attention gined", "portal", "time period", "overview", "sample",
				"destination"};
		//вычисляю сколько слов в каждом списке
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;
		//геренация трех случайных чсел
		int rand1 = (int) (Math.random() * oneLength);
		int rand2 = (int) (Math.random() * twoLength);
		int rand3 = (int) (Math.random() * threeLength);
		//строю фразу
		String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
		//выводим фразу
		System.out.println("we need only is - " + phrase);
	}

}

package heapquiz;

	class HeapQuiz {
		int id = 0;
		public static void main(String[] args) {
			int x = 0;

			HeapQuiz[] hq = new HeapQuiz [5];
			System.out.println(hq.length);

			while(x < 3) {
				hq[x] = new HeapQuiz();
				hq[x].id = x;
				x++;
			}
			hq[3] = hq[1];
			hq[4] = hq[1];
			hq[3] = null;
			hq[4] = hq[0];
			hq[0] = hq[3];
			hq[3] = hq[2];
			hq[2] = hq[0];
			System.out.println(hq[0]);
			System.out.println(hq[1]);  // вернутся к заданию когда узнаю как вытащить значение из 
			System.out.println(hq[2]);  // массива
			System.out.println(hq[3]);
			System.out.println(hq[4]);
		}
}

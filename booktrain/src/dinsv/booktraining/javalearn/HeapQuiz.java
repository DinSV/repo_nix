class HeapQuiz {
		int id = 0;
		public static void main(String[] args) {
			int x = 0;

			HeapQuiz[] hq = new HeapQuiz [5];
			System.out.println(hq[].legth);

			hwile (x < 3) {
				hq[x] = new HeapQuiz();
				hq[x].id = x;
				x++;
			}
			/*hq[3] = hq[1];
			hq[4] = hq[1];
			hq[3] = null;
			hq[4] = hq[0];
			hq[0] = hq[3];
			hq[3] = hq[2];
			hq[2] = hq[0];*/
			System.out.println(hq[x]);
		}

}
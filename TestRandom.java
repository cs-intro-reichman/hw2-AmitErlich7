
public  class  TestRandom {
	public static void main(String[]  args) {
		int num = Integer.parseInt(args[0]);
		int above = 0;
		int below = 0;
		for (int i = 0; i < num; i++) {
			double numRan = Math.random();
			if (numRan <=0.5) {
				below++;
			}
			else {
				above++;
			}
		}
		double ratio;
		if (above == 0) {
			System.out.println();
		}
		if (below == 0){
			System.out.println();
		}
		if (above <= below) {
			ratio =  (double) above / below;
			System.out.println("Ratio: " + ratio);
		}
		else {
			ratio =  (double) below / above;
			System.out.println("Ratio: " + ratio);
		}
		}
}

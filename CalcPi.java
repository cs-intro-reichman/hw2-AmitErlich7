public class CalcPi {
	public static void main(String [] args) { 
		int num = Integer.parseInt(args[0]);
		boolean sign = true;
		int divisor = 3;
		double div = (double) 1 / divisor;
		double sum = (double) 1;
		for (int i = 0; i < num; i++) {
			if (sign == true) {
				sum = sum - div;
			}
			else {
				sum = sum + div;
			}
			sign = !sign;
			divisor = divisor + 2;
			div = (double) 1 / divisor;
		}
		System.out.println("pi according to Java: " + Math.PI);
		sum  = (double) sum * 4;
		System.out.println("pi, approximated: " + sum);

	}
}

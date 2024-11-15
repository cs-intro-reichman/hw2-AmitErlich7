
public class Collatz {
	public static void main(String args[]) {
		int numOfTimes = Integer.parseInt(args[0]);
		String type = args[1];
		boolean reach = false;
		if (type.equals("v")) {
			for (int j = 1; j <= numOfTimes; j++) {
				int counter = 1;
				int current = j;
				reach = false;
				String halistone = "";
				while (reach == false) {
					System.out.print(current + " ");
					if (current % 2 == 0){
						current = current / 2;			
					}
					else {
						current = (current * 3) + 1;		
					}
					counter++;
					if (current == 1){
						System.out.print(current + " (" + counter + ")");
						reach = true;
						System.out.println();
					}
				}
				
			}
		}
		else {
			for (int j = 1; j <= numOfTimes; j++) {
				int counter = 1;
				int current = j;
				reach = false;
				while (reach == false) {
					if (current % 2 == 0){
						current = current / 2;			
					}
					else {
						current = (current * 3) + 1;		
					}
					counter++;
					if (current == 1){
						reach = true;
					}
				}
			}
		}
		
		System.out.println("Every one of the first " + numOfTimes + " hailstone sequences reached 1.");
	}
}

public class Cheers {
        public static void main(String[] args) {
                String name = args[0];
                name = name.toUpperCase();
                int wordLength = name.length();
                int numOfTimes = Integer.parseInt(args[1]);
                int j = 0;
                for (int i = 0; i < wordLength; i++) {
                        char currentChar = name.charAt(j);
                        if (currentChar == 'A' || currentChar == 'E' || currentChar == 'F' || currentChar == 'H' || currentChar == 'I' || currentChar == 'L' || currentChar == 'M' || currentChar == 'N' || currentChar == 'O' || currentChar == 'R' || currentChar == 'S' || currentChar == 'X') {
                               System.out.println("Give me an " + currentChar + ": " + currentChar + "!");                     
                        }
                        else {
                                System.out.println("Give me a " + currentChar + ": " + currentChar + "!");
                        }
                        j++;
                }
                System.out.println("What does that spell?");
                for (int k = 0; k < numOfTimes; k++) {
                        System.out.println(name + "!!!");
                }
                System.err.println();
        }
}

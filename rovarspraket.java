import java.util.Scanner;

class rovarspraket {
	public static void main(String[] args){
		while (true) {
			System.out.println("Please Enter a Sentence to be Rövarspråketed");
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			String output = rovarspraketify(input);
			System.out.println(output);
		}
	}	

	private static String rovarspraketify(String input) {
		char[] inputChars = input.toCharArray();
		String output = "";
		for (char inputChar : inputChars) {
			output += inputChar;
			if ("bcdfghjklmnpqrstvwxyz".contains(String.valueOf(inputChar).toLowerCase())) {
				output += "o" + Character.toLowerCase(inputChar);
			}
		}
		return output;
	}
}
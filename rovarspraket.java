import java.util.Scanner;

class rovarspraket {
	public static void main(String[] args){
		System.out.println("Please Enter a Sentence to be Rövarspråketed");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		System.out.println("Check the input: " + input);
		String output = rovarspraket(input);
		System.out.println("Check the output: " + output);
	}	

	private static String rovarspraket(String input) {
		char[] inputChars = input.toCharArray();
		for (char inputChar : inputChars) {
			if (!"aeiou".contains(String.valueOf(inputChar).toLowerCase())) {
				System.out.println(inputChar);
			}
		}
		return input + "is Rövarspråketed";
	}
}
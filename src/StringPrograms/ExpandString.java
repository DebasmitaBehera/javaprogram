package StringPrograms;

public class ExpandString {

	public static void main(String[] args) {
        String input = "a3b4c4";
    StringBuilder output = new StringBuilder();

    for (int i = 0; i < input.length(); i += 2) {
        char ch = input.charAt(i); // Get the character
        int count = Character.getNumericValue(input.charAt(i + 1)); // Get the number

        for (int j = 0; j < count; j++) {
            output.append(ch);
        }
    }

    System.out.println("Output: " + output.toString());
		

	}

}

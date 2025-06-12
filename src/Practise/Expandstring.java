package Practise;

public class Expandstring {

	public static void main(String[] args) {
        String input = "a2b4c4";
String output = "";

for (int i = 0; i < input.length(); i += 2) {
    char letter = input.charAt(i);
    int count = input.charAt(i + 1) - '0'; // Convert char to int
    for (int j = 0; j < count; j++)
    {
        output += letter; // Append character 'count' times
    }
        }

System.out.println(output);

	}

}

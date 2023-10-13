/* Write a Program to take a user-defined input in which 
1. All Upper Case letters should be shifted left by 2 characters
2.All Lower Case letters should be shifted left by 3 characters*/  


package stringdemo;
import java.util.Scanner;

public class CharacterShift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Call the shiftCharacters method to process the input and get the shifted string.
        String shiftedString = shiftCharacters(input);

        // Display the shifted string to the user.
        System.out.println("Shifted string: " + shiftedString);
    }

    // Method to shift characters in the input string.
    public static String shiftCharacters(String input) {
        // Create a StringBuilder to efficiently build the shifted string.
        StringBuilder shiftedString = new StringBuilder();

      
        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                // Shift uppercase letters left by 2 characters.
                char shiftedChar = (char) (c - 2);

                // Ensure the shifted character remains within the uppercase letter range (A-Z).
                if (shiftedChar < 'A') {
                    shiftedChar = (char) (shiftedChar + 26);
                }

             
                shiftedString.append(shiftedChar);
            } else if (Character.isLowerCase(c)) {
                // Shift lowercase letters left by 3 characters.
                char shiftedChar = (char) (c - 3);

                // Ensure the shifted character remains within the lowercase letter range (a-z).
                if (shiftedChar < 'a') {
                    shiftedChar = (char) (shiftedChar + 26);
                }

                // Append the shifted character to the result.
                shiftedString.append(shiftedChar);
            } else {
                
                shiftedString.append(c);
            }
        }

        
        return shiftedString.toString();
    }
}

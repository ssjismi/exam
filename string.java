Develop a java string program to concatenate two strings, replace an inputted character by 
another character, split a string with a specified character, search for a substring within a string 
and display the character present at a specified position 


import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Concatenate two strings
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();
        String concatenated = str1 + str2;
        System.out.println("Concatenated String: " + concatenated);

        // 2. Replace a character
        System.out.print("Enter the string to modify: ");
        String original = scanner.nextLine();
        System.out.print("Enter character to replace: ");
        char oldChar = scanner.next().charAt(0);
        System.out.print("Enter new character: ");
        char newChar = scanner.next().charAt(0);
        String replaced = original.replace(oldChar, newChar);
        System.out.println("Modified String: " + replaced);
        scanner.nextLine(); // consume the leftover newline

        // 3. Split a string
        System.out.print("Enter string to split: ");
        String toSplit = scanner.nextLine();
        System.out.print("Enter delimiter character: ");
        char delimiter = scanner.nextLine().charAt(0);
        String[] parts = toSplit.split(Character.toString(delimiter));
        System.out.println("Split parts:");
        for (String part : parts) {
            System.out.println(part);
        }

        // 4. Search for a substring
        System.out.print("Enter string to search in: ");
        String fullString = scanner.nextLine();
        System.out.print("Enter substring to search for: ");
        String substring = scanner.nextLine();
        int index = fullString.indexOf(substring);
        if (index != -1) {
            System.out.println("Substring found at index: " + index);
        } else {
            System.out.println("Substring not found.");
        }

        // 5. Display character at specified position
        System.out.print("Enter string: ");
        String someString = scanner.nextLine();
        System.out.print("Enter position to retrieve character (0-based index): ");
        int position = scanner.nextInt();
        if (position >= 0 && position < someString.length()) {
            System.out.println("Character at position " + position + ": " + someString.charAt(position));
        } else {
            System.out.println("Invalid position.");
        }

        scanner.close();
    }
}

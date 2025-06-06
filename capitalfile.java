import java.io.RandomAccessFile;
import java.io.IOException;
import java.util.Scanner;

public class CountryCapital {
    public static void main(String[] args) throws IOException {
        RandomAccessFile file = new RandomAccessFile("countries.txt", "rw");

        // Step 1: Write country-capital pairs
        file.writeBytes("India:New Delhi\n");
        file.writeBytes("USA:Washington\n");
        file.writeBytes("UK:London\n");
        file.writeBytes("France:Paris\n");
        file.writeBytes("Japan:Tokyo\n");

        // Step 2: Display file contents
        file.seek(0);  // Reset pointer to beginning
        System.out.println("Contents of the file:");
        String line;
        while ((line = file.readLine()) != null) {
            System.out.println(line);
        }

        // Step 3: Accept country from user and display its capital
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter a country name to find its capital: ");
        String search = scanner.nextLine().trim();

        file.seek(0);  // Reset pointer again to search
        boolean found = false;

        while ((line = file.readLine()) != null) {
            String[] parts = line.split(":");
            if (parts.length == 2 && parts[0].equalsIgnoreCase(search)) {
                System.out.println("Capital of " + parts[0] + " is " + parts[1]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Country not found in the file.");
        }

        file.close();
        scanner.close();
    }
}

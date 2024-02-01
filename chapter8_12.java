import java.util.Scanner;

public class chapter8_12 {
    public static void main(String[] args) {
        System.out.println("Choose your option - (b)order or (s)olid: ");
        
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        int side = 5; // Example side length

        if (choice.equalsIgnoreCase("b")) {
            drawBorderSquare(side);
        } else if (choice.equalsIgnoreCase("s")) {
            System.out.println("Not Implemented.");
        } else {
            System.out.println("Invalid choice.");
        }

        scanner.close();
    }

    private static void drawBorderSquare(int side) {
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                if (i == 0 || j == 0 || i == side - 1 || j == side - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

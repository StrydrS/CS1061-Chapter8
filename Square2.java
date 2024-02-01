import java.util.Scanner;

public class Square2 {

    public Square2() {
    }

    public double getArea(int WIDTH) {
        return WIDTH * WIDTH;
    }

    public void draw() {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("Enter desired width of square: ");
        int WIDTH = Integer.parseInt(stdIn.nextLine());

        System.out.println("Area = " + getArea(WIDTH));

        System.out.print("Enter border symbol: ");
        char borderSymbol = stdIn.nextLine().charAt(0);

        System.out.print("Enter interior symbol: ");
        char interiorSymbol = stdIn.nextLine().charAt(0);

        System.out.print("Print with (b)order or (s)olid?");
        if (stdIn.nextLine().charAt(0) == 'b') {
            drawBorderSquare(borderSymbol, WIDTH, interiorSymbol);
        } else {
            drawSolidSquare(borderSymbol, WIDTH, interiorSymbol);
        }
    }

    private void drawBorderSquare(char borderSymbol, int WIDTH, char interiorSymbol) {
        drawHorizontalLine(borderSymbol, WIDTH, borderSymbol);
        drawSides(borderSymbol, WIDTH, interiorSymbol);
        drawHorizontalLine(borderSymbol, WIDTH, borderSymbol);
    }

    private void drawSolidSquare(char borderSymbol, int WIDTH, char interiorSymbol) {
        drawHorizontalLine(borderSymbol, WIDTH, borderSymbol);
        for (int i = 1; i < (WIDTH - 1); i++) {
            System.out.print(borderSymbol);
            for (int j = 1; j < (WIDTH - 1); j++) {
                System.out.print(interiorSymbol);
            }
            System.out.println(borderSymbol);
        }
        drawHorizontalLine(borderSymbol, WIDTH, borderSymbol);
    }

    private void drawHorizontalLine(char borderSymbol, int WIDTH, char interiorSymbol) {
        for (int i = 0; i < WIDTH; i++) {
            System.out.print(borderSymbol);
        }
        System.out.println();
    }

    private void drawSides(char borderSymbol, int WIDTH, char interiorSymbol) {
        for (int i = 1; i < (WIDTH - 1); i++) {
            System.out.print(borderSymbol);
            for (int j = 1; j < (WIDTH - 1); j++) {
                System.out.print(interiorSymbol);
            }
            System.out.println(borderSymbol);
        }
    }
}

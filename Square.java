import java.util.Scanner;

public class Square {

    private int width;

    public Square(int width) {
        this.width = width;
    }

    public double getArea() {
        return this.width * this.width;
    }

    public void draw() {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("Print with (b)order or (s)olid?");
        if(stdIn.nextLine().charAt(0) == 'b') {
            System.out.print("Enter symbol: ");
            drawBorderSquare(stdIn.nextLine().charAt(0));
        }
        else {
            System.out.print("Enter symbol: ");
            drawSolidSquare(stdIn.nextLine().charAt(0));
        }
    }

    private void drawBorderSquare(char SYMBOL) { 
        drawHorizontalLine(SYMBOL);
        drawSides(SYMBOL);
        drawHorizontalLine(SYMBOL);
    }

    private void drawSolidSquare(char SYMBOL) { 
        for(int i = 0; i < this.width; i++) {
            drawHorizontalLine(SYMBOL);
        }
    }

    private void drawHorizontalLine(char SYMBOL) {
        for(int i=0; i < this.width; i++) {
            System.out.print(SYMBOL);
        }
        System.out.println();
    }

    private void drawSides(char SYMBOL) {
        for(int i = 1; i < (this.width-1); i++) {
            System.out.print(SYMBOL);
            for(int j = 1; j < (this.width-1); j++) {
                System.out.print(" ");
            }
            System.out.println(SYMBOL);
        }
    }
}
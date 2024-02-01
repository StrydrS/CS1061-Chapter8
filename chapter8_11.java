public class chapter8_11 {

    public void draw(double height, double tanApex) {
        int rows = (int) Math.ceil(height);
        int rowLength;

        for(int row = 1; row <= rows; row++) {
            rowLength = (int) Math.ceil(row * tanApex);
            for(int j = 0; j < rowLength; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        chapter8_11 triangle = new chapter8_11();

        double height = 5;
        double tanApex = 0.9;

        triangle.draw(height, tanApex);
    }
}

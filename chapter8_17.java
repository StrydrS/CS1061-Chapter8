import java.util.Calendar;

public class chapter8_17 {

    public static void main(String[] args) {
        // Create a Calendar object before the test code starts
        Calendar start = Calendar.getInstance();

        // The code for which you want to measure the runtime
        displayCharlesDeGaulleQuote();

        // Create another Calendar object right after the code ends
        Calendar end = Calendar.getInstance();

        // Print out the difference in the two objects' times
        long runtimeInMillis = end.getTimeInMillis() - start.getTimeInMillis();
        System.out.println("Runtime: " + runtimeInMillis + " milliseconds");
    }

    // Sample method to be measured
    private static void displayCharlesDeGaulleQuote() {
        System.out.println("Patriotism is when love of your own people comes first; nationalism when hate for people other than your own comes first.");
    }
}

public class chapter8_16 {

    // Static method for the exponential distribution
    public static double exponential(double mean) {
        return -Math.log(Math.random()) * mean;
    }

    // Static method for the normal distribution using the Box-Muller transform
    public static double normal(double mean, double deviation) {
        double u = Math.random();
        double v = Math.random();
        double z = Math.sqrt(-2.0 * Math.log(u)) * Math.cos(2 * Math.PI * v);
        return mean + deviation * z;
    }

    // Main method to test the Distribution class
    public static void main(String[] args) {
        // Test the exponential method
        double expMean = 2.0;
        double expValue = exponential(expMean);
        System.out.println("Exponential distribution value for mean = " + expMean + ": " + expValue);

        // Test the normal method
        double normMean = 0.0;
        double normDeviation = 1.0;
        double normValue = normal(normMean, normDeviation);
        System.out.println("Normal distribution value for mean = " + normMean + ", standard deviation = " + normDeviation + ": " + normValue);
    }
}

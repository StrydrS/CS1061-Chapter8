//chapter8 exercise 2

/* Resources.java
 * This class evaluates resource use. It was written by Dean & Dean
 * and it compiles. So it must be OK!
 */

public class chapter8_2 {
    private double initialResources;
    private double currentResources;

    //renewable and nonrenewable environmental production
    private double sustainableProduction;

    //assign mineral and fossil resources
    public void setInitialResources(double resources) {
        this.initialResources = resources;
    }

    //assign remaining resources
    public void setCurrentResources(double resources) {
        this.currentResources = resources;
    }

    public void setSustainableProduction(double production) {
        this.sustainableProduction = production;
    }

    //fetch remaining fossil and mineral resources
    public double getCurrentResources() {
        return this.currentResources;
    }

    //Compute annual combination of renewable and nonrenewable environmental production
    public double produce(double populationFraction, double extractionExpense) {
        double avgResources = this.currentResources / this.initialResources;

        double extraction = chapter8_2.yieldfactor * extractionExpense  * avgResources;

        this.currentResources -= extraction;

        return extraction + populationFraction * this.sustainableProduction;
    }


}

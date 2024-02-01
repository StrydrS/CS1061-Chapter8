//chapter 8 exercise 4

public class chapter8_4 {
    public static void main(String[] args) {
        
        Car5 marcusCar = new Car5();
        Car5 michaelCar = new Car5();

        System.out.println(marcusCar.copyTo(michaelCar) +  " features copied");

        marcusCar = new Car5("Chevrolet", 2020, "blue");

        System.out.println(marcusCar.copyTo(michaelCar) +  " features copied");

        System.out.println();
    }
}

class Car5 {   
    String MAKE;
    int YEAR; 
    String COLOR;
    
    public Car5(String make, int year, String color) {
        this.MAKE = make;
        this.YEAR = year;
        this.COLOR = color;

    }

    public Car5() {
        
    }

    public int copyTo(Car5 destinationCar) {
        int attributesCopied = 0;
    
        if (this.MAKE != null & this.COLOR != null & this.YEAR != 0) {
            destinationCar.MAKE = this.MAKE;
            destinationCar.COLOR = this.COLOR;
            destinationCar.YEAR = this.YEAR;
            attributesCopied = 3;
        } 
        else {

            return 0;
        }

        return attributesCopied;
    }
}

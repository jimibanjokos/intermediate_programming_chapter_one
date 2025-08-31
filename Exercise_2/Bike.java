/**Class: Bike
 * @author: Jimi Banjoko
 * @version 1.0
 * Course: ITEC 2150 Fall 2025
 * Written: August 30, 2025
 * 
 * This class - Model of a bike.
*/

class Bike {
    // 3 instance variables
    private int numberOfWheels;
    private String manufacturer;
    private int year;

    public Bike() {
        // No-argument constructor
        this.numberOfWheels = 2;
        this.manufacturer = "Schwinn";
        this.year = 2014;
    }

    // 3-argument constructor
    public Bike(int numberOfWheels, String manufacturer, int year){
        this.numberOfWheels = numberOfWheels;
        this.manufacturer = manufacturer;
        this.year = year;
    }

    // getter method for number of wheels
    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    // getter method for manufacturer
    public String getManufacturer() {
        return manufacturer;
    }

    // getter method for year
    public int getYear() {
        return year;
    }

    // setter method for number of wheels
    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    // setter method for manufacturer
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    // setter method for year
    public void setYear(int year) {
        this.year = year;
    }

    // A toString() method
    public String toString() {
        return "Number of Wheels: " + numberOfWheels + ", Manufacturer: " + manufacturer + ", Year: " + year;
    }
}
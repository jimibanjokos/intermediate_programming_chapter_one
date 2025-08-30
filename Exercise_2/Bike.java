class Bike {
    private int numberOfWheels;
    private String manufacturer;
    private int year;

    public Bike() {
        this.numberOfWheels = 2;
        this.manufacturer = "Schwinn";
        this.year = 2014;
    }

    public Bike(int numberOfWheels, String manufacturer, int year){
        this.numberOfWheels = numberOfWheels;
        this.manufacturer = manufacturer;
        this.year = year;
    }
    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getYear() {
        return year;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return "Number of Wheels: " + numberOfWheels + ", Manufacturer: " + manufacturer + ", Year: " + year;
    }
}
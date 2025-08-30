class Bike {
    private int numberOfWheels;
    private String manufacturer;
    private int year;

    public Bike() {
        this.numberOfWheels = 2;
        this.manufacturer = 2;
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
}
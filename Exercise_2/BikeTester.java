import java.util.ArrayList;
public class BikeTester {
    public static void main(String[] args) {
        int totalNumberOfWheels;
        Bike bike1 = new Bike();
        System.out.println(bike1.toString());
        totalNumberOfWheels = bike1.getNumberOfWheels();
        Bike bike2 = new Bike();
        bike2.setNumberOfWheels(4);
        totalNumberOfWheels += bike2.getNumberOfWheels();
        bike2.setManufacturer("Kevin Mark");
        bike2.setYear(2019);
        System.out.println(bike2.toString());
        ArrayList<Bike> bikeList = new ArrayList<>();
        bikeList.add(bike1);
        bikeList.add(bike2);
        System.out.println(bikeList);
        System.out.println("The total number of wheels is " + totalNumberOfWheels);


    }
}
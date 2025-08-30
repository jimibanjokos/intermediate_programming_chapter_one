import java.util.ArrayList;
public class BikeTester {
    public static void main(String[] args) {
        Bike bike1 = new Bike();
        System.out.println(bike1.toString());
        Bike bike2 = new Bike();
        bike2.setNumberOfWheels(4);
        bike2.setManufacturer("Kevin Mark");
        bike2.setYear(2019);
        System.out.println(bike2.toString());
        ArrayList<Bike> bikeList = new ArrayList<>();
        bikeList.add(bike1);
        bikeList.add(bike2);
        System.out.println(bikeList);

    }
}
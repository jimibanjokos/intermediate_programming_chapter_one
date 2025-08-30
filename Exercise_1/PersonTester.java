/**Class: PersonTester
 * @author: Jimi Banjoko
 * @version 1.0
 * Course: ITEC 2150 Fall 2025
 * Written: August 30, 2025
 * 
 * This class - It tests out the person through the variables that were used.
*/

public class PersonTester {
    public static void main(String[] args) {
        Person person1 = new Person();
        System.out.println(person1.toString());
        person1.setName("Howard Rowark");
        person1.talk();
    }
}
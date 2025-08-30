/**Class: Person
 * @author: Jimi Banjoko
 * @version 1.0
 * Course: ITEC 2150 Fall 2025
 * Written: August 30, 2025
 * 
 * This class - Model of a person.
*/

class Person {
    // 3 instance variables
    private String name;
    private int age;
    private String eyeColor;

    public Person() {
        // No-argument constructor
        this.name = "Alex White";
        this.age = 23;
        this.eyeColor = "Red";
    }
    // 3-argument constructor
    public Person(String name, int age, String eyeColor) {
        this.name = name;
        this.age = age;
        this.eyeColor = eyeColor;
    }

    // getter method for name
    public String getName() {
        return name;
    }

    // getter method for age
    public int getAge() {
        return age;
    }

    // getter method for eyeColor
    public String getEyeColor() {
        return eyeColor;
    }

    // setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // setter method for age
    public void setAge(int age) {
        this.age = age;
    }

    // setter method for eyeColor
    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    // A toString() method
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", EyeColor: " + eyeColor;
    }

    // An instance method which is the talk() method
    public void talk() {
        System.out.println("Welcome, Coders! I am " + name);
    }

}
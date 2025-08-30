class Person {
    private String name;
    private int age;
    private String eyeColor;

    public Person() {
        this.name = "Alex White";
        this.age = 23;
        this.eyeColor = "Red";
    }
    public Person(String name, int age, String eyeColor) {
        this.name = name;
        this.age = age;
        this.eyeColor = eyeColor;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age + ", EyeColor: " + eyeColor;
    }

    public void talk() {
        System.out.println("Welcome, Coders! I am " + name);
    }

}
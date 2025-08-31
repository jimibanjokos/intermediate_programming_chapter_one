public class TextBookTester {
    public static void main(String[] args) {
       TextBook textBookOne = new TextBook();
       TextBook textBookTwo = new TextBook("Geography","Alex White", 185);

       textBookOne.setTitle("All about Math");
       textBookOne.setAuthor("Kevin Joe");
       textBookOne.setNumberOfPages(987);
       System.out.println("First TextBook: " + textBookOne);

       textBookOne.printInfo();
       textBookTwo.printInfo();

       System.out.println("Title of First textbook: " + textBookOne.getTitle());
       System.out.println("Author of First textbook: " + textBookOne.getAuthor());
       System.out.println("Number of pages of the First textbook are: " + textBookOne.getNumberOfPages());

    }
}
/**Class: TextBook
 * @author: Jimi Banjoko
 * @version 1.0
 * Course: ITEC 2150 Fall 2025
 * Written: August 30, 2025
 * 
 * This class - Model of a textbook.
*/

public class TextBook {
    // 3 instance variables
    private String title;
    private String author;
    private int numberOfPages;

    public TextBook() {
        // No-argument constructor
        this.title = "Wolves in the Forest";
        this.author = "Ben Frank";
        this.numberOfPages = 32;
    }

    // 3-argument constructor
    public TextBook(String title, String author, int numberOfPages) {
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    // getter method for title
    public String getTitle() {
        return title;
    }

    // getter method for author
    public String getAuthor() {
        return author;
    }

    // getter method for number of pages
    public int getNumberOfPages() {
        return numberOfPages;
    }

    // setter method for title
    public void setTitle(String title) {
        this.title = title;
    }

    // setter method for author
    public void setAuthor(String author) {
        this.author = author;
    }

    // setter method for number of pages
    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    // A toString() method
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Number of Pages: " + numberOfPages;
    }
    
    // An instance method which is printInfo
    public void printInfo() {
        System.out.println("The name of the book is " + title + " , the author is " + author + " , and the number of Pages is " + numberOfPages);
    }
}
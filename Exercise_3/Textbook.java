class TextBook {
    private String title;
    private String author;
    private int numberOfPages;

    public TextBook() {
        this.title = "Wolves in the Forest";
        this.author = "Ben Frank";
        this.numberOfPages = 32;
    }

    public TextBook(String title, String author, int numberOfPages) {
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Number of Pages: " + numberOfPages;
    }
    
    public void printInfo() {
        System.out.println("The name of the book is " + title + " , the author is " + author + " , and the number of Pages is " + numberOfPages);
    }
}
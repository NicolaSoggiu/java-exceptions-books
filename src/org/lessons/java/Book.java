package org.lessons.java;

public class Book {
    // ATTRIBUTI
    private String title;
    private String author;
    private String publisher;
    private int pageNumber;

    // COSTRUTTORI
    public Book(String title, String author, String publisher, int pageNumber) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.pageNumber = pageNumber;

        validateTitle();
        validateAuthor();
        validatePublisher();
        validatePageNumber();
    }

    // VALIDAZIONI
    public void validateTitle() {
        if (title == null) {
            throw new IllegalArgumentException("You must enter the title!");
        }
    }

    public void validateAuthor() {
        if (author == null) {
            throw new IllegalArgumentException("You must enter the author!");
        }
    }
    public void validatePublisher() {
        if (publisher == null) {
            throw new IllegalArgumentException("You must enter the publisher!");
        }
    }

    public void validatePageNumber() {
        if (pageNumber <= 0) {
            throw new IllegalArgumentException("The number of pages cannot be 0 or a negative number!");
        }
    }

    // GETTER/SETTER
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        validateTitle();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
        validateAuthor();
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
        validatePublisher();
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
        validatePageNumber();
    }

    // METODO TOSTRING
    @Override
    public String toString() {
        return "Title: " + title + " " +
                "\nAuthor: " + author + " " +
                "\nPublisher by: " + publisher + " " +
                "\nPage number: " + pageNumber;
    }
}

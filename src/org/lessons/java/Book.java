package org.lessons.java;

public class Book {
    private String title;
    private String author;
    private String publisher;
    private int pageNumber;

    public Book(String title, String author, String publisher, int pageNumber) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.pageNumber = pageNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Title: " + title + " " +
                "\nAuthor: " + author + " " +
                "\nPublisher by: " + publisher + " " +
                "\nPage number: " + pageNumber;
    }
}

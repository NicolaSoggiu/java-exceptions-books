package org.lessons.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the book's title: ");
        String title = scan.nextLine();
        System.out.print("Enter the book's author: ");
        String author = scan.nextLine();
        System.out.print("Enter the book's publisher: ");
        String publisher = scan.nextLine();
        System.out.print("Enter the number of pages: ");
        int pageNumber = scan.nextInt();

        Book book1 = new Book(title, author, publisher, pageNumber);
        System.out.println(book1);

        scan.close();
    }
}

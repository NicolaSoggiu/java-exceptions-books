package org.lessons.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Book[] catalogue = new Book[100];
        int count = 0;

        while (true) {
            System.out.print("Enter the book's title: ");
            String title = scan.nextLine();
            System.out.print("Enter the book's author: ");
            String author = scan.nextLine();
            System.out.print("Enter the book's publisher: ");
            String publisher = scan.nextLine();
            System.out.print("Enter the number of pages: ");
            int pageNumber = scan.nextInt();
            scan.nextLine();

            Book book1 = new Book(title, author, publisher, pageNumber);
            System.out.println(book1);
            catalogue[count] = book1;
            count++;

            System.out.print("Do you want to enter another book? (yes/no): ");
            String response = scan.nextLine();
            if (response.equalsIgnoreCase("no")) {
                break;
            }
        }

        System.out.println("Our Catalogue: ");
        for (int i = 0; i < count; i++) {
            System.out.println(catalogue[i].getTitle());
        }

        scan.close();
    }
}

package org.lessons.java;

import javax.imageio.IIOException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Book[] catalogue = new Book[100];
        int count = 0;

        while (true) {
            try {
                System.out.print("Enter the book's title: ");
                String title = scan.nextLine();
                System.out.print("Enter the book's author: ");
                String author = scan.nextLine();
                System.out.print("Enter the book's publisher: ");
                String publisher = scan.nextLine();
                System.out.print("Enter the number of pages: ");
                int pageNumber = scan.nextInt();
                scan.nextLine();
                Book book = new Book(title, author, publisher, pageNumber);
                System.out.println(book);
                catalogue[count] = book;
                count++;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }

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

        try {
            File bookFile = new File("resources/catalogue.txt");
            if (bookFile.createNewFile()) {
                System.out.println("File created!");
                FileWriter writer = new FileWriter(bookFile);
                for (int i = 0; i < count; i++) {
                    writer.write("Book " + (i + 1) + ":\n");
                    writer.write("Title: " + catalogue[i].getTitle() + "\n");
                    writer.write("Author: " + catalogue[i].getAuthor() + "\n");
                    writer.write("Publisher: " + catalogue[i].getPublisher() + "\n");
                    writer.write("Page Number: " + catalogue[i].getPageNumber() + "\n\n");
                }
                writer.close();
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }

        scan.close();
    }
}

package org.trishinfotech.iterator.example2;

import java.util.Arrays;
import java.util.Iterator;

import org.trishinfotech.iterator.Book;

public class Main {

	public static void main(String[] args) {
		Book[] books = new Book[5];
		books[0] = new Book("English", "Head First Java, 2nd Edition", "Kathy Sierra", 10123758943l, 10.5d);
		books[1] = new Book("English", "Effective Java (3rd Edition)", "Bloch Joshua", 34422235432l, 8.65d);
		books[2] = new Book("English", "Mastering Java Machine Learning", "Dr Uday Kamath", 2123765476l, 21.45d);
		books[3] = new Book("English", "Cloud-Native Java", "Kenny Bastani ", 21332343434l, 28.99d);
		books[4] = new Book("English", "Java 9 Modularity", "Paul Bakker", 1645243587l, 36.68d);
		BookStore store = new BookStore();
		BookLibrary library = new BookLibrary();
		Arrays.stream(books).forEach(book -> {
			store.addBook(book);
			library.addBook(book);
		});

		System.out.println("Printing Book details of Book Store");
		System.out.println(
				"-------------------------------------------------------------------------------------------------");
		printBooks(store.iterator());
		System.out.println("Printing Book details of Book Library");
		System.out.println(
				"-------------------------------------------------------------------------------------------------");
		printBooks(library.iterator());
	}

	private static void printBooks(Iterator<Book> iterator) {
		// String language, String title, String author, long ISBN, double price
		System.out.printf("%10s | %35s | %15s | %15s | %10s\n", "Language", "Title", "Author", "ISBN", "Price");
		System.out.println(
				"-------------------------------------------------------------------------------------------------");
		while (iterator.hasNext()) {
			Book book = iterator.next();
			System.out.printf("%10s | %35s | %15s | %15s | %10.2f\n", book.getLanguage(), book.getTitle(),
					book.getAuthor(), book.getISBN(), book.getPrice());
		}
		System.out.println(
				"-------------------------------------------------------------------------------------------------");
		System.out.println();
	}

}

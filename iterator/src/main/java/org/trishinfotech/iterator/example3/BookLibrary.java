package org.trishinfotech.iterator.example3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.trishinfotech.iterator.Book;

public class BookLibrary implements Iterable<Book> {
	protected List<Book> books;

	public BookLibrary() {
		super();
		books = new ArrayList<Book>();
	}

	public boolean addBook(String language, String title, String author, long ISBN, double price) {
		Book book = new Book(language, title, author, ISBN, price);
		return books.add(book);
	}
	
	public boolean addBook(Book book) {
		return books.add(book);
	}
	
	public List<Book> getBooks() {
		return books;
	}

	@Override
	public Iterator<Book> iterator() {
		return books.iterator();
	}

}

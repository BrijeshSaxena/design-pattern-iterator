package org.trishinfotech.iterator.example2;

import java.util.Iterator;

import org.trishinfotech.iterator.Book;

public class BookIterator implements Iterator<Book> {

	protected Book[] books;
	protected int currentBook = 0;
	
	public BookIterator(Book[] books) {
		this.books = books;
	}

	@Override
	public boolean hasNext() {
		return (currentBook < books.length && books[currentBook] != null);
	}

	@Override
	public Book next() {
		return books[currentBook++];
	}

}

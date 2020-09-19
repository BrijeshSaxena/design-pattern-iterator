package org.trishinfotech.iterator.example2;

import java.util.Iterator;

import org.trishinfotech.iterator.Book;

public interface BookCollection {
	public Iterator<Book> iterator();
}

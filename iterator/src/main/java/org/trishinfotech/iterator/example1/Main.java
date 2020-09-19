package org.trishinfotech.iterator.example1;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		NamesRepository repository = new NamesRepository();
		Iterator<String> repositoryIterator = repository.getIterator();
		while (repositoryIterator.hasNext()) {
			System.out.println("Hi! " + repositoryIterator.next());
		}
		
		// or in an easier way by using for each loop
		String[] names = repository.getNames();
		for (String name : names) {
			System.out.println("Hello! " + name);
		}
	}

}

package org.trishinfotech.iterator.example1;

import java.util.Iterator;

public class NamesRepository implements Container {

	private String names[] = { "Ajay", "Vijay", "Martin", "Racheal", "Kim" };

	public NamesRepository() {
		super();
	}

	@Override
	public Iterator<String> getIterator() {
		return new CollectionofNamesIterate(this);
	}

	public String[] getNames() {
		return names;
	}

	public static class CollectionofNamesIterate implements Iterator<String> {
		private int currentElement = 0;
		private NamesRepository namesRepository;

		public CollectionofNamesIterate(NamesRepository namesRepository) {
			super();
			this.namesRepository = namesRepository;
		}

		@Override
		public boolean hasNext() {
			if (currentElement < namesRepository.names.length) {
				return true;
			}
			return false;
		}

		@Override
		public String next() {
			if (this.hasNext()) {
				return namesRepository.names[currentElement++];
			}
			return null;
		}
	}
}

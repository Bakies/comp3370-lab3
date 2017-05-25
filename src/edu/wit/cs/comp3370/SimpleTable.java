package edu.wit.cs.comp3370;

public class SimpleTable extends HashTable {
	private static final int multiplier = 31;

	public SimpleTable(int size) {
		super(size);
	}

	@Override
	public int calculateHash(String word) {
		int hash = 0;
		for (byte b : word.getBytes()) {
			hash = ((hash * multiplier) + b) % this.tableSize;
		}
		return hash;
	}

}

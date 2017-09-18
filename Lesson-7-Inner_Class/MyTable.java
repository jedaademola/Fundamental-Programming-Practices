package com.fpp.lesson7;

public class MyTable {

	private Entry[] entries = new Entry[26];

	public class Entry {

		private char key;
		private String value;

		Entry(char key, String value) {
			this.key = key;
			this.value = value;

		}

		public String toString() {
			return this.key + " -> " + this.value;
		}

		public String getValue() {
			return this.value;
		}
	}

	public void add(char key, String value) {
		int index = (int) key - 97;
		Entry entry = new Entry(key, value);
		entries[index] = entry;
	}

	public String get(char key) {
		int index = (int) key - 97;
		Entry entry = entries[index];
		if (entry == null) {
			return null;
		}
		return entry.getValue();
	}

	public String toString() {
		String toPrint = "";
		int N = entries.length - 1;
		int index = 0;
		while (index <= N) {
			if (entries[index] != null) {
				toPrint += entries[index].toString();
				toPrint += "\n";
			}
			index++;
		}
		return toPrint;
	}

	public static void main(String[] args) {

		MyTable t1 = new MyTable();
		t1.add('a', "Andrew");
		t1.add('b', "Billy");
		t1.add('c', "Charlie");
		String s = t1.get('b');
		System.out.println(s);
		
		MyTable t2 = new MyTable();
		t2.add('a', "Andrew");
		t2.add('b',"Billy");
		t2.add('w',"Willie");
		System.out.println(t2);
	}

}
/*
Billy
a -> Andrew
b -> Billy
w -> Willie
*/


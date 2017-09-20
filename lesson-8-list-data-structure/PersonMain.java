package com.fpp.lesson8;

public class PersonMain {

	private final int INITIAL_LENGTH = 4;

	private PersonList[] personArray;
	private int size;

	public PersonMain() {

		personArray = new PersonList[INITIAL_LENGTH];
		size = 0;
	}

	public PersonList get(int i) {
		if (i < 0 || i >= size) {
			return null;
		}
		return personArray[i];// strArray[i];
	}

	public void add(PersonList p) {

		if (size == personArray.length)
			resize();
		personArray[size++] = p;

	}

	public boolean find(String lastName) {
		for (PersonList p : personArray) {
			if (p.getLast().equals(lastName))
				return true;
		}
		return false;
	}

	public void insert(PersonList p, int pos) {
		if (pos > size)
			return;
		if (pos >= personArray.length || size + 1 > personArray.length) {
			resize();
		}
		PersonList[] temp = new PersonList[personArray.length + 1];
		System.arraycopy(personArray, 0, temp, 0, pos);
		temp[pos] = p;

		System.arraycopy(personArray, pos, temp, pos + 1, personArray.length - pos);
		personArray = temp;
		++size;

	}

	public boolean remove(String lastName) {
		if (size == 0)
			return false;
		int index = -1;
		for (int i = 0; i < size; ++i) {
			if (personArray[i].getLast().equals(lastName)) {
				index = i;
				break;
			}
		}

		if (index == -1)
			return false;
		PersonList[] temp = new PersonList[personArray.length];
		System.arraycopy(personArray, 0, temp, 0, index);
		System.arraycopy(personArray, index + 1, temp, index, personArray.length - (index + 1));
		personArray = temp;
		--size;
		return true;
	}

	private void resize() {
		System.out.println("resizing");
		int len = personArray.length;
		int newlen = 2 * len;
		PersonList[] temp = new PersonList[newlen];
		System.arraycopy(personArray, 0, temp, 0, len);
		personArray = temp;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < size - 1; ++i) {
			sb.append(personArray[i] + ", ");
		}
		sb.append(personArray[size - 1] + "]");

		return sb.toString();
	}

	public int size() {
		return size;
	}

	public static void main(String[] args) {

		PersonMain l = new PersonMain();
				
		l.add(new PersonList("Bob","Marley",25));
		l.add(new PersonList("Bobby","Charlton",37));
		l.add(new PersonList("Franck","Deboor",30));
		l.add(new PersonList("Mary","Chopper",5));
		l.add(new PersonList("Kully","Brandon",45));
		
		
		System.out.println("The list of size " + l.size() + " is " + l);
		l.remove("Bobby");
		l.remove("Kully");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.insert(new PersonList("Richard", "Pau", 15), 3);
		System.out.println("The list of size " + l.size() + " after inserting Richard into pos 3 is " + l);
		l.insert(new PersonList("Tonya", "Anny", 16), 0);
		System.out.println("The list of size " + l.size() + " after inserting Tonya into pos 0 is " + l);

	}

}
/*
 resizing
The list of size 5 is [PersonList [lastName=Bob
 FirstName=Marley
Age=25], PersonList [lastName=Bobby
 FirstName=Charlton
Age=37], PersonList [lastName=Franck
 FirstName=Deboor
Age=30], PersonList [lastName=Mary
 FirstName=Chopper
Age=5], PersonList [lastName=Kully
 FirstName=Brandon
Age=45]]
The list of size 3 is [PersonList [lastName=Bob
 FirstName=Marley
Age=25], PersonList [lastName=Franck
 FirstName=Deboor
Age=30], PersonList [lastName=Mary
 FirstName=Chopper
Age=5]]
The list of size 4 after inserting Richard into pos 3 is [PersonList [lastName=Bob
 FirstName=Marley
Age=25], PersonList [lastName=Franck
 FirstName=Deboor
Age=30], PersonList [lastName=Mary
 FirstName=Chopper
Age=5], PersonList [lastName=Richard
 FirstName=Pau
Age=15]]
The list of size 5 after inserting Tonya into pos 0 is [PersonList [lastName=Tonya
 FirstName=Anny
Age=16], PersonList [lastName=Bob
 FirstName=Marley
Age=25], PersonList [lastName=Franck
 FirstName=Deboor
Age=30], PersonList [lastName=Mary
 FirstName=Chopper
Age=5], PersonList [lastName=Richard
 FirstName=Pau
Age=15]]

 */

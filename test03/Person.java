package test03;

import java.util.Iterator;

public class Person implements Comparable {
	private String name; // 이름
	private double height; // 키

	public Person() {
	}

	public Person(String name, double height) {
		this.setName(name);
		this.setHeight(height);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public int compareTo(Object obj) {
		Person other = (Person) obj;
		if (getHeight() > other.getHeight()) {
			return 1;
		} else if (getHeight() < other.getHeight()) {
			return -1;
		}
		return 0;
	}

	static String getTallest(Person[] people) {
		int max = 0;
		for (int i = 0; i < people.length; i++) {
			switch (people[max].compareTo(people[i])) {
			case -1:
				max = i;
				break;
			default:
				break;
			}
		}
		return people[max].getName();
	}

	@Override
	public String toString() {
		return "이름: " + name + ", 키: " + height;
	}

}

package chapter11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex61 {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(3));
		list1.add(new Integer(2));
		list1.add(new Integer(1));
		
		ArrayList<Integer> list2 = new ArrayList<Integer>(list1.subList(2, 4));
		System.out.println("1 : " + list1);
		System.out.println("1 : " + list2);
		
		Collections.sort(list1);
		Collections.sort(list2);
		System.out.println("2 : " + list1);
		System.out.println("2 : " + list2);
		
		System.out.println(list1.containsAll(list2));
		System.out.println(list2.containsAll(list1));
		int min = Collections.min(list1);
		System.out.println("와우!!" + min);
		
		list2.add(4);
		list2.add(7);
		System.out.println("3 : " + list1);
		System.out.println("3 : " + list2);
		
		list2.add(2, 11);
		System.out.println("4 : " + list1);
		System.out.println("4 : " + list2);
		
		list2.set(2, 33);
		System.out.println("5 : " + list1);
		System.out.println("5 : " + list2);
		
	}
}

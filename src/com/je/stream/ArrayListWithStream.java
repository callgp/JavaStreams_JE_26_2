package com.je.stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListWithStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> l1 = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			l1.add(i);
		}

		// ArrayList<Integer> l2=new ArrayList<Integer>();
		// for (Integer i : l1) {
		// if(i%2 == 0) {
		// l2.add(i);
		// }
		// }

		List<Integer> l2 = l1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());

		System.out.println(l2);
	}

}

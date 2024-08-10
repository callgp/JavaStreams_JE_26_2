package com.je.stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListWithStreamWithMapLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al=new ArrayList<String>();
		al.add("jj");
		al.add("kk");
		al.add("pp");
		al.add("aaa");
		/*
		 * for (int i = 0; i <10; i++) { l1.add(i); }
		 * 
		 * ArrayList<Integer> l2=new ArrayList<Integer>();
		 */
		/*
		 * for (Integer i : l1) { if(i%2 == 0) { l2.add(i); } }
		 */
		
		List<Integer> result= al.stream().map(i->i.length()).collect(Collectors.toList());
		System.out.println(result);
	}

}

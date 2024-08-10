package com.je.stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListWithStreamWithMapUpperCaseCount {

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
		
		//long result= al.stream().filter(i->i.length()==3).count();
		Long result= al.stream().filter(i->i.length()==3).count();
		System.out.println(result);
	}

}

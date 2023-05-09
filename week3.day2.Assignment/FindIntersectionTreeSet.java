package week3.day2.assignment;

import java.util.Arrays;

import java.util.TreeSet;

public class FindIntersectionTreeSet {

	public static void main(String[] args) {
		Integer [] array1 = {3,2,11,4,6,7};
		Integer [] array2 = {1,2,8,4,9,7};
		TreeSet<Integer> set1 = new TreeSet<Integer>(Arrays.asList(array1));
		TreeSet<Integer> set2 = new TreeSet<Integer>(Arrays.asList(array2));
		set1.retainAll(set2);
		System.out.println("Intersection of array1 & array2 :" +set1);
	}
}
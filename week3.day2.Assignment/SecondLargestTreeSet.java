package week3.day2.assignment;

import java.util.TreeSet;

public class SecondLargestTreeSet {

	public static void main(String[] args) {
		int [] data = {3,2,11,4,6,7};
		TreeSet<Integer> set = new TreeSet<Integer>();
		for(Integer n :data) {
			set.add(n);
		}
		set.remove(set.last());
		System.out.println(set.last());
	}
}



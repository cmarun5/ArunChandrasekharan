package week3.day2.assignment;

import java.util.TreeSet;

public class PrintDuplicateInArray {
	public static void main(String[] args) {
		int [] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		TreeSet<Integer> set1 = new TreeSet<Integer>();
		for(Integer val : arr) {
			if(!set1.add(val)) {
				System.out.println(val);
			}
		}
	}
}
package week3.day2.assignment;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
public class MissingElement {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8 };
		Set<Integer> num = new TreeSet<Integer>();
		for(int i : arr) {
			num.add(i);		
		}
		System.out.println(num);
		List<Integer> output = new LinkedList<Integer>(num);
		for (int i :output) {
			if(output.get(i) != i+1) {
				System.out.println(i+1);
				break;


			}

		}

	}
}



package week3.day2.assignment;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "we learn java basics as part of java sessions in java week1";
		String output = "";
		char[] charArray = text.toCharArray();
		Set<Character> result = new TreeSet<Character>();
		for (int i = 0; i < charArray.length; i++) {
			if(result.add(charArray[i])) {
				output=output+charArray[i];
				System.out.print(charArray[i]);
			}
		}
	}
}

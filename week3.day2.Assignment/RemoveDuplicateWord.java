package week3.day2.assignment;

import java.util.Set;
import java.util.TreeSet;


public class RemoveDuplicateWord {

	public static void main(String[] args) {
		//declare input 
		String text = "we learn java basics as part of java sessions in java week1";
		String output = "";
		System.out.println(text);
		//Split words with ""
		String[] split = text.split(" ");
		//treeSet
		Set<String> result = new TreeSet<String>();
		
		for (int i = 0; i < split.length; i++) {
			if(result.add(split[i])) {
				output=output+split[i];
				System.out.print(split[i]+" ");
			}
			else {
				System.out.print("     ");
			}
		}


	}
}
package week1day2assignment;

import java.util.Arrays;

public class SmallestInArray {

	public static void main(String[] args) {
		int[] array = {23,45,67,32,89,22};
		int length =array.length;
		int n=0;
		System.out.println(length);
		Arrays.sort(array);
		n=length-(length-1);
		System.out.println("Second smallest no. in array is "+array[1]);

	}

}

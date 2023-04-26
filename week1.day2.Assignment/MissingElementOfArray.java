package week1day2assignment;

import java.util.Arrays;

public class MissingElementOfArray {

	public static void main(String[] args) {
		
	
		int[] array = {1,2,3,4,7,6,8};
		Arrays.sort(array);
		System.out.println("Array length :"+array.length);
		for(int i=0; i < array.length; i++) {
			if( array[i] != (i+1)) {
			System.out.println("The missing array element is " + (i+1));
			break;
			
		}
		
                           
	}

}
}

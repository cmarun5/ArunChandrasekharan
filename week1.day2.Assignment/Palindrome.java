package week1day2assignment;

public class Palindrome {

	public static void main(String[] args) {
		int r, sum = 0, temp;
		int m = 34343;
		int n = m;
		temp = n;
		for (n=34343 ; n>0 ; n=n/10) {
		//while (n > 0) {
			r = n % 10;
			sum = (sum * 10) + r;
			//n = n / 10;
		}
		if (temp == sum) {
			System.out.println(m + " is a palindrome number.");
		} else {
			System.out.println(m + "is not a palindrome number.");
		}
	}

}



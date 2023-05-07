package week3.day2.assignment;

public class Palindrome {

	public static void main(String[] args) {
		//declare String value 'madam'
		String name = "madam";
		//declare revname value ""
		String revname = "";
		//iterate string in reverse
		for(int i=name.length()-1 ; i >=0 ; i--) {
			//add the char to revname
			revname=revname+name.charAt(i);
		}
		System.out.println(revname);
		//compare name & revname using .equals
		if(name.equals(revname)) {
			// if same print palindrome
			System.out.println("Given String "+ name +" is  palindrome");
		}
		else {
			//if not same print not palindrome
			System.out.println("Given String "+name +" is not palindrome");
		}
	}

}

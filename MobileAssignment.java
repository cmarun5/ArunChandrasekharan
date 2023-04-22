/*Assignment 2:

- Create package name as week1.day1 under src/main/java
- Create a  new class as "Mobile" under week1.day1
- Create 2 methods (makeCall() , sendMsg()) with simple print statement
- In first method create variable  mobileModel (String),mobileWeight (float)
- In second method create variable  isFullCharged (boolean),mobileCost (int)
- Create main method
Create object for class and call  from main method and print them
- print a statement---->"This is my mobile";
-run and confirm the output printed in console 
*/
package week1.day1;

public class MobileAssignment {
	
	public void makeCall() {
		System.out.println("Make Call");
	
	}
	private void sendMsg() {
		System.out.println("Send Message");

	}
	private void mobileModel() {
		String mobileModel = "SAMSUNG";
			System.out.println("MOBILE MODEL="+mobileModel);
	}
		
	private void mobileWeight() {
		float mobileWeight =100.05f;
			System.out.println("MOBILE WEIGHT="+mobileWeight);
	}
	
	public void fullyCharged() {
		boolean isFullyCharged = true;
		System.out.println("Fully Charged ="+isFullyCharged);
	}
	
	public void mobileCost() {
		int mobileCost = 10000;
		System.out.println("Mobile Cost ="+mobileCost);
		

	}
	public static void main(String[] args) {
		MobileAssignment obj = new MobileAssignment();
		obj.makeCall();
		obj.sendMsg();
		obj.mobileModel();
		obj.mobileWeight();
		obj.fullyCharged();
		obj.mobileCost();
		
		System.out.println("This is my Mobile");

	}

}

package learnjava;

public class Mobile {
	public void makeCall() {
		System.out.println("Make call");
				String mobileModel = "Samsung";
				float mobileWeight = .400f;
		System.out.println("Mobile Model is " + mobileModel +"\nmobile weight is "+mobileWeight);
}
	public void sendMsg() {
		System.out.println("Send Msg");
				boolean isFullyCharged = true;
				int mobileCost = 10000;
				System.out.println("Is Fully Charged "+isFullyCharged + "\nmobile cost is "+mobileCost);
	}

	public static void main(String[] args) {
		Mobile obj = new Mobile();
		obj.makeCall();
		obj.sendMsg();
		
		System.out.println("This is my mobile");
		
		

	}

}

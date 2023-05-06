package week3.day1.Assignment;

public class AxisBank extends BankInfo{
	public void deposit() {
		System.out.println("Minimum Deposit limit  : Rs.49999");
	}
	public static void main(String[] args) {
		AxisBank bank = new AxisBank();
		bank.savings();
		bank.fixed();
		bank.deposit();

	}
}

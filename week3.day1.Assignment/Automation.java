package week3.day1.Assignment;

public class Automation extends MultiLanguage implements Language {
	public void Java() {
		System.out.println("Its coming from interface");
	}
public static void main(String[] args) {
	Automation obj = new Automation();
	obj.Java();
	obj.Python();
	obj.Ruby();
}
}

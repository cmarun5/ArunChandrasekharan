package week3.day1.Assignment;

public class Automation extends MultiLanguage implements Language,TestTool {
	public void Java() {
		System.out.println("Java _ language");
	}

	@Override
	public void Ruby() {
		System.out.println("Ruby _ MultiLanguage");

	}

	public void Selenium() {
		System.out.println("Selenium _ TestTool interface");
		
	}
public static void main(String[] args) {
		Automation lang = new Automation();
		lang.Java();
		lang.Python();
		lang.Ruby();
		lang.Selenium();
}
}


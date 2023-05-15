package week4.day2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropAndDroppable {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/drag.xhtml");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //Find element
        WebElement source = driver.findElement(By.xpath("//p[text()='Drag to target']"));
        WebElement desc = driver.findElement(By.xpath("//p[text()='Drop here']"));
        Actions builder=new Actions(driver);
        builder.dragAndDrop(source, desc).perform();
        //verification
        String text = desc.getText();
        System.out.println(text);
        
        WebElement drag = driver.findElement(By.xpath("//span[text()='Drag and Drop']"));
		Point location = drag.getLocation();
		int x = location.getX();
		int y = location.getY();
		System.out.println("x:"+x);
		System.out.println("y:"+y);
		Actions builder1=new Actions(driver);
		builder1.dragAndDropBy(drag, 200, 100).perform();
		System.out.println(drag.getLocation().getX());
		System.out.println(drag.getLocation().getY());
	}

}

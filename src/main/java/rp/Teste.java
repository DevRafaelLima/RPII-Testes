package rp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("teste33");
		System.setProperty("webdriver.edge.driver", "C:\\drivers\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		
		System.out.println(driver.getTitle());
	}

}

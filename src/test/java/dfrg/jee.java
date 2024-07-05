package dfrg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class jee {

	
@Test

public void startbrowser()
{

		WebDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("http://google.com");
		String title = dr.getTitle();
		System.out.println(title);
		dr.close();
}
		
		

	}



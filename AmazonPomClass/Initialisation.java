package AmazonPomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Initialisation {
	public Initialisation(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

}

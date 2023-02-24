package AmazonPomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Initialisation{
	public HomePage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	private WebElement searchtf;
	
	@FindBy(xpath = "//input[@id='nav-search-submit-button']")
	private WebElement searchicon;
	
	
	public void SearchTF(String name)
	{
		searchtf.sendKeys(name);
	}
	
	public void SearchIcon()
	{
		searchicon.click();
	}

}

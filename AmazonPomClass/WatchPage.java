package AmazonPomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WatchPage extends Initialisation {
	public WatchPage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(xpath = "//li[@id='p_89/Titan']")
	private WebElement brandcb;
	
	@FindBy(xpath = "//li[@aria-label='Analogue']")
	private WebElement analogcb;
	
	@FindBy(xpath = "//span[.=\"Leather\"]")
	private WebElement leathercb;
	
	@FindBy(xpath = "//span[.=\"25% Off or more\"]")
	private WebElement discountlink;
	
	@FindBy(xpath = "(//div[@class='a-section a-spacing-small puis-padding-left-micro puis-padding-right-micro'])[5]")
	private WebElement details;

	
	public void Brand() {
		brandcb.click();
	}
	
	public void Display() {
		analogcb.click();
	}
	
	public void Material() {
		leathercb.click();
	}
	
	public void Discount() {
		discountlink.click();
	}
	
	public void WatchDetails() {
		String t = details.getText();
		System.out.println(t);
	}
}

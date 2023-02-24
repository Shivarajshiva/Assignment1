package Amazon;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import AmazonPomClass.HomePage;
import AmazonPomClass.WatchPage;

public class RunnerClass extends BaseClass {
	@Test
	public void TS_01() {
		HomePage home = new HomePage(driver);
		WatchPage watch = new WatchPage(driver);

		home.SearchTF("Wrist Watches");
		home.SearchIcon();
		watch.Display();
		watch.Brand();
		watch.Material();
		watch.Discount();
		watch.WatchDetails();

	}

}

package Basic;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ContactsTest {

	@Test
	public void CreateContactsTest() {
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https://www.ajio.com/");
	}
}
package mentoring.thucydides;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import org.openqa.selenium.WebDriver;

public class BaseTest {

	@Managed
	public WebDriver driver;

	@ManagedPages()
	public Pages pages;

}

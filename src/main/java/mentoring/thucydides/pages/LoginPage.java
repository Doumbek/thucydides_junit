package mentoring.thucydides.pages;

import mentoring.thucydides.pages.blocks.login.LoginFormBlock;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.thucydides.BlockPageObject;

public class LoginPage extends BlockPageObject {

	private final String url = "https://accounts.google.com/";

	@FindBy(xpath = "//form[@id = 'gaia_loginform']")
	private LoginFormBlock loginFormBlock;

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public String getUrl() {
		return url;
	}

	public LoginFormBlock getLoginFormBlock() {
		return loginFormBlock;
	}
}

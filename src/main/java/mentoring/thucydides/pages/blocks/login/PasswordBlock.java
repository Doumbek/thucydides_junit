package mentoring.thucydides.pages.blocks.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.TextBlock;
import ru.yandex.qatools.htmlelements.element.TextInput;
import ru.yandex.qatools.htmlelements.thucydides.BlockPageObject;

public class PasswordBlock extends HtmlElement {

	@FindBy(xpath = ".//input[@id = 'Passwd']")
	private TextInput passwordInput;

	@FindBy(xpath = ".//input[@id = 'signIn']")
	private Button loginButton;

	@FindBy(xpath = ".//input[@id = 'errormsg_0_Passwd']")
	private TextBlock errorAlert;

	public TextInput getPasswordInput() {
		return passwordInput;
	}

	public Button getLoginButton() {
		return loginButton;
	}

	public TextBlock getErrorAlert() {
		return errorAlert;
	}

}

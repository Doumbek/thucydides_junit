package mentoring.thucydides.pages.blocks.login;

import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.thucydides.BlockPageObject;

public class LoginFormBlock extends HtmlElement {

	@FindBy(xpath = ".//div[contains(@class, 'form-panel first')]")
	private EmailBlock emailBlock;

	@FindBy(xpath = ".//div[contains(@class, 'form-panel second')]")
	private PasswordBlock passwordBlock;

	public EmailBlock getEmailBlock() {
		return emailBlock;
	}

	public PasswordBlock getPasswordBlock() {

		if(!passwordBlock.isDisplayed()){
			throw new ElementNotVisibleException("Account information popup not visible");
		}

		return passwordBlock;

	}

}

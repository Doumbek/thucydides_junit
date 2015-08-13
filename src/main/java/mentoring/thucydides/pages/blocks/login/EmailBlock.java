package mentoring.thucydides.pages.blocks.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.TextInput;
import ru.yandex.qatools.htmlelements.thucydides.BlockPageObject;

public class EmailBlock extends HtmlElement {

	@FindBy(xpath = ".//input[@id = 'Email']")
	private TextInput emailInput;

	@FindBy(xpath = ".//input[@id = 'next']")
	private Button nextButton;

	public TextInput getEmailInput() {
		return emailInput;
	}

	public Button getNextButton() {
		return nextButton;
	}

}

package mentoring.thucydides.pages.blocks.header;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.thucydides.BlockPageObject;

@Name("Account information popup")
public class AccountInfoBlock extends HtmlElement {

	@FindBy(xpath = ".//a[text() = 'Выйти']")
	private Button logoutButton;

	public Button getLogoutButton() {
		return logoutButton;
	}

}

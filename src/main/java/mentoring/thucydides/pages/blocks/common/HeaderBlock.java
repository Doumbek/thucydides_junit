package mentoring.thucydides.pages.blocks.common;

import mentoring.thucydides.pages.blocks.header.AccountInfoBlock;

import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.Link;
import ru.yandex.qatools.htmlelements.thucydides.BlockPageObject;

@Name("Header block")
public class HeaderBlock extends HtmlElement {

	@FindBy(xpath = ".//div[@class='gb_va gb_1b']")
	private AccountInfoBlock accountInfoBlock;

	@FindBy(xpath = ".//a[contains(@href, 'https://accounts.google.com/SignOutOptions')]")
	private Link accountLink;

	public AccountInfoBlock getAccountInfoBlock() {

		if(!accountInfoBlock.getLogoutButton().isDisplayed()){
			throw new ElementNotVisibleException("Account information popup not visible");
		}

		return accountInfoBlock;

	}

	public Link getAccountLink() {
		return accountLink;
	}



}

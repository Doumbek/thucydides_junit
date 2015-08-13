package mentoring.thucydides.pages;

import mentoring.thucydides.pages.blocks.common.HeaderBlock;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.thucydides.BlockPageObject;

public class InboxPage extends BlockPageObject {

	@FindBy(xpath = "//div[@role='banner']")
	private HeaderBlock headerBlock;

	public InboxPage(WebDriver driver) {
		super(driver);
	}

	public HeaderBlock getHeaderBlock() {
		return headerBlock;
	}

}

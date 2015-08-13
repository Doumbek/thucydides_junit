package mentoring.thucydides.steps.blocks.header;

import mentoring.thucydides.pages.InboxPage;
import mentoring.thucydides.pages.blocks.header.AccountInfoBlock;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class AccountInfoBlockSteps extends ScenarioSteps {

	@Step
	public void clickLogoutButton() {
		onInboxPage().getHeaderBlock().getAccountInfoBlock().getLogoutButton().click();
	}

	private InboxPage onInboxPage() {
		return pages().getPage(InboxPage.class);
	}

}

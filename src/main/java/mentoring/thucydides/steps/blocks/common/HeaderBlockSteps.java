package mentoring.thucydides.steps.blocks.common;

import mentoring.thucydides.pages.InboxPage;
import mentoring.thucydides.pages.blocks.common.HeaderBlock;
import mentoring.thucydides.steps.blocks.header.AccountInfoBlockSteps;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;

import static org.junit.Assert.*;

public class HeaderBlockSteps extends ScenarioSteps {

	@Steps
	private AccountInfoBlockSteps accountInfoBlockSteps;

	@Step
	public void clickAccountLink() {
		onInboxPage().getHeaderBlock().getAccountLink().click();
	}

	@Step
	public void checkAccountLink() {
		assertTrue(
				"Account link for authorized user must be presented!",
				onInboxPage().getHeaderBlock().getAccountLink().isDisplayed()
		);
	}

	@StepGroup
	public void logout() {
		clickAccountLink();
		getAccountInfoBlockSteps().clickLogoutButton();
	}

	public AccountInfoBlockSteps getAccountInfoBlockSteps() {
		return accountInfoBlockSteps;
	}

	private InboxPage onInboxPage() {
		return pages().getPage(InboxPage.class);
	}

}

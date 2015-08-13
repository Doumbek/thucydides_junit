package mentoring.thucydides.steps.blocks.login;

import mentoring.thucydides.pages.InboxPage;
import mentoring.thucydides.pages.LoginPage;
import mentoring.thucydides.pages.blocks.login.EmailBlock;
import mentoring.thucydides.pages.blocks.login.LoginFormBlock;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class EmailBlockSteps extends ScenarioSteps {

	@Step
	public void inputLogin(String login) {
		onLoginPage().getLoginFormBlock().getEmailBlock().getEmailInput().sendKeys(login);
	}

	@Step
	public void clickNextButton() {
		onLoginPage().getLoginFormBlock().getEmailBlock().getNextButton().click();
	}

	private LoginPage onLoginPage() {
		return pages().getPage(LoginPage.class);
	}

}

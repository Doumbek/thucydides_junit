package mentoring.thucydides.steps.blocks.login;

import mentoring.thucydides.pages.LoginPage;
import mentoring.thucydides.pages.blocks.login.PasswordBlock;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.junit.Assert.assertTrue;

public class PasswordBlockSteps extends ScenarioSteps {

	@Step
	public void inputPassword(String password) {
		onLoginPage().getLoginFormBlock().getPasswordBlock().getPasswordInput().sendKeys(password);
	}

	@Step
	public void clickLoginButton() {
		onLoginPage().getLoginFormBlock().getPasswordBlock().getLoginButton().click();
	}

	@Step
	public void checkErrorAlert() {
		assertTrue(
				"Alert must be displayed!",
				onLoginPage().getLoginFormBlock().getPasswordBlock().getErrorAlert().isDisplayed()
		);
	}

	private LoginPage onLoginPage() {
		return pages().getPage(LoginPage.class);
	}

}

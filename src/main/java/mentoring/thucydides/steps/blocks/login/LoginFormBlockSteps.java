package mentoring.thucydides.steps.blocks.login;

import mentoring.thucydides.bo.User;
import mentoring.thucydides.pages.LoginPage;
import mentoring.thucydides.pages.blocks.login.LoginFormBlock;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;

import static org.junit.Assert.assertTrue;

public class LoginFormBlockSteps extends ScenarioSteps {

	@Steps
	private static EmailBlockSteps emailBlockSteps;

	@Steps
	private static PasswordBlockSteps passwordBlockSteps;

	@Step
	public void checkLoginForm() {
		assertTrue(
				"Login form must be presented after logout!",
				onLoginPage().getLoginFormBlock().isDisplayed()
		);
	}

	@StepGroup
	public void login(User user) {
		emailBlockSteps.inputLogin(user.getLogin());
		emailBlockSteps.clickNextButton();
		passwordBlockSteps.inputPassword(user.getPassword());
		passwordBlockSteps.clickLoginButton();
	}

	public EmailBlockSteps getEmailBlockSteps() {
		return emailBlockSteps;
	}

	public PasswordBlockSteps getPasswordBlockSteps() {
		return passwordBlockSteps;
	}

	private LoginPage onLoginPage() {
		return pages().getPage(LoginPage.class);
	}

}

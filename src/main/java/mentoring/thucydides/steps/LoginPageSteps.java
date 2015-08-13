package mentoring.thucydides.steps;

import mentoring.thucydides.pages.LoginPage;
import mentoring.thucydides.steps.blocks.login.LoginFormBlockSteps;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;

public class LoginPageSteps extends ScenarioSteps {

	@Steps
	private LoginFormBlockSteps loginFormBlockSteps;

	@Step
	public void goToLoginPage(){
		getDriver().get(pages().getPage(LoginPage.class).getUrl());
	}

	public LoginFormBlockSteps getLoginFormBlockSteps() {
		return loginFormBlockSteps;
	}

	private LoginPage onLoginPage() {
		return pages().getPage(LoginPage.class);
	}

}

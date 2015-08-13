package mentoring.thucydides;

import mentoring.thucydides.bo.User;
import mentoring.thucydides.features.Application;
import mentoring.thucydides.steps.InboxPageSteps;
import mentoring.thucydides.steps.LoginPageSteps;
import net.thucydides.core.annotations.*;
import net.thucydides.junit.runners.ThucydidesRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(ThucydidesRunner.class)
@Story(Application.Authorization.Logout.class)
public class LogoutTest extends BaseTest{

	@Steps
	public LoginPageSteps loginPageSteps;

	@Steps
	public InboxPageSteps inboxPageSteps;

	private User user = new User(
			"test.selenium.yakush@gmail.com",
			"testyakush"
	);

	@Before
	public void openLogoutPage() {
		loginPageSteps.goToLoginPage();
	}

	@Test
	public void shouldLogoutTest() {
		loginPageSteps.getLoginFormBlockSteps().login(user);
		inboxPageSteps.getHeaderBlockSteps().logout();
		loginPageSteps.getLoginFormBlockSteps().checkLoginForm();
	}

}

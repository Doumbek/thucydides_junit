package mentoring.thucydides;

import mentoring.thucydides.bo.User;
import mentoring.thucydides.features.Application;
import mentoring.thucydides.steps.InboxPageSteps;
import mentoring.thucydides.steps.LoginPageSteps;
import net.thucydides.core.annotations.*;
import net.thucydides.junit.runners.ThucydidesRunner;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(ThucydidesRunner.class)
@Story(Application.Authorization.Login.class)
public class LoginTest extends BaseTest{

	@Steps
	public LoginPageSteps loginPageSteps;

	@Steps
	public InboxPageSteps inboxPageSteps;

	private User user = new User(
			"test.selenium.yakush@gmail.com",
			"testyakush"
	);

	private User userWithWrongPassword = new User(
			"test.selenium.yakush@gmail.com",
			"testyakush111"
	);

	@Before
		 public void openLoginPage() {
		loginPageSteps.goToLoginPage();
	}

	@Test
	@Ignore
	public void shouldLoginWithCorrectCredentialsTest() {
		loginPageSteps.getLoginFormBlockSteps().login(user);
		inboxPageSteps.getHeaderBlockSteps().checkAccountLink();
	}

	@Test
	@Ignore
	public void shouldNotLoginWithIncorectPasswordTest() {
		loginPageSteps.getLoginFormBlockSteps().login(userWithWrongPassword);
		loginPageSteps.getLoginFormBlockSteps().getPasswordBlockSteps().checkErrorAlert();
	}

}

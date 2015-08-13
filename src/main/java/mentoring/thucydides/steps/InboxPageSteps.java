package mentoring.thucydides.steps;

import mentoring.thucydides.pages.InboxPage;
import mentoring.thucydides.steps.blocks.common.HeaderBlockSteps;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class InboxPageSteps extends ScenarioSteps {

	@Steps
	private HeaderBlockSteps headerBlockSteps;

	public HeaderBlockSteps getHeaderBlockSteps() {
		return headerBlockSteps;
	}

	private InboxPage onInboxPage() {
		return pages().getPage(InboxPage.class);
	}

}

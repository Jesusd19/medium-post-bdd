package MediumBDD.stepdefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

import MediumBDD.models.Post;
import MediumBDD.tasks.Load;
import MediumBDD.tasks.Search;
import MediumBDD.userinterfaces.MediumHomePage;
import MediumBDD.userinterfaces.MediumPostPage;
import MediumBDD.userinterfaces.MediumResultPage;
import MediumBDD.utils.FileManagment;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Managed;

public class MediumPostInformationStepDefinition {
	@Managed(driver = "chrome")
	private WebDriver hisBrowser;
    private Actor ngenko = Actor.named("Yenkis");

	@Before
	public void setUp() {
		ngenko.can(BrowseTheWeb.with(hisBrowser));
    }
	
	@Given("^the medium home page loaded$")
    public void theMediumHomePageLoaded() {
		ngenko.wasAbleTo(Load.mediumHomePage());
    }
	
	@When("^I search the posts stored in a excel file$")
	public void iSearchThePostsStoredInAExcelFile() {
		List<Post> posts = FileManagment.readExcel();
		for (Post post : posts) {
			ngenko.attemptsTo(
					Click.on(MediumHomePage.ICON_SEARCH),
					
					Search.theTerm(post.getTitle()).into(MediumHomePage.INPUT_SEARCH),
					
					WaitUntil.the(MediumResultPage.RESULT_SEARCH_BOX, isCurrentlyVisible()),
					
					Click.on(MediumResultPage.RESULT),
					
					WaitUntil.the(MediumPostPage.ICON_HOME, isCurrentlyVisible()),
					
					Click.on(MediumPostPage.ICON_HOME)
				);
		}
	}


	@Then("^the information about each post shoulder be the same$")
	public void theInformationAboutEachPostShoulderBeTheSame() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}

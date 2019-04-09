package MediumBDD.stepdefinitions;

import org.openqa.selenium.WebDriver;

import MediumBDD.tasks.OpenTheBrowser;
import MediumBDD.userinterfaces.GoogleHomePage;
import MediumBDD.userinterfaces.GoogleSearchPage;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Managed;

public class MediumPostInformationStepDefinition {
	@Managed(driver = "chrome")
	private WebDriver hisBrowser;
    private Actor ngenko = Actor.named("Yenkis");
    private GoogleHomePage googleHomePage;
    private GoogleSearchPage googleSearchPage;

	@Before
	public void setUp() {
		ngenko.can(BrowseTheWeb.with(hisBrowser));
    }
	
	@Given("^the medium home page loaded$")
    public void theMediumHomePageLoaded() {
		ngenko.wasAbleTo(OpenTheBrowser.on(googleHomePage));
		ngenko.wasAbleTo(Enter.keyValues("medium\n").into(GoogleHomePage.INPUT_SEARCH));
		ngenko.wasAbleTo(Click.on(GoogleSearchPage.SELECT_MEDIUM));
    }
	
	@When("^I search the posts stored in a excel file$")
	public void iSearchThePostsStoredInAExcelFile() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}


	@Then("^the information about each post shoulder be the same$")
	public void theInformationAboutEachPostShoulderBeTheSame() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}

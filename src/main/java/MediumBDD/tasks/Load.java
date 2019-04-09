package MediumBDD.tasks;

import MediumBDD.userinterfaces.GoogleHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.annotations.Step;

public class Load implements Task {
    private GoogleHomePage googleHomePage;

	@Override
	@Step("{0} Load medium page")
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(
				OpenTheBrowser.on(googleHomePage),
				
				Search.theTerm("medium").into(GoogleHomePage.INPUT_SEARCH),
				
				OpenMedium.homePage());
	}

	public static Load mediumHomePage() {

		return Tasks.instrumented(Load.class);
	}

}

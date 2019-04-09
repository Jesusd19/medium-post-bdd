package MediumBDD.tasks;

import MediumBDD.userinterfaces.GoogleSearchPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

public class OpenMedium implements Task {

	@Override
	@Step("{0} open medium home page")
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Click.on(GoogleSearchPage.SELECT_MEDIUM));
	}

	public static OpenMedium homePage() {

		return Tasks.instrumented(OpenMedium.class);
	}

}

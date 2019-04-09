package MediumBDD.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.google.com")
public class GoogleHomePage extends PageObject {
	public static final Target INPUT_SEARCH =  Target.the("The input search").located(By.name("q"));
	
}

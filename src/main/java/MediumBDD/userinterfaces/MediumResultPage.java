package MediumBDD.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class MediumResultPage {
	public static final Target RESULT_SEARCH_BOX =  Target.the("The search box").located(By.xpath("//input[@type='search' and @class='js-searchInput textInput textInput--jumbo textInput--underlined']"));
	public static final Target RESULT =  Target.the("The result of the search").located(By.xpath("//h3"));
}
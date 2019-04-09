package MediumBDD.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class GoogleSearchPage {
	public static final Target SELECT_MEDIUM =  Target.the("Click in the result medium").located(By.xpath("//a[@href='https://medium.com/']"));

}

package framework;

import org.openqa.selenium.By;
import ru.yandex.qatools.allure.annotations.Step;

public class HomePage extends BasePage{

	private By emailTextField = By.id("email");
	private By passwordTextField = By.id("pass");
	private By loginButton = By.id("loginbutton");
	
	public void clickOnLoginButton() {
		clickOn(loginButton);
	}

	public void enterEmail(String enterEmail) {
		sendText(emailTextField, enterEmail);
	}
	
	public void enterPassword(String enterPassword) {
		sendText(passwordTextField, enterPassword);
	}
}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PosLoginPage extends BasePage {

    public PosLoginPage(WebDriver driver) {
        super(driver);
    }

    //Locators (finding part)
    @FindBy(using = "/html/body/app-root/div/app-main/div[1]/div[2]/div[2]/app-login/div/div/div/form/div[1]/input")
    private WebElement usernameLocator;

    @FindBy(using = "/html/body/app-root/div/app-main/div[1]/div[2]/div[2]/app-login/div/div/div/form/div[2]/input")
    private WebElement passwordLocator;

    @FindBy(using ="/html/body/app-root/div/app-main/div[1]/div[2]/div[2]/app-login/div/div/div/div/button")
    private WebElement loginButtonLocator;

// Methods (doing part)
    public void enterUserName(String username) {
        usernameLocator.sendKeys(username);
    }

        public void enterPassword(String password){
            passwordLocator.sendKeys(password);

    }

    public void clickOnLoginButton(){
       loginButtonLocator.click();
    }

}

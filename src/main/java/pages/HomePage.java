package pages;

import Base.base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends base{

    public HomePage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(id="twotabsearchtextbox")
    public WebElement  Search;

    public void clickJava(String str)
    {
        Search.sendKeys(str);
    }

    public void testString()
    {
        System.out.println("Swati Singh");
    }

}


package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Base.base;
import org.openqa.selenium.support.PageFactory;
import pages.HomePage;

import java.util.logging.Logger;

public class stepDefs {

    base b = new base();
    HomePage h ;

    @Given("I have a search field on Amazon page")
    public void i_have_a_search_field_on_amazon_page() {
        b.initialize();
        h =new HomePage();
        h.clickJava("Apple Macbook Pro");
        h.testString();

    }

    @When("I search for a product named {string} and price {int}")
    public void i_search_for_a_product_named_and_price(String ProdName, Integer Price) {
        System.out.println("Step: 2: " + ProdName + Price);



    }

    @Then("Product with name {string} should be displayed")
    public void product_with_name_should_be_displayed(String string) {
        System.out.println("Step: 3");

    }
}

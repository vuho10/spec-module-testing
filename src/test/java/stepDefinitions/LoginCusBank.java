package stepDefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
//import static org.junit.Assert.*;

import java.sql.Driver;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;
import static org.junit.Assert.assertEquals;

public class LoginCusBank {
    WebDriver driver = null;

    String projectPath = System.getProperty("user.dir");

    @Given("user press on customer login button")
    public void press_on_customer_login_button() throws Throwable {
        System.out.println("WEll Vu haha");
        System.setProperty("webdriver.gecko.driver", projectPath + "/driver/geckodriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
        sleep(1000);
        driver.findElement(By.cssSelector("div.center:nth-of-type(1) button")).click();
        sleep(1000);
    }

    @And("verify that this is user management page")
    public void verify_that_this_is_user_management_page() throws Throwable {
        String manageCusPageUrl = driver.getCurrentUrl();
        Assert.assertEquals(manageCusPageUrl, "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/customer");

        //Verify title
        String manageCusPageTitle = driver.getTitle();
        Assert.assertEquals(manageCusPageTitle, "XYZ Bank");
        sleep(2 * 1000);
    }

    @When("user selects option name")
    public void user_selects_option_name() throws Throwable {
        driver.findElement(By.id("userSelect")).click();
        Thread.sleep(1000);
    }

    @And("user chooses their name")
    public void user_chooses_their_name() throws Throwable {
        driver.findElement(By.id("userSelect")).click();
        driver.findElement(By.cssSelector("#userSelect option:nth-of-type(2)")).click();
        Thread.sleep(1000);
    }

    @And("user press on login button")
    public void press_on_login_button() throws Throwable {
        driver.findElement(By.cssSelector("button.btn.btn-default")).click();
        sleep(1000);
    }

    @And("user click on deposit button")
    public void user_click_on_deposit_button() throws Throwable {
        driver.findElement(By.cssSelector(".tab:nth-of-type(2)")).click();
        sleep(1000);
    }

    @And("user input numbers on amount text box")
    public void user_input_numbers_on_amount_text_box() throws Throwable {
        driver.findElement(By.cssSelector("[type='number'][placeholder='amount']")).sendKeys("2000");
        sleep(1000);
    }

    @And("user press on deposit to save amount")
    public void press_on_deposit_to_save_amount() throws Throwable {
        driver.findElement(By.className("btn-default")).click();
        sleep(1000);
    }

    @And("^user can not input (.+) on amount text box$")
    public void user_can_not_input_on_amount_text_box(String numbers) throws Throwable {
        driver.findElement(By.cssSelector("[type='number'][placeholder='amount']")).sendKeys(numbers);
        sleep(1000);
    }

    /*         user can withdrawl succesful    */

    @And("user click on withdrawl button")
    public void user_click_on_withdrawl_button() throws Throwable {
        driver.findElement(By.cssSelector(".tab:nth-of-type(3)")).click();
        sleep(1000);
    }

    @And("user input numbers on Withdrawl text box")
    public void user_input_numbers_on_Withdrawl_text_box() throws Throwable {
        driver.findElement(By.cssSelector("[type='number'][placeholder='amount']")).sendKeys("1000");
        sleep(1000);
    }

    @And("press on Withdrawl to save amount")
    public void press_on_Withdrawl_to_save_amount() throws Throwable {
        driver.findElement(By.className("btn-default")).click();
        sleep(1000);
    }

    /*         user can not withdrawl succesful    */
    @And("^user does not input (.+) on Withdrawl text box$")
    public void user_does_not_input_on_withdrawl_text_box(String numbers) throws Throwable {
        driver.findElement(By.cssSelector("[type='number'][placeholder='amount']")).sendKeys(numbers);
        sleep(1000);
    }

    /*    uer can transactions successful  */
    @When("user click on transactions button")
    public void user_click_on_transactions_button() throws Throwable {
        driver.findElement(By.cssSelector(".tab:nth-of-type(1)")).click();
        sleep(2000);
    }

    @And("user click next button")
    public void user_click_next_button() throws Throwable {
        driver.findElement(By.cssSelector("div.fixedBottomBox button:nth-of-type(3)")).click();
        sleep(2000);
    }

    @And("user click top button")
    public void user_click_top_button() throws Throwable {
        driver.findElement(By.cssSelector("div.fixedBottomBox button:nth-of-type(2)")).click();
        sleep(2000);
    }
    @Then("user click reset button")
    public void user_click_reset_button() throws Throwable {
        driver.findElement(By.cssSelector("div.fixedTopBox button:nth-of-type(2)")).click();
        sleep(1000);
    }
    @And("user click back button")
    public void user_click_back_button() throws Throwable{
        driver.findElement(By.cssSelector("div.fixedTopBox button:nth-of-type(1)")).click();
        sleep(1000);
    }
    @Then("notification is displayed")
    public void notify_is_display() {
//
        driver.close();
        System.out.println("Successfully excution");
    }

}

package StepDefinition;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class RegisterStepDefinition {

    WebDriver driver;

    @Given("^User able to open browser$")
    public void user_able_to_open_browser()  {
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.manage().window().maximize();
    }



    @Given("^Enter Url$")
    public void enter_Url()  {
        driver.get("https://demo.nopcommerce.com/");

    }

    @Then("^User click on register Link$")
    public void user_click_on_register_Link() {
        driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click() ;
        String title= driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("nopCommerce demo store. Register",title);


        }

    @Then("^User select gender$")
    public void user_select_gender() {
        driver.findElement(By.id("gender-male")).click();

    }

    @Then("^User enter FirstName and LastName$")
    public void user_enter_FirstName_and_LastName() {
        driver.findElement(By.id("FirstName")).sendKeys("Aaryan");
        driver.findElement(By.id("LastName")).sendKeys("Vaishnav");

    }

    @Then("^User enter BirthDay,BirthMonth and BirthYear$")
    public void user_enter_BirthDay_BirthMonth_and_BirthYear()  {
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]")).sendKeys("13");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]")).sendKeys("April");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[3]")).sendKeys("2006");
    }


    @Then("^User enter Email$")
    public void user_enter_Email() {
        driver.findElement(By.id("Email")).sendKeys("aaryan13@gmail.com");

    }

    @Then("^User enter Password and ConfirmPassword$")
    public void user_enter_Password_and_ConfirmPassword() {
        driver.findElement(By.id("Password")).sendKeys("aaryan11");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("aaryan11");

    }

    @Then("^click on Register button$")
    public void click_on_Register_button()  {
        driver.findElement(By.id("register-button")).click();
    }
    @Then("^User close the browser$")
    public void user_close_the_browser()  {
        driver.quit();

    }



}

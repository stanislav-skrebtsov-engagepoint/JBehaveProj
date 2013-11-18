import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * User: stanislav.skrebtsov (stanislav.skrebtsov@engagepoint.com)
 * Date: 11/15/13
 * Time: 3:43 PM
 */
public class BehaveTests {

    FirefoxDriver driver = new FirefoxDriver();

    @Given("site $url")
    public void open(String url){
        driver.get(url);
    }

    @When("title is $title")
    public void find(String title ){
        if (driver.getTitle().equals(title)){
            System.out.println("Совпало");

        }
        else{
            System.out.println("Не совпало");
        }
    }

    @Then("close")
    public void close(){
        driver.close();

    }
}
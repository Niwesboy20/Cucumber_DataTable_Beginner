package cucumber.screenplay.beginner



import cucumber.api.CucumberOptions
import net.serenitybdd.cucumber.CucumberWithSerenity
import org.junit.runner.RunWith


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/feature/Login.feature")
class startCucumber {
}

package Runner;

import cucumber.api.CucumberOptions;
//import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import cucumber.runtime.snippets.Snippet;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features ="C:\\Users\\niles\\IdeaProjects\\SimpleBDDFramework\\src\\test\\resources\\Features\\Register.feature",

        glue ={"StepDefinition"},

        format = {"pretty","html:htmlReport","json:json/cucumber.json","junit:junit/cucumber.xml"},
        dryRun = true

        //snippets = SnippetType.UNDERSCORE

)

public class TestRunner {

}


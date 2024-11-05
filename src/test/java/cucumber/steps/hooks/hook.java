package cucumber.steps.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import static cucumber.TestBase.*;


public class hook {

    @Before
    public void setUp(){
        getDriver().get(URL);
    }

    @After
    public void finish(){quitDriver();}


}

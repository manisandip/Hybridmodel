package webTest1;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

import static com.sun.deploy.cache.Cache.copyFile;

public class Hooks extends Utils {
    private SimpleDateFormat timestamp = new SimpleDateFormat("yyyy.MM.dd.HH");
    BrowserSelector browserSelector = new BrowserSelector();

    @Before
    public void OpenBrowser(){
        browserSelector.openBrowser();
    }

    @After
    public void CloseBrowser(Scenario scenario){
        if (scenario.isFailed()){
            String screenshotName = scenario.getName().replaceAll("[.,:;?!]","")+timestamp+ ".png";
            try {
                //This takes a screenshot from the driver at save it to the specified location
                File sourcePath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                //building up the destination path for the screenshot to save
                //Also make sure to create a folder 'screenshots' with in the cucumber-report folder
                File destinationPath = new File((System.getProperty("user.dir")+ "/target/Destination/screenshots/") + screenshotName);
                //copy taken screenshot from source location to destination location
                copyFile(sourcePath,destinationPath);
                scenario.write("!!!!!!!!!!!!!!!......Scenario Failed .....!!!!!!Please see attached screenshot for the error/issue");
                //attach the screenshot to our report
                scenario.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES),"image/png");

            }catch (IOException e ){

            }
        }
        browserSelector.CloseBrowser();
    }
}

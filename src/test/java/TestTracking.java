import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.DataFormat;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestTracking implements ITestListener {
    @Override
    public void onStart(ITestContext context) {
        System.out.println("Test Starts");

    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test is successful");
    }



    @Override
    public void onTestFailure(ITestResult result) {
        File file = ((TakesScreenshot) Base.driver).getScreenshotAs(OutputType.FILE);

        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd-HH-mm-ss");
        Date date = new Date();
        String currentDate = dateFormat.format(date);

        try {
            FileUtils.copyFile(file,new File("srg/screenshot/" + currentDate + ".png"));
        } catch (IOException e) {
            System.out.println("failed to save screenshot");
            throw new RuntimeException(e);

        }


    }
}
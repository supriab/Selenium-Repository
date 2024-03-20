import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeTest extends Base{

    Homepage homepage;

    @BeforeMethod
    void starting(){
        openBrowser("https://ebay.com");
      homepage = PageFactory.initElements(Base.driver,Homepage.class);
    }
    @Test
    void testFashion(){
        String expectedUrl = "https://www.ebay.com/b/Clothing-Shoes-Accessories/11450/bn_1852545";
        homepage.clickFashion();
        String actualUrl = driver.getCurrentUrl();

        Assert.assertEquals(actualUrl, expectedUrl);
    }


    @Test
    void testFashion1(){
        String expectedUrl = "https://www.ebay.com/b/Clothing-Shoes-Accessories/11450/bn_1852545";
        homepage.clickFashion();
        String actualUrl = driver.getCurrentUrl();

        Assert.assertEquals(actualUrl, expectedUrl);
    }
}




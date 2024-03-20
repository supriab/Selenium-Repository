import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends Base {

    @FindBy(xpath = "//li[@data-currenttabindex=\"4\"")
    WebElement fashion;

    void clickFashion(){
        fashion.click();
    }




}

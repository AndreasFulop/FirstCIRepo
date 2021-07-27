import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MenuPage {

    private static final By ENGLISH_BUTTON = By.id("js-link-box-en");

    public static void ClickEnglishButton() {
       // simple way: WebElement englishButton = driver.findElement(By.id("js-link-box-en"));
        WebElement englishButton = Util.GetDriver().findElement(ENGLISH_BUTTON);
        englishButton.click();
    }
}

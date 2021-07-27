import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MainPage {

    private static final By WIKIPEDIA_LINK = By.xpath("//*[@id=\"mp-welcome\"]/a");
    private static final By WELCOME_LABEL = By.xpath("//*[@id=\"mp-welcome\"]");

    public static void clickWikipediaLink() {
        WebElement wikiLink = Util.GetDriver().findElement(WIKIPEDIA_LINK);
        wikiLink.click();
    }

    public static String GetLabel(){
        WebElement label = Util.GetDriver().findElement(WELCOME_LABEL);
        return label.getText();
    }
}

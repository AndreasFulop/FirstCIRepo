import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WikipediaPage {
    private static final By WIKI_SUBTITLE = By.xpath("//*[@id=\"siteSub\"]");

    public static String GetSubtitle(){
        WebElement label = Util.GetDriver().findElement(WIKI_SUBTITLE);
        return label.getText();
    }
}

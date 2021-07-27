import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WikipediaTestPOM {
    @Test
    public void WikiTest() {
        Util.GetDriver().get("https://wikipedia.org/");
        MenuPage.ClickEnglishButton();
        String text = MainPage.GetLabel();
        Assertions.assertEquals("Welcome to Wikipedia,", text);

        MainPage.clickWikipediaLink();
        text = WikipediaPage.GetSubtitle();
        Assertions.assertEquals("From Wikipedia, the free encyclopedia", text);

        Util.CloseDriver();
    }


}

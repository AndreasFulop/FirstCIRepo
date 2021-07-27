import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WikipediaTestPOM {

    @Test
    public void WikiTest() {
        Util.GetDriver().get("https://wikipedia.org/");
        MenuPage.ClickEnglishButton();
        String text = MainPage.GetLabel();
        Assertions.assertEquals("Welcome to Wikipedia,", text);
    }

    @Test
    public void WikiTest2() {
        Util.GetDriver().get("https://wikipedia.org/");
        MenuPage.ClickEnglishButton();
        MainPage.clickWikipediaLink();
        String text = WikipediaPage.GetSubtitle();
        Assertions.assertEquals("From Wikipedia, the free encyclopedia", text);
    }

    @AfterEach
    public  void closing(){
    Util.CloseDriver();
    }

}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

import javax.jws.WebResult;
import java.util.List;

public class ExplorePage extends BasePage {

    @FindBy(xpath = "//div[@class='discoverableCard']")
    private WebElement card;

    @FindBy(xpath = "//div[@class='exploreMore']//a[contains(text(), 'show more')]")
    private WebElement showMoreResults;

    @FindBy(xpath = "//div[@class='exploreMore']//a[contains(text(), 'View All Trending')]")
    private WebElement viewAllTrinding;

    @FindBy(xpath = "//div[contains(@class, 'discoverableCard-title')]")
    private List<WebElement> listProject;

    public ExplorePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getCard() {
        return card;
    }

    public WebElement getShowMoreResults() {
        return showMoreResults;
    }

    public WebElement getViewAllTrinding() {
        return viewAllTrinding;
    }

    public List<WebElement> getListProject() {
        return listProject;
    }
}

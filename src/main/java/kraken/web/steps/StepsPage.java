package kraken.web.steps;

import Utils.KrakenWeb;
import kraken.web.pages.Pages;
import net.thucydides.core.annotations.Step;

import java.time.Duration;


public class StepsPage extends KrakenWeb {

    @Step
    public void openUrlPage(){
        obtenerDriver().get("https://www.youtube.com/");
    }

    @Step
    public void waitUntil(){
        // wait.until(ExpectedConditions.visibilityOfElementLocated(pages.getSearchs())).click();
    }
}

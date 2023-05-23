package kraken.web.pages;

import lombok.Getter;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@Getter
public class Pages extends PageObject {
    By searchs = By.id("search_query_top");

}

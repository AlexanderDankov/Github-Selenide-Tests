package com.simbirsoft.github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.itemWithText;
import static com.codeborne.selenide.Condition.cssClass;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SelenidePageTests {
    @Test
    public void softAssertionsPageShouldBeInListAndContainCode() {
        open("https://github.com/selenide/selenide");

        $("#wiki-tab").click();
        $$(".internal").shouldHave(itemWithText("Soft assertions"));

        $$(".internal").findBy(text("Soft assertions")).click();
        $(".markdown-body").find(byText("3. Using JUnit5 extend test class:")).sibling(0).shouldHave(cssClass("highlight-source-java"));

    }
}

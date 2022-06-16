package com.simbirsoft.herokuapp;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDropTests {
    @Test
    public void rectanglesShouldSwapPlaces() {
        open("https://the-internet.herokuapp.com/drag_and_drop");

        $("#columns").$("#column-a").dragAndDropTo("#column-b");
        $("#column-a").$("header").shouldHave(text("B"));
        $("#column-b").$("header").shouldHave(text("A"));

    }
}

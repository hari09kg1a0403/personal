package com.hari.json;

import org.junit.Test;

public class JsonHandlerTest {
    private JsonHandler jsonHandler = new JsonHandler();

    @Test
    public void testIsCheckIfJson() {
        jsonHandler.checkIfJson("{jsonAttribute:jsonValue}");
    }
}

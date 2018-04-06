package com.hari.json;

//import com.hari.json.JsonHandler;

public class JsonHandlerTest {
    JsonHandler jsonHandler = new JsonHandler();
    public void testIsCheckIfJson(){
        jsonHandler.checkIfJson("{jsonAttribute:jsonValue}");
    }
}

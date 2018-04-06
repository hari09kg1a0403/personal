package com.hari.json;

public class JsonHandler {

    public boolean checkIfJson(String jsonString){
        return jsonString.startsWith("{");
    }

}

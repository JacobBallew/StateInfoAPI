package com.ballew.StateInfoApi.domain;

public class StringToJSON {

    private String data;

    public StringToJSON(String data){
        this.data = data;
    }

    public static StringToJSON getAsJSON(String data){
        return new StringToJSON(data);
    }

    public String getData() {
        return data;
    }
}

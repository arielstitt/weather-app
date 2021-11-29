package com.tts.weatherapp.domain;

import lombok.Data;

@Data
public class Request {
    private String zipCode;

    @Override
    public String toString() {
        return "Request [zipCode=" + zipCode + "]";
    }
    public Request(){

    }
    public Request(String zipCode) {
        this.zipCode = zipCode;
    }
    public Object getZipCode() {
        return null;
    }
}

package ua.pp.darknsoft.controllers;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class MainController implements Serializable {

String test = "WORM";

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }
}

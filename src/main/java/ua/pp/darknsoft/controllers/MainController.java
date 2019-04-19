package ua.pp.darknsoft.controllers;

import org.springframework.stereotype.Component;

import javax.faces.bean.ManagedBean;
import java.io.Serializable;

@ManagedBean
public class MainController implements Serializable {

String test = "WORM";

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }
}

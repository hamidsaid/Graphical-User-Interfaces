package com.company;

import javax.swing.*;
import java.awt.*;

public class AwtDemo {

    Frame frame;

    public AwtDemo(){

        frame = new Frame("Create Account");

        //Components
        Label usernameLabel = new Label("Username");
        TextField username = new TextField(8);

        Label passwordLabel = new Label("Password");
        TextField password = new TextField(20);

        Button btn = new Button("Register");


        Choice choice =new Choice();
        choice.add("Male");
        choice.add("Female");
        choice.add("Non binary");



        //putting to the frame or container
        frame.setLayout(new FlowLayout());
        frame.add(usernameLabel);
        frame.add(username);
        frame.add(passwordLabel);
        frame.add(password);
        frame.add(btn);
        frame.add(choice);
        frame.pack();




    }

}

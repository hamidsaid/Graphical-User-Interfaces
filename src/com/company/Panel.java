package com.company;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Panel {
    Frame frame;
    Panel panel;
    public Panel(){
        panel = new Panel();
        frame = new Frame("AWT Panel");

        Button b1=new Button("Button 1");
        b1.setBounds(50,100,80,30);
        b1.setBackground(Color.yellow);
        Button b2=new Button("Button 2");
        b2.setBounds(100,100,80,30);
        b2.setBackground(Color.green);
//        panel.add(b1);
//        panel.add(b2);
//        frame.add(panel);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);

        IOException e = new FileNotFoundException();

}

}

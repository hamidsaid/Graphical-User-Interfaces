package com.company;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Calculator {

    JFrame frame;
    JPanel panel;

    public Calculator(){

        panel = new JPanel();
        frame = new JFrame("JPanel");

        //Components
        JTextField resultsField = new JTextField(40);
        JButton btn1 = new JButton("1");
        JButton btn2 = new JButton("2");
        JButton btn3 = new JButton("3");
        JButton btn4 = new JButton("4");
        JButton btn5 = new JButton("5");
        JButton btn6 = new JButton("6");
        JButton btn7 = new JButton("7");
        JButton btn8 = new JButton("8");
        JButton btn9 = new JButton("9");
        JButton btn0 = new JButton("0");
        JButton star = new JButton("*");
        JButton hashTag = new JButton("#");

        //properties
        panel.setBorder(new EmptyBorder(20,20,20,20));
        frame.setSize(300,300);
        frame.setResizable(false);
        frame.add(panel);


        //adding
        frame.setLayout(new GridLayout(3,3));
        //frame.add(resultsField);
        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);
        frame.add(btn4);
        frame.add(btn5);
        frame.add(btn6);
        frame.add(btn7);
        frame.add(btn8);
        frame.add(btn9);
        frame.add(star);
        frame.add(btn0);
        frame.add(hashTag);


    }
}

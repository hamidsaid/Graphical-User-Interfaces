package com.company;

import jdk.jshell.execution.Util;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here

        AwtDemo awtDemo= new AwtDemo();
        awtDemo.frame.setVisible(true);

        SwingDemo swingDemo = new SwingDemo();
        swingDemo.jFrame.setVisible(true);

        Calculator calculator = new Calculator();
        calculator.frame.setVisible(true);


    }

}

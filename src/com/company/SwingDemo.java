package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingDemo {
    JFrame jFrame;
    public SwingDemo(){
        jFrame = new JFrame("Register Form");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel usernameLabel = new JLabel("Username");
        JTextField username = new JTextField(12);

        JLabel passwordLabel = new JLabel("Password");
        JTextField password = new JTextField(12);

        JRadioButton jRadioButton = new JRadioButton("Up");
        JButton btn = new JButton("Register");
        btn.setBackground(Color.black);
        btn.setToolTipText("Become a member");
        btn.setForeground(Color.white);
        btn.setEnabled(false);

       btn.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               System.out.println("Btn Clicked");
           }
       });


        //layout
        jFrame.setLayout(new FlowLayout());
        jFrame.setSize(400,200);
        jFrame.add(usernameLabel);
        jFrame.add(username);
        jFrame.add(passwordLabel);
        jFrame.add(password);
        jFrame.add(jRadioButton);

        jFrame.add(btn);

    }
}

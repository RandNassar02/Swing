package org.example.swingtutorial;

import javax.swing.*;

public class TextFieldExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("TextField Example");

        JTextField t1,t2;
        t1=new JTextField("Welcome.");
        t1.setBounds(50,100, 200,30);
        t2=new JTextField("AWT Tutorial");
        t2.setBounds(50,150, 200,30);

        frame.add(t1);
        frame.add(t2);

        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}

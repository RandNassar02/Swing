package org.example.swingtutorial;

import javax.swing.*;

public class RadioButtonExample {
    JFrame frame;
    RadioButtonExample(){
        frame =new JFrame();
        JRadioButton radioButton1=new JRadioButton("A) Male");
        JRadioButton radioButton2=new JRadioButton("B) Female");
        radioButton1.setBounds(75,50,100,30);
        radioButton2.setBounds(75,100,100,30);
        ButtonGroup bg=new ButtonGroup();
        bg.add(radioButton1);bg.add(radioButton2);
        frame.add(radioButton1);
        frame.add(radioButton2);
        frame.setSize(300,300);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new RadioButtonExample();
    }
}
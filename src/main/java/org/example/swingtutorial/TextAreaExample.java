package org.example.swingtutorial;

import javax.swing.*;

public class TextAreaExample {
    TextAreaExample(){
        JFrame frame = new JFrame();
        JTextArea area = new JTextArea("Welcome..");

        area.setBounds(10,30,200,300);

        frame.add(area);

        frame.setSize(300,300);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new TextAreaExample();
    }
}

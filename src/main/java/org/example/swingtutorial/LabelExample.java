package org.example.swingtutorial;

import javax.swing.*;

public class LabelExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JLabel l1,l2;

        l1 = new JLabel("First Label..");
        l1.setBounds(50,50,100,30);
        l2 = new JLabel("Second Label..");
        l2.setBounds(50,100,100,30);

        frame.add(l1);
        frame.add(l2);

        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}

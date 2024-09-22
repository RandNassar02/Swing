package org.example.swingtutorial;

import javax.swing.*;
import java.awt.*;

public class SeparatorExample2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(0,1));
        JLabel label = new JLabel("This is a label");
        frame.add(label);
        JSeparator separator = new JSeparator();
        frame.add(separator);
        JLabel label2 = new JLabel("This is a label2");
        frame.add(label2);
        frame.setSize(400,100);
        frame.setVisible(true);
    }
}

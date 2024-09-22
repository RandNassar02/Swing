package org.example.swingtutorial;

import javax.swing.*;
import java.awt.*;

public class PanelExample {
    PanelExample() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setBounds(40,80,200,200);
        panel.setBackground(Color.gray);

        JButton button1 = new JButton("Button");
        button1.setBounds(50,100,80,30);
        button1.setBackground(Color.yellow);

        JButton button2=new JButton("Button 2");
        button2.setBounds(100,100,80,30);
        button2.setBackground(Color.green);

        panel.add(button1);
        panel.add(button2);
        frame.add(panel);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {

        new PanelExample();
    }
}

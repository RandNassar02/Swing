package org.example.swingtutorial;

import javax.swing.*;

public class ComboBoxExample {
    JFrame frame;
    ComboBoxExample(){
        frame =new JFrame("ComboBox Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String country[]={"A","B","C","D","E"};
        JComboBox cb=new JComboBox(country);
        cb.setBounds(50, 50,90,20);
        frame.add(cb);
        frame.setLayout(null);
        frame.setSize(400,500);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new ComboBoxExample();
    }
}


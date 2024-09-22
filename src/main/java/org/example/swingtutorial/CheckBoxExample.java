package org.example.swingtutorial;

import javax.swing.*;

public class CheckBoxExample {
    CheckBoxExample() {
        JFrame frame = new JFrame("CheckBox Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JCheckBox checkBox1 = new JCheckBox("C++");
        checkBox1.setBounds(100, 100, 50, 50);

        JCheckBox checkBox2 = new JCheckBox("Java", true);
        checkBox2.setBounds(100, 150, 50, 50);

        frame.add(checkBox1);
        frame.add(checkBox2);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new CheckBoxExample();
    }
}

package org.example.swingtutorial;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckBoxExample2 {
    CheckBoxExample2() {
        JFrame frame = new JFrame("CheckBox Example");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        final JLabel label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setSize(400, 100);
        JCheckBox checkbox1 = new JCheckBox("C++");
        checkbox1.setBounds(150, 100, 50, 50);
        JCheckBox checkbox2 = new JCheckBox("Java");
        checkbox2.setBounds(150, 150, 50, 50);

        frame.add(checkbox1);
        frame.add(checkbox2);
        frame.add(label);

        checkbox1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                label.setText("C++ Checkbox: "
                        + (e.getStateChange() == 1 ? "checked" : "unchecked"));
            }
        });
        checkbox2.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                label.setText("Java Checkbox: "
                        + (e.getStateChange() == 1 ? "checked" : "unchecked"));
            }
        });
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new CheckBoxExample2();
    }
}

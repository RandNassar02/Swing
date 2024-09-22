package org.example.swingtutorial;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButtonExample2 extends JFrame implements ActionListener {
    JRadioButton radioButton1, radioButton2;
    JButton button;

    RadioButtonExample2() {
        radioButton1 = new JRadioButton("Male");
        radioButton1.setBounds(100, 50, 100, 30);

        radioButton2 = new JRadioButton("Female");
        radioButton2.setBounds(100, 100, 100, 30);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);

        button = new JButton("click");
        button.setBounds(100, 150, 80, 30);
        button.addActionListener(this);
        add(radioButton1);
        add(radioButton2);
        add(button);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        if (radioButton1.isSelected()) {
            JOptionPane.showMessageDialog(this, "You are Male.");
        }
        if (radioButton2.isSelected()) {
            JOptionPane.showMessageDialog(this, "You are Female.");
        }
    }

    public static void main(String[] args) {
        new RadioButtonExample2();
    }
}

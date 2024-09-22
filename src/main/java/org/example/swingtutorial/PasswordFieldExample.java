package org.example.swingtutorial;

import javax.swing.*;

public class PasswordFieldExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPasswordField passwordField = new JPasswordField();
        passwordField.setEchoChar('*');
        JLabel label = new JLabel("Password:");
        label.setBounds(20,100,80,30);
        passwordField.setBounds(100,100,100,30);
        frame.add(label);
        frame.add(passwordField);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

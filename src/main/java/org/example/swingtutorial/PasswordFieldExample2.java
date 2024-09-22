package org.example.swingtutorial;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PasswordFieldExample2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Password Field Example");
        final JLabel label = new JLabel();
        label.setBounds(20, 150, 200, 50);

        final JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(100, 75, 100, 30);

        JLabel label1 = new JLabel("Username:");
        label1.setBounds(20, 20, 80, 30);

        JLabel label2 = new JLabel("Password:");
        label2.setBounds(20, 75, 80, 30);

        JButton button = new JButton("Login");
        button.setBounds(100, 120, 80, 30);

        final JTextField text = new JTextField();
        text.setBounds(100, 20, 100, 30);
        frame.add(passwordField);
        frame.add(label1);
        frame.add(label);
        frame.add(label2);
        frame.add(button);
        frame.add(text);

        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String data = "Username " + text.getText();
                data += ", Password: "
                        + new String(passwordField.getPassword());
                label.setText(data);
            }
        });
    }
}

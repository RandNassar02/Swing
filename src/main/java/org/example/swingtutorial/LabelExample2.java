package org.example.swingtutorial;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.UnknownHostException;

public class LabelExample2 extends Frame implements ActionListener {

    JTextField textField;
    JLabel label;
    JButton button;

    LabelExample2() {
        textField = new JTextField();
        textField.setBounds(50,50,150,20);
        label = new JLabel();
        label.setBounds(50,100,150,20);
        button = new JButton("Find IP");
        button.setBounds(50,150,95,30);
        button.addActionListener(this);

        add(label);
        add(textField);
        add(button);

        setSize(400, 400);
        setLayout(null);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String host = textField.getText();
            String ip=java.net.InetAddress.getByName(host).getHostAddress();
            label.setText("IP "+ip);
        } catch (UnknownHostException ex) {
            throw new RuntimeException(ex);
        }
    }

    public static void main(String[] args) {
        new LabelExample2();
    }
}
